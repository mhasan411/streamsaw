package com.streamsaw.ui.player.interfaces;


import com.streamsaw.data.model.ads.AdMediaModel;

/**
 * Created by allensun on 7/24/17.
 * This is a strategy to use two ExoPlayer in layer, one is to show main content, the other one is to show video ad.
 */
public interface DoublePlayerInterface {

    /**
     * prepare the {@link AdMediaModel} to have the {@link com.google.android.exoplayer2.source.MediaSource} insert into it.
     *
     * @param ads the adMediaModel.
     */
    void onPrepareAds(AdMediaModel ads);

    void prepareFSM();

}
