/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.easyplex.ui.player.utilities;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;

import androidx.annotation.Nullable;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

import timber.log.Timber;

/**
 * Logs player events using {@link Log}.
 */
public class EventLogger implements AnalyticsListener,
        MediaSourceEventListener,
        MetadataOutput {


    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;

    static {
        TIME_FORMAT = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT.setMinimumFractionDigits(2);
        TIME_FORMAT.setMaximumFractionDigits(2);
        TIME_FORMAT.setGroupingUsed(false);
    }

    private final MappingTrackSelector trackSelector;
    private final Timeline.Window window;
    private final Timeline.Period period;
    private final long startTimeMs;

    public EventLogger(@Nullable MappingTrackSelector trackSelector) {
        this.trackSelector = trackSelector;
        window = new Timeline.Window();
        period = new Timeline.Period();
        startTimeMs = SystemClock.elapsedRealtime();
    }

    // ExoPlayer.EventListener

    private static String getTimeString(long timeMs) {
        return timeMs == C.TIME_UNSET ? "?" : TIME_FORMAT.format((timeMs) / 1000f);
    }

    private static String getStateString(int state) {
        switch (state) {
            case Player.STATE_BUFFERING:
                return "B";
            case Player.STATE_ENDED:
                return "E";
            case Player.STATE_IDLE:
                return "I";
            case Player.STATE_READY:
                return "R";
            default:
                return "?";
        }
    }

    private static String getFormatSupportString(int formatSupport) {
        switch (formatSupport) {
            case RendererCapabilities.FORMAT_HANDLED:
                return "YES";
            case RendererCapabilities.FORMAT_EXCEEDS_CAPABILITIES:
                return "NO_EXCEEDS_CAPABILITIES";
            case RendererCapabilities.FORMAT_UNSUPPORTED_SUBTYPE:
                return "NO_UNSUPPORTED_TYPE";
            case RendererCapabilities.FORMAT_UNSUPPORTED_TYPE:
                return "NO";
            default:
                return "?";
        }
    }

    private static String getAdaptiveSupportString(int trackCount, int adaptiveSupport) {
        if (trackCount < 2) {
            return "N/A";
        }
        switch (adaptiveSupport) {
            case RendererCapabilities.ADAPTIVE_SEAMLESS:
                return "YES";
            case RendererCapabilities.ADAPTIVE_NOT_SEAMLESS:
                return "YES_NOT_SEAMLESS";
            case RendererCapabilities.ADAPTIVE_NOT_SUPPORTED:
                return "NO";
            default:
                return "?";
        }
    }

    private static String getTrackStatusString(TrackSelection selection, TrackGroup group,
                                               int trackIndex) {
        return getTrackStatusString(selection != null && selection.getTrackGroup() == group
                && selection.indexOf(trackIndex) != C.INDEX_UNSET);
    }

    private static String getTrackStatusString(boolean enabled) {
        return enabled ? "[X]" : "[ ]";
    }

    @Override
    public void onLoadingChanged(EventTime eventTime, boolean isLoading) {
        Timber.d("loading [" + isLoading + "]");
    }

    @Override
    public void onPlayerStateChanged(EventTime eventTime, boolean playWhenReady, int playbackState) {
        Timber.d("state [" + getSessionTimeString() + ", " + playWhenReady + ", "
                + getStateString(playbackState) + "]");
    }

    @Override
    public void onRepeatModeChanged(final EventTime eventTime, final int repeatMode) {

        // Do Nothing

    }

    @Override
    public void onShuffleModeChanged(final EventTime eventTime, final boolean shuffleModeEnabled) {

        // Do Nothing

    }

    // AudioRendererEventListener

    @Override
    public void onPositionDiscontinuity(final EventTime eventTime, final int reason) {
        Timber.d("positionDiscontinuity");
    }

    @Override
    public void onSeekStarted(final EventTime eventTime) {
                // Do Nothing
    }

    @Override
    public void onPlaybackParametersChanged(EventTime eventTime, PlaybackParameters playbackParameters) {

        // Do Nothing

    }

    @Override
    public void onSeekProcessed(final EventTime eventTime) {

        // Do Nothing

    }

    @Override
    public void onTimelineChanged(EventTime eventTime, final int reason) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        Timber.d("sourceInfo [periodCount=" + periodCount + ", windowCount=" + windowCount);
        for (int i = 0; i < Math.min(periodCount, MAX_TIMELINE_ITEM_LINES); i++) {
            eventTime.timeline.getPeriod(i, period);
            Timber.d("  " + "period [" + getTimeString(period.getDurationMs()) + "]");
        }
        if (periodCount > MAX_TIMELINE_ITEM_LINES) {
            Timber.d("  ...");
        }
        for (int i = 0; i < Math.min(windowCount, MAX_TIMELINE_ITEM_LINES); i++) {
            eventTime.timeline.getWindow(i, window);
            Timber.d("  " + "window [" + getTimeString(window.getDurationMs()) + ", "
                    + window.isSeekable + ", " + window.isDynamic + "]");
        }
        if (windowCount > MAX_TIMELINE_ITEM_LINES) {
            Timber.d("  ...");
        }
        Timber.d("]");
    }

    @Override
    public void onPlayerError(EventTime eventTime, ExoPlaybackException e) {
        Timber.e(e, "playerFailed [" + getSessionTimeString() + "]");
    }

    @Override
    public void onTracksChanged(EventTime eventTime, TrackGroupArray ignored, TrackSelectionArray trackSelections) {
        if (trackSelector == null) {
            Timber.d("Track selector is null");
            return;
        }
        MappedTrackInfo mappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
        if (mappedTrackInfo == null) {
            Timber.d("Tracks []");
            return;
        }
        Timber.d("Tracks [");
        // Log tracks associated to renderers.
            setRenderAcess(mappedTrackInfo,trackSelections);
        // Log tracks not associated with a renderer.
        TrackGroupArray unassociatedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        if (unassociatedTrackGroups.length > 0) {
            Timber.d("  Renderer:None [");
            for (int groupIndex = 0; groupIndex < unassociatedTrackGroups.length; groupIndex++) {
                Timber.d("    Group:" + groupIndex + " [");
                TrackGroup trackGroup = unassociatedTrackGroups.get(groupIndex);
                for (int trackIndex = 0; trackIndex < trackGroup.length; trackIndex++) {
                    String status = getTrackStatusString(false);
                    String formatSupport = getFormatSupportString(
                            RendererCapabilities.FORMAT_UNSUPPORTED_TYPE);
                    Timber.d("      " + status + " Track:" + trackIndex + ", "
                            + Format.toLogString(trackGroup.getFormat(trackIndex))
                            + ", supported=" + formatSupport);
                }
                Timber.d("    ]");
            }
            Timber.d("  ]");
        }
        Timber.d("]");
    }

    private void setRenderAcess(MappedTrackInfo mappedTrackInfo, TrackSelectionArray trackSelections) {

        for (int rendererIndex = 0; rendererIndex < mappedTrackInfo.getRendererCount(); rendererIndex++) {
            TrackGroupArray rendererTrackGroups = mappedTrackInfo.getTrackGroups(rendererIndex);
            TrackSelection trackSelection = trackSelections.get(rendererIndex);
            if (rendererTrackGroups.length > 0) {
                Timber.d("  Renderer:" + rendererIndex + " [");
                for (int groupIndex = 0; groupIndex < rendererTrackGroups.length; groupIndex++) {
                    TrackGroup trackGroup = rendererTrackGroups.get(groupIndex);
                    String adaptiveSupport = getAdaptiveSupportString(trackGroup.length,
                            mappedTrackInfo.getAdaptiveSupport(rendererIndex, groupIndex, false));
                    Timber.d("    Group:" + groupIndex + ", adaptive_supported=" + adaptiveSupport + " [");
                    for (int trackIndex = 0; trackIndex < trackGroup.length; trackIndex++) {
                        String status = getTrackStatusString(trackSelection, trackGroup, trackIndex);
                        String formatSupport = getFormatSupportString(
                                mappedTrackInfo.getTrackSupport(rendererIndex, groupIndex, trackIndex));
                        Timber.d("" + status + " Track:" + trackIndex + ", "
                                + Format.toLogString(trackGroup.getFormat(trackIndex))
                                + ", supported=" + formatSupport);
                    }
                    Timber.d("");
                }
                // Log metadata for at most one of the tracks selected for the renderer.
                setTrackSeletion(trackSelection);
                Timber.d("  ]");
            }
        }
    }

    private void setTrackSeletion(TrackSelection trackSelection) {

        if (trackSelection != null) {
            for (int selectionIndex = 0; selectionIndex < trackSelection.length(); selectionIndex++) {
                Metadata metadata = trackSelection.getFormat(selectionIndex).metadata;
                if (metadata != null) {
                    Timber.d("    Metadata [");
                    printMetadata(metadata, "      ");
                    Timber.d("    ]");
                    break;
                }
            }
        }
    }

    @Override
    public void onLoadStarted(final EventTime eventTime,
                              final LoadEventInfo loadEventInfo,
                              final MediaLoadData mediaLoadData) {

        // Do Nothing

    }

    @Override
    public void onLoadCompleted(final EventTime eventTime,
                                final LoadEventInfo loadEventInfo,
                                final MediaLoadData mediaLoadData) {
            // Do Nothing
    }

    @Override
    public void onLoadCanceled(final EventTime eventTime,
                               final LoadEventInfo loadEventInfo,
                               final MediaLoadData mediaLoadData) {
        // Do Nothing
    }

    @Override
    public void onMetadata(Metadata metadata) {
        Timber.d("onMetadata [");
        printMetadata(metadata, "  ");
        Timber.d("]");
    }

    private void printInternalError(Exception e) {
        Timber.e(e, "internalError [" + getSessionTimeString() + ", " + "loadError" + "]");
    }

    @SuppressLint({"StringFormatInTimber", "DefaultLocale"})
    private void printMetadata(Metadata metadata, String prefix) {
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                Timber.d("%s%s", prefix, String.format("%s: value=%s", textInformationFrame.id,
                        textInformationFrame.value));
            } else if (entry instanceof UrlLinkFrame) {
                UrlLinkFrame urlLinkFrame = (UrlLinkFrame) entry;
                Timber.d("%s%s", prefix, String.format("%s: url=%s", urlLinkFrame.id, urlLinkFrame.url));
            } else if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                Timber.d("%s%s", prefix, String.format("%s: owner=%s", privFrame.id, privFrame.owner));
            } else if (entry instanceof GeobFrame) {
                GeobFrame geobFrame = (GeobFrame) entry;
                Timber.d("%s%s", prefix, String.format("%s: mimeType=%s, filename=%s, description=%s",
                        geobFrame.id, geobFrame.mimeType, geobFrame.filename, geobFrame.description));
            } else if (entry instanceof ApicFrame) {
                ApicFrame apicFrame = (ApicFrame) entry;
                Timber.d("%s%s", prefix, String.format("%s: mimeType=%s, description=%s",
                        apicFrame.id, apicFrame.mimeType, apicFrame.description));
            } else if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                Timber.d("%s%s", prefix, String.format("%s: language=%s, description=%s", commentFrame.id,
                        commentFrame.language, commentFrame.description));
            } else if (entry instanceof Id3Frame) {
                Id3Frame id3Frame = (Id3Frame) entry;
                Timber.d("%s%s", prefix, String.format("%s", id3Frame.id));
            } else if (entry instanceof EventMessage) {
                EventMessage eventMessage = (EventMessage) entry;
                Timber.d("%s%s", prefix, String.format("EMSG: scheme=%s, id=%d, value=%s",
                        eventMessage.schemeIdUri, eventMessage.id, eventMessage.value));
            }
        }
    }

    private String getSessionTimeString() {
        return getTimeString(SystemClock.elapsedRealtime() - startTimeMs);
    }

    @Override
    public void onMediaPeriodCreated(final int windowIndex, final MediaSource.MediaPeriodId mediaPeriodId) {
                    // Do Nothing
    }

    @Override
    public void onMediaPeriodReleased(final int windowIndex, final MediaSource.MediaPeriodId mediaPeriodId) {
        // Do Nothing
    }

    @Override
    public void onLoadStarted(final int windowIndex, @Nullable final MediaSource.MediaPeriodId mediaPeriodId,
                              final LoadEventInfo loadEventInfo,
                              final MediaLoadData mediaLoadData) {
        // Do Nothing
    }

    @Override
    public void onLoadCompleted(final int windowIndex, @Nullable final MediaSource.MediaPeriodId mediaPeriodId,
                                final LoadEventInfo loadEventInfo,
                                final MediaLoadData mediaLoadData) {


        // Do Nothing

    }

    @Override
    public void onLoadCanceled(final int windowIndex, @Nullable final MediaSource.MediaPeriodId mediaPeriodId,
                               final LoadEventInfo loadEventInfo,
                               final MediaLoadData mediaLoadData) {


        // Do Nothing

    }

    @Override
    public void onLoadError(final int windowIndex, @Nullable final MediaSource.MediaPeriodId mediaPeriodId,
                            final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData,
                            final IOException error, final boolean wasCanceled) {

        // Do Nothing

    }

    @Override
    public void onReadingStarted(final int windowIndex, final MediaSource.MediaPeriodId mediaPeriodId) {


        // Do Nothing

    }

    @Override
    public void onUpstreamDiscarded(final int windowIndex, final MediaSource.MediaPeriodId mediaPeriodId,
                                    final MediaLoadData mediaLoadData) {


        // Do Nothing

    }

    @Override
    public void onDownstreamFormatChanged(final int windowIndex,
                                          @Nullable final MediaSource.MediaPeriodId mediaPeriodId,
                                          final MediaLoadData mediaLoadData) {


        // Do Nothing

    }

    @Override
    public void onLoadError(EventTime eventTime,
                            LoadEventInfo loadEventInfo,
                            MediaLoadData mediaLoadData,
                            IOException error,
                            boolean wasCanceled) {
        printInternalError(error);
    }

    @Override
    public void onDownstreamFormatChanged(final EventTime eventTime,
                                          final MediaLoadData mediaLoadData) {

        // Do Nothing

    }

    @Override
    public void onUpstreamDiscarded(final EventTime eventTime,
                                    final MediaLoadData mediaLoadData) {


        // Do Nothing

    }

    @Override
    public void onMediaPeriodCreated(final EventTime eventTime) {

        // Do Nothing

    }

    @Override
    public void onMediaPeriodReleased(final EventTime eventTime) {

        // Do Nothing

    }

    @Override
    public void onReadingStarted(final EventTime eventTime) {

        // Do Nothing

    }

    @Override
    public void onBandwidthEstimate(final EventTime eventTime, final int totalLoadTimeMs, final long totalBytesLoaded,
                                    final long bitrateEstimate) {


        // Do Nothing

    }


    @Override
    public void onMetadata(final EventTime eventTime, final Metadata metadata) {

        // Do Nothing

    }

    @Override
    public void onDecoderEnabled(final EventTime eventTime, final int trackType,
                                 final DecoderCounters decoderCounters) {

        // Do Nothing

    }

    @Override
    public void onDecoderInitialized(final EventTime eventTime, final int trackType, final String decoderName,
                                     final long initializationDurationMs) {

        // Do Nothing

    }

    @Override
    public void onDecoderInputFormatChanged(final EventTime eventTime, final int trackType, final Format format) {

        // Do Nothing

    }

    @Override
    public void onDecoderDisabled(final EventTime eventTime, final int trackType,
                                  final DecoderCounters decoderCounters) {

        // Do Nothing

    }

    @Override
    public void onAudioSessionId(final EventTime eventTime, final int audioSessionId) {


        // Do Nothing

    }

    @Override
    public void onAudioUnderrun(final EventTime eventTime, final int bufferSize, final long bufferSizeMs,
                                final long elapsedSinceLastFeedMs) {

        // Do Nothing

    }

    @Override
    public void onDroppedVideoFrames(final EventTime eventTime, final int droppedFrames, final long elapsedMs) {

        // Do Nothing

    }

    @Override
    public void onVideoSizeChanged(final EventTime eventTime, final int width, final int height,
                                   final int unappliedRotationDegrees, final float pixelWidthHeightRatio) {

        // Do Nothing

    }

    @Override
    public void onRenderedFirstFrame(final EventTime eventTime, final Surface surface) {

        // Do Nothing

    }

    @Override
    public void onDrmKeysLoaded(final EventTime eventTime) {

        // Do Nothing

    }

    @Override
    public void onDrmSessionManagerError(final EventTime eventTime, final Exception error) {

        // Do Nothing

    }

    @Override
    public void onDrmKeysRestored(final EventTime eventTime) {

        // Do Nothing

    }

    @Override
    public void onDrmKeysRemoved(final EventTime eventTime) {

        // Do Nothing

    }

}