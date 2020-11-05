package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UiControllerViewBindingImpl extends UiControllerViewBinding implements com.streamsaw.generated.callback.OnClickListener.Listener, com.streamsaw.generated.callback.OnTouchListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.controller_panel, 51);
        sViewsWithIds.put(R.id.main_nav_host_fragment, 52);
        sViewsWithIds.put(R.id.media_route_button, 53);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_top, 54);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 55);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 56);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 57);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 58);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 59);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final com.streamsaw.ui.player.views.AddToMyListmageButton mboundView16;
    @NonNull
    private final android.widget.LinearLayout mboundView18;
    @NonNull
    private final android.widget.ImageButton mboundView25;
    @NonNull
    private final android.widget.TextView mboundView26;
    @NonNull
    private final android.widget.ImageButton mboundView34;
    @NonNull
    private final android.widget.TextView mboundView35;
    @NonNull
    private final android.widget.ImageButton mboundView37;
    @NonNull
    private final android.widget.TextView mboundView38;
    @NonNull
    private final android.widget.ImageButton mboundView40;
    @NonNull
    private final android.widget.TextView mboundView41;
    @NonNull
    private final android.widget.TextView mboundView48;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnTouchListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    private OnProgressChangedImpl mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged;
    private OnStartTrackingTouchImpl mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch;
    private OnStopTrackingTouchImpl mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch;
    // Inverse Binding Event Handlers

    public UiControllerViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 60, sIncludes, sViewsWithIds));
    }
    private UiControllerViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 19
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[51]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[47]
            , (android.widget.FrameLayout) bindings[52]
            , (androidx.mediarouter.app.MediaRouteButton) bindings[53]
            , (android.widget.FrameLayout) bindings[45]
            , (android.widget.ProgressBar) bindings[49]
            , (android.widget.TextView) bindings[46]
            , (androidx.constraintlayout.widget.Guideline) bindings[57]
            , (androidx.constraintlayout.widget.Guideline) bindings[55]
            , (androidx.constraintlayout.widget.Guideline) bindings[56]
            , (androidx.constraintlayout.widget.Guideline) bindings[58]
            , (androidx.constraintlayout.widget.Guideline) bindings[59]
            , (androidx.constraintlayout.widget.Guideline) bindings[54]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageButton) bindings[28]
            , (android.widget.ImageButton) bindings[22]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[23]
            , (android.widget.ImageButton) bindings[13]
            , (com.tubitv.ui.TubiLoadingView) bindings[50]
            , (android.widget.ImageView) bindings[10]
            , (com.streamsaw.ui.player.views.PlayStateImageButton) bindings[12]
            , (android.widget.TextView) bindings[44]
            , (android.widget.ImageButton) bindings[11]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.SeekBar) bindings[43]
            , (android.widget.ImageButton) bindings[31]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[20]
            , (android.widget.ImageButton) bindings[19]
            , (com.streamsaw.ui.player.views.SubstitleImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[42]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            );
        this.exoArtwork.setTag(null);
        this.imageViewMovieNext.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView16 = (com.streamsaw.ui.player.views.AddToMyListmageButton) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView18 = (android.widget.LinearLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView25 = (android.widget.ImageButton) bindings[25];
        this.mboundView25.setTag(null);
        this.mboundView26 = (android.widget.TextView) bindings[26];
        this.mboundView26.setTag(null);
        this.mboundView34 = (android.widget.ImageButton) bindings[34];
        this.mboundView34.setTag(null);
        this.mboundView35 = (android.widget.TextView) bindings[35];
        this.mboundView35.setTag(null);
        this.mboundView37 = (android.widget.ImageButton) bindings[37];
        this.mboundView37.setTag(null);
        this.mboundView38 = (android.widget.TextView) bindings[38];
        this.mboundView38.setTag(null);
        this.mboundView40 = (android.widget.ImageButton) bindings[40];
        this.mboundView40.setTag(null);
        this.mboundView41 = (android.widget.TextView) bindings[41];
        this.mboundView41.setTag(null);
        this.mboundView48 = (android.widget.TextView) bindings[48];
        this.mboundView48.setTag(null);
        this.nextPlayFramelayout.setTag(null);
        this.progressBar.setTag(null);
        this.textViewVideoTimeRemaining.setTag(null);
        this.viewAddMyList.setTag(null);
        this.viewAudioVideoSubs.setTag(null);
        this.viewEpisodes.setTag(null);
        this.viewEpisodesAnimes.setTag(null);
        this.viewIslive.setTag(null);
        this.viewMoviesList.setTag(null);
        this.viewNextEpisode.setTag(null);
        this.viewNextEpisodeAnimes.setTag(null);
        this.viewStreaming.setTag(null);
        this.viewTextAddMylistSream.setTag(null);
        this.viewTubiControllerAppSettings.setTag(null);
        this.viewTubiControllerClose.setTag(null);
        this.viewTubiControllerElapsedTime.setTag(null);
        this.viewTubiControllerEpisodes.setTag(null);
        this.viewTubiControllerEpisodesAnimes.setTag(null);
        this.viewTubiControllerEpisodesText.setTag(null);
        this.viewTubiControllerEpisodesTextAnimes.setTag(null);
        this.viewTubiControllerForwardIb.setTag(null);
        this.viewTubiControllerLoading.setTag(null);
        this.viewTubiControllerMediaTvAudio.setTag(null);
        this.viewTubiControllerPlayToggleIb.setTag(null);
        this.viewTubiControllerRemainingTime.setTag(null);
        this.viewTubiControllerRewindIb.setTag(null);
        this.viewTubiControllerScaleIb.setTag(null);
        this.viewTubiControllerSeekBar.setTag(null);
        this.viewTubiControllerStreaming.setTag(null);
        this.viewTubiControllerStreamingText.setTag(null);
        this.viewTubiControllerSubstitleCurentLang.setTag(null);
        this.viewTubiControllerSubstitlesIcon.setTag(null);
        this.viewTubiControllerSubtitlesIb.setTag(null);
        this.viewTubiControllerSubtitlesIbIb.setTag(null);
        this.viewTubiControllerTitle.setTag(null);
        this.viewTubiControllerVideoIb.setTag(null);
        this.viewTubiControllerVideoSubstitleDialog.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.streamsaw.generated.callback.OnClickListener(this, 27);
        mCallback39 = new com.streamsaw.generated.callback.OnTouchListener(this, 39);
        mCallback15 = new com.streamsaw.generated.callback.OnClickListener(this, 15);
        mCallback16 = new com.streamsaw.generated.callback.OnClickListener(this, 16);
        mCallback28 = new com.streamsaw.generated.callback.OnClickListener(this, 28);
        mCallback9 = new com.streamsaw.generated.callback.OnClickListener(this, 9);
        mCallback25 = new com.streamsaw.generated.callback.OnClickListener(this, 25);
        mCallback37 = new com.streamsaw.generated.callback.OnClickListener(this, 37);
        mCallback13 = new com.streamsaw.generated.callback.OnClickListener(this, 13);
        mCallback8 = new com.streamsaw.generated.callback.OnClickListener(this, 8);
        mCallback38 = new com.streamsaw.generated.callback.OnClickListener(this, 38);
        mCallback14 = new com.streamsaw.generated.callback.OnClickListener(this, 14);
        mCallback26 = new com.streamsaw.generated.callback.OnClickListener(this, 26);
        mCallback7 = new com.streamsaw.generated.callback.OnClickListener(this, 7);
        mCallback23 = new com.streamsaw.generated.callback.OnClickListener(this, 23);
        mCallback35 = new com.streamsaw.generated.callback.OnClickListener(this, 35);
        mCallback11 = new com.streamsaw.generated.callback.OnClickListener(this, 11);
        mCallback36 = new com.streamsaw.generated.callback.OnClickListener(this, 36);
        mCallback12 = new com.streamsaw.generated.callback.OnClickListener(this, 12);
        mCallback24 = new com.streamsaw.generated.callback.OnClickListener(this, 24);
        mCallback21 = new com.streamsaw.generated.callback.OnClickListener(this, 21);
        mCallback33 = new com.streamsaw.generated.callback.OnClickListener(this, 33);
        mCallback20 = new com.streamsaw.generated.callback.OnClickListener(this, 20);
        mCallback34 = new com.streamsaw.generated.callback.OnClickListener(this, 34);
        mCallback10 = new com.streamsaw.generated.callback.OnClickListener(this, 10);
        mCallback22 = new com.streamsaw.generated.callback.OnClickListener(this, 22);
        mCallback2 = new com.streamsaw.generated.callback.OnClickListener(this, 2);
        mCallback30 = new com.streamsaw.generated.callback.OnClickListener(this, 30);
        mCallback32 = new com.streamsaw.generated.callback.OnClickListener(this, 32);
        mCallback1 = new com.streamsaw.generated.callback.OnClickListener(this, 1);
        mCallback31 = new com.streamsaw.generated.callback.OnClickListener(this, 31);
        mCallback19 = new com.streamsaw.generated.callback.OnClickListener(this, 19);
        mCallback6 = new com.streamsaw.generated.callback.OnClickListener(this, 6);
        mCallback5 = new com.streamsaw.generated.callback.OnClickListener(this, 5);
        mCallback17 = new com.streamsaw.generated.callback.OnClickListener(this, 17);
        mCallback29 = new com.streamsaw.generated.callback.OnClickListener(this, 29);
        mCallback4 = new com.streamsaw.generated.callback.OnClickListener(this, 4);
        mCallback18 = new com.streamsaw.generated.callback.OnClickListener(this, 18);
        mCallback3 = new com.streamsaw.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100000L;
                mDirtyFlags_1 = 0x0L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.controller == variableId) {
            setController((com.streamsaw.ui.player.bindings.PlayerController) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setController(@Nullable com.streamsaw.ui.player.bindings.PlayerController Controller) {
        this.mController = Controller;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.controller);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControllerCurrentMediaCover((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeControllerVideoName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeControllerMediaPositionInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeControllerIsMediaSubstitleEnabled((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeControllerMediaBufferedPosition((androidx.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 5 :
                return onChangeControllerVideoCurrentSubs((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeControllerAdsRemainInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeControllerIsLive((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeControllerMediaEnded((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeControllerMediaRemainInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeControllerMediaHasSubstitle((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeControllerAddtomylist((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeControllerMediaCurrentTime((androidx.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 13 :
                return onChangeControllerIsStreamOnFavorite((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeControllerIsCurrentAd((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 15 :
                return onChangeControllerMediaDuration((androidx.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 16 :
                return onChangeControllerPlayerPlaybackState((androidx.databinding.ObservableInt) object, fieldId);
            case 17 :
                return onChangeControllerVideoHasID((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 18 :
                return onChangeControllerIsVideoPlayWhenReady((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerCurrentMediaCover(androidx.databinding.ObservableField<java.lang.String> ControllerCurrentMediaCover, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerVideoName(androidx.databinding.ObservableField<java.lang.String> ControllerVideoName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaPositionInString(androidx.databinding.ObservableField<java.lang.String> ControllerMediaPositionInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsMediaSubstitleEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsMediaSubstitleEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaBufferedPosition(androidx.databinding.ObservableField<java.lang.Long> ControllerMediaBufferedPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerVideoCurrentSubs(androidx.databinding.ObservableField<java.lang.String> ControllerVideoCurrentSubs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerAdsRemainInString(androidx.databinding.ObservableField<java.lang.String> ControllerAdsRemainInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsLive(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsLive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaEnded(androidx.databinding.ObservableField<java.lang.Boolean> ControllerMediaEnded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaRemainInString(androidx.databinding.ObservableField<java.lang.String> ControllerMediaRemainInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaHasSubstitle(androidx.databinding.ObservableField<java.lang.Boolean> ControllerMediaHasSubstitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerAddtomylist(androidx.databinding.ObservableField<java.lang.String> ControllerAddtomylist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaCurrentTime(androidx.databinding.ObservableField<java.lang.Long> ControllerMediaCurrentTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsStreamOnFavorite(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsStreamOnFavorite, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsCurrentAd(androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsCurrentAd, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerMediaDuration(androidx.databinding.ObservableField<java.lang.Long> ControllerMediaDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerPlayerPlaybackState(androidx.databinding.ObservableInt ControllerPlayerPlaybackState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerVideoHasID(androidx.databinding.ObservableField<java.lang.Boolean> ControllerVideoHasID, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerIsVideoPlayWhenReady(androidx.databinding.ObservableBoolean ControllerIsVideoPlayWhenReady, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        long dirtyFlags_1 = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
            dirtyFlags_1 = mDirtyFlags_1;
            mDirtyFlags_1 = 0;
        }
        int controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDEDViewVISIBLEViewGONE = 0;
        java.lang.Long controllerMediaCurrentTimeGet = null;
        androidx.databinding.ObservableField<java.lang.String> controllerCurrentMediaCover = null;
        androidx.databinding.ObservableField<java.lang.String> controllerVideoName = null;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEIDLE = false;
        androidx.databinding.ObservableField<java.lang.String> controllerMediaPositionInString = null;
        boolean controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming = false;
        int controllerIsCurrentAdViewVISIBLEViewINVISIBLE = 0;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEIDLE = false;
        int controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1BooleanTrueControllerMediaTypeEqualsJavaLangStringAnimeViewVISIBLEViewGONE = 0;
        boolean controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalse = false;
        java.lang.String controllerMediaType = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsMediaSubstitleEnabled = null;
        androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged controllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = false;
        boolean controllerIsCurrentAd = false;
        boolean controllerIsVideoPlayWhenReadyGet = false;
        androidx.databinding.ObservableField<java.lang.Long> controllerMediaBufferedPosition = null;
        androidx.databinding.ObservableField<java.lang.String> controllerVideoCurrentSubs = null;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED = false;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING = false;
        int controllerIsLiveViewVISIBLEViewGONE = 0;
        boolean controllerMediaTypeEqualsJavaLangString1 = false;
        androidx.databinding.ObservableField<java.lang.String> controllerAdsRemainInString = null;
        boolean controllerMediaTypeEqualsJavaLangStringStreaming = false;
        boolean controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        boolean controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse = false;
        int controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsLive = null;
        java.lang.String controllerMediaRemainInStringJavaLangObjectNullViewTubiControllerRemainingTimeAndroidStringControllerTimePositionTextDefaultControllerMediaRemainInString = null;
        java.lang.String controllerVideoNameGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerMediaEnded = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet = false;
        androidx.databinding.ObservableField<java.lang.String> controllerMediaRemainInString = null;
        int controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = 0;
        int controllerIsCurrentAdViewINVISIBLEViewVISIBLE = 0;
        java.lang.Long controllerMediaBufferedPositionGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerMediaHasSubstitle = null;
        androidx.databinding.ObservableField<java.lang.String> controllerAddtomylist = null;
        long androidxDatabindingViewDataBindingSafeUnboxControllerMediaDurationGet = 0;
        java.lang.String controllerAddtomylistGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet = false;
        java.lang.String controllerMediaPositionInStringJavaLangObjectNullViewTubiControllerElapsedTimeAndroidStringControllerTimePositionTextDefaultControllerMediaPositionInString = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsStreamOnFavoriteGet = false;
        long androidxDatabindingViewDataBindingSafeUnboxControllerMediaBufferedPositionGet = 0;
        androidx.databinding.ObservableField<java.lang.Long> controllerMediaCurrentTime = null;
        int controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = 0;
        int intControllerMediaBufferedPosition = 0;
        int controllerIsCurrentAdViewGONEViewVISIBLE = 0;
        java.lang.Boolean controllerVideoHasIDGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerIsStreamOnFavorite = null;
        boolean controllerPlayerPlaybackStateExoPlayerSTATEENDED = false;
        boolean controllerMediaTypeEqualsJavaLangStringAnime = false;
        androidx.databinding.ObservableField<java.lang.Boolean> ControllerIsCurrentAd1 = null;
        int controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGViewGONEViewVISIBLE = 0;
        java.lang.Long controllerMediaDurationGet = null;
        boolean controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1BooleanTrueControllerMediaTypeEqualsJavaLangStringAnime = false;
        java.lang.Boolean controllerIsStreamOnFavoriteGet = null;
        boolean controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse = false;
        java.lang.Boolean controllerMediaHasSubstitleGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerVideoHasIDGet = false;
        java.lang.String controllerMediaRemainInStringGet = null;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        boolean controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse = false;
        int controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch controllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch = null;
        androidx.databinding.ObservableField<java.lang.Long> controllerMediaDuration = null;
        boolean controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        java.lang.Boolean controllerMediaEndedGet = null;
        long androidxDatabindingViewDataBindingSafeUnboxControllerMediaCurrentTimeGet = 0;
        boolean controllerMediaRemainInStringJavaLangObjectNull = false;
        java.lang.Boolean controllerIsMediaSubstitleEnabledGet = null;
        boolean controllerMediaPositionInStringJavaLangObjectNull = false;
        java.lang.String controllerAdsRemainInStringGet = null;
        java.lang.String controllerMediaPositionInStringGet = null;
        int controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = 0;
        int intControllerMediaDuration = 0;
        int intControllerMediaCurrentTime = 0;
        java.lang.Boolean controllerIsCurrentAdGet = null;
        int controllerPlayerPlaybackStateGet = 0;
        androidx.databinding.ObservableInt controllerPlayerPlaybackState = null;
        java.lang.Boolean controllerIsLiveGet = null;
        int controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch controllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch = null;
        boolean controllerMediaEndedBooleanFalse = false;
        boolean controllerMediaTypeEqualsJavaLangString0 = false;
        androidx.databinding.ObservableField<java.lang.Boolean> controllerVideoHasID = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControllerIsMediaSubstitleEnabledGet = false;
        java.lang.String controllerVideoCurrentSubsGet = null;
        boolean controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1 = false;
        int controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = 0;
        com.streamsaw.ui.player.bindings.PlayerController controller = mController;
        java.lang.String controllerCurrentMediaCoverGet = null;
        boolean controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse = false;
        androidx.databinding.ObservableBoolean controllerIsVideoPlayWhenReady = null;
        boolean controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = false;
        boolean controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalse = false;

        if ((dirtyFlags & 0x1fffffL) != 0) {


            if ((dirtyFlags & 0x180001L) != 0) {

                    if (controller != null) {
                        // read controller.currentMediaCover
                        controllerCurrentMediaCover = controller.currentMediaCover;
                    }
                    updateRegistration(0, controllerCurrentMediaCover);


                    if (controllerCurrentMediaCover != null) {
                        // read controller.currentMediaCover.get()
                        controllerCurrentMediaCoverGet = controllerCurrentMediaCover.get();
                    }
            }
            if ((dirtyFlags & 0x180002L) != 0) {

                    if (controller != null) {
                        // read controller.videoName
                        controllerVideoName = controller.videoName;
                    }
                    updateRegistration(1, controllerVideoName);


                    if (controllerVideoName != null) {
                        // read controller.videoName.get()
                        controllerVideoNameGet = controllerVideoName.get();
                    }
            }
            if ((dirtyFlags & 0x180004L) != 0) {

                    if (controller != null) {
                        // read controller.mediaPositionInString
                        controllerMediaPositionInString = controller.mediaPositionInString;
                    }
                    updateRegistration(2, controllerMediaPositionInString);


                    if (controllerMediaPositionInString != null) {
                        // read controller.mediaPositionInString.get()
                        controllerMediaPositionInStringGet = controllerMediaPositionInString.get();
                    }


                    // read controller.mediaPositionInString.get() == null
                    controllerMediaPositionInStringJavaLangObjectNull = (controllerMediaPositionInStringGet) == (null);
                if((dirtyFlags & 0x180004L) != 0) {
                    if(controllerMediaPositionInStringJavaLangObjectNull) {
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x184100L) != 0) {

                    if (controller != null) {
                        // read controller.mediaType
                        controllerMediaType = controller.getMediaType();
                    }


                    if (controllerMediaType != null) {
                        // read controller.mediaType.equals("1")
                        controllerMediaTypeEqualsJavaLangString1 = controllerMediaType.equals("1");
                        // read controller.mediaType.equals("anime")
                        controllerMediaTypeEqualsJavaLangStringAnime = controllerMediaType.equals("anime");
                        // read controller.mediaType.equals("0")
                        controllerMediaTypeEqualsJavaLangString0 = controllerMediaType.equals("0");
                    }
                if((dirtyFlags & 0x184100L) != 0) {
                    if(controllerMediaTypeEqualsJavaLangString1) {
                            dirtyFlags_1 |= 0x40000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x184100L) != 0) {
                    if(controllerMediaTypeEqualsJavaLangStringAnime) {
                            dirtyFlags |= 0x1000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000000L;
                    }
                }
                if((dirtyFlags & 0x184100L) != 0) {
                    if(controllerMediaTypeEqualsJavaLangString0) {
                            dirtyFlags_1 |= 0x1L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000000L;
                    }
                }
                if ((dirtyFlags & 0x180100L) != 0) {

                        if (controllerMediaType != null) {
                            // read controller.mediaType.equals("streaming")
                            controllerMediaTypeEqualsJavaLangStringStreaming = controllerMediaType.equals("streaming");
                        }
                    if((dirtyFlags & 0x180100L) != 0) {
                        if(controllerMediaTypeEqualsJavaLangStringStreaming) {
                                dirtyFlags |= 0x10000000000L;
                        }
                        else {
                                dirtyFlags |= 0x8000000000L;
                        }
                    }
                    if((dirtyFlags & 0x180000L) != 0) {
                        if(controllerMediaTypeEqualsJavaLangStringStreaming) {
                                dirtyFlags_1 |= 0x400L;
                        }
                        else {
                                dirtyFlags_1 |= 0x200L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x180008L) != 0) {

                    if (controller != null) {
                        // read controller.isMediaSubstitleEnabled
                        controllerIsMediaSubstitleEnabled = controller.isMediaSubstitleEnabled;
                    }
                    updateRegistration(3, controllerIsMediaSubstitleEnabled);


                    if (controllerIsMediaSubstitleEnabled != null) {
                        // read controller.isMediaSubstitleEnabled.get()
                        controllerIsMediaSubstitleEnabledGet = controllerIsMediaSubstitleEnabled.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isMediaSubstitleEnabled.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsMediaSubstitleEnabledGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsMediaSubstitleEnabledGet);
            }
            if ((dirtyFlags & 0x180000L) != 0) {

                    if (controller != null) {
                        // read controller::onProgressChanged
                        controllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged = (((mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged == null) ? (mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged = new OnProgressChangedImpl()) : mControllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged).setValue(controller));
                        // read controller::onStartTrackingTouch
                        controllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch = (((mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch == null) ? (mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch = new OnStartTrackingTouchImpl()) : mControllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch).setValue(controller));
                        // read controller::onStopTrackingTouch
                        controllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch = (((mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch == null) ? (mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch = new OnStopTrackingTouchImpl()) : mControllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch).setValue(controller));
                    }
            }
            if ((dirtyFlags & 0x180010L) != 0) {

                    if (controller != null) {
                        // read controller.mediaBufferedPosition
                        controllerMediaBufferedPosition = controller.mediaBufferedPosition;
                    }
                    updateRegistration(4, controllerMediaBufferedPosition);


                    if (controllerMediaBufferedPosition != null) {
                        // read controller.mediaBufferedPosition.get()
                        controllerMediaBufferedPositionGet = controllerMediaBufferedPosition.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaBufferedPosition.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaBufferedPositionGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaBufferedPositionGet);


                    // read (int) androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaBufferedPosition.get())
                    intControllerMediaBufferedPosition = ((int) (androidxDatabindingViewDataBindingSafeUnboxControllerMediaBufferedPositionGet));
            }
            if ((dirtyFlags & 0x180020L) != 0) {

                    if (controller != null) {
                        // read controller.videoCurrentSubs
                        controllerVideoCurrentSubs = controller.videoCurrentSubs;
                    }
                    updateRegistration(5, controllerVideoCurrentSubs);


                    if (controllerVideoCurrentSubs != null) {
                        // read controller.videoCurrentSubs.get()
                        controllerVideoCurrentSubsGet = controllerVideoCurrentSubs.get();
                    }
            }
            if ((dirtyFlags & 0x180040L) != 0) {

                    if (controller != null) {
                        // read controller.adsRemainInString
                        controllerAdsRemainInString = controller.adsRemainInString;
                    }
                    updateRegistration(6, controllerAdsRemainInString);


                    if (controllerAdsRemainInString != null) {
                        // read controller.adsRemainInString.get()
                        controllerAdsRemainInStringGet = controllerAdsRemainInString.get();
                    }
            }
            if ((dirtyFlags & 0x180080L) != 0) {

                    if (controller != null) {
                        // read controller.isLive
                        controllerIsLive = controller.isLive;
                    }
                    updateRegistration(7, controllerIsLive);


                    if (controllerIsLive != null) {
                        // read controller.isLive.get()
                        controllerIsLiveGet = controllerIsLive.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsLiveGet);
                if((dirtyFlags & 0x180080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get()) ? View.VISIBLE : View.GONE
                    controllerIsLiveViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsLiveGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x180200L) != 0) {

                    if (controller != null) {
                        // read controller.mediaRemainInString
                        controllerMediaRemainInString = controller.mediaRemainInString;
                    }
                    updateRegistration(9, controllerMediaRemainInString);


                    if (controllerMediaRemainInString != null) {
                        // read controller.mediaRemainInString.get()
                        controllerMediaRemainInStringGet = controllerMediaRemainInString.get();
                    }


                    // read controller.mediaRemainInString.get() == null
                    controllerMediaRemainInStringJavaLangObjectNull = (controllerMediaRemainInStringGet) == (null);
                if((dirtyFlags & 0x180200L) != 0) {
                    if(controllerMediaRemainInStringJavaLangObjectNull) {
                            dirtyFlags |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x184400L) != 0) {

                    if (controller != null) {
                        // read controller.mediaHasSubstitle
                        controllerMediaHasSubstitle = controller.mediaHasSubstitle;
                    }
                    updateRegistration(10, controllerMediaHasSubstitle);


                    if (controllerMediaHasSubstitle != null) {
                        // read controller.mediaHasSubstitle.get()
                        controllerMediaHasSubstitleGet = controllerMediaHasSubstitle.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaHasSubstitleGet);
                if((dirtyFlags & 0x184400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet) {
                            dirtyFlags_1 |= 0x4000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x180800L) != 0) {

                    if (controller != null) {
                        // read controller.addtomylist
                        controllerAddtomylist = controller.addtomylist;
                    }
                    updateRegistration(11, controllerAddtomylist);


                    if (controllerAddtomylist != null) {
                        // read controller.addtomylist.get()
                        controllerAddtomylistGet = controllerAddtomylist.get();
                    }
            }
            if ((dirtyFlags & 0x181000L) != 0) {

                    if (controller != null) {
                        // read controller.mediaCurrentTime
                        controllerMediaCurrentTime = controller.mediaCurrentTime;
                    }
                    updateRegistration(12, controllerMediaCurrentTime);


                    if (controllerMediaCurrentTime != null) {
                        // read controller.mediaCurrentTime.get()
                        controllerMediaCurrentTimeGet = controllerMediaCurrentTime.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaCurrentTime.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaCurrentTimeGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaCurrentTimeGet);


                    // read (int) androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaCurrentTime.get())
                    intControllerMediaCurrentTime = ((int) (androidxDatabindingViewDataBindingSafeUnboxControllerMediaCurrentTimeGet));
            }
            if ((dirtyFlags & 0x182000L) != 0) {

                    if (controller != null) {
                        // read controller.isStreamOnFavorite
                        controllerIsStreamOnFavorite = controller.isStreamOnFavorite;
                    }
                    updateRegistration(13, controllerIsStreamOnFavorite);


                    if (controllerIsStreamOnFavorite != null) {
                        // read controller.isStreamOnFavorite.get()
                        controllerIsStreamOnFavoriteGet = controllerIsStreamOnFavorite.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isStreamOnFavorite.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsStreamOnFavoriteGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsStreamOnFavoriteGet);
            }
            if ((dirtyFlags & 0x184000L) != 0) {

                    if (controller != null) {
                        // read controller.isCurrentAd
                        ControllerIsCurrentAd1 = controller.isCurrentAd;
                    }
                    updateRegistration(14, ControllerIsCurrentAd1);


                    if (ControllerIsCurrentAd1 != null) {
                        // read controller.isCurrentAd.get()
                        controllerIsCurrentAdGet = ControllerIsCurrentAd1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsCurrentAdGet);
                if((dirtyFlags & 0x184000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) {
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x1000000000000L;
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x800000000000L;
                            dirtyFlags |= 0x20000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.VISIBLE : View.INVISIBLE
                    controllerIsCurrentAdViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.INVISIBLE : View.VISIBLE
                    controllerIsCurrentAdViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.GONE : View.VISIBLE
                    controllerIsCurrentAdViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x188000L) != 0) {

                    if (controller != null) {
                        // read controller.mediaDuration
                        controllerMediaDuration = controller.mediaDuration;
                    }
                    updateRegistration(15, controllerMediaDuration);


                    if (controllerMediaDuration != null) {
                        // read controller.mediaDuration.get()
                        controllerMediaDurationGet = controllerMediaDuration.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaDuration.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerMediaDurationGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaDurationGet);


                    // read (int) androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaDuration.get())
                    intControllerMediaDuration = ((int) (androidxDatabindingViewDataBindingSafeUnboxControllerMediaDurationGet));
            }
            if ((dirtyFlags & 0x190000L) != 0) {

                    if (controller != null) {
                        // read controller.playerPlaybackState
                        controllerPlayerPlaybackState = controller.playerPlaybackState;
                    }
                    updateRegistration(16, controllerPlayerPlaybackState);


                    if (controllerPlayerPlaybackState != null) {
                        // read controller.playerPlaybackState.get()
                        controllerPlayerPlaybackStateGet = controllerPlayerPlaybackState.get();
                    }


                    // read controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
                    controllerPlayerPlaybackStateExoPlayerSTATEIDLE = (controllerPlayerPlaybackStateGet) == (com.google.android.exoplayer2.ExoPlayer.STATE_IDLE);
                    // read controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING
                    controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING = (controllerPlayerPlaybackStateGet) == (com.google.android.exoplayer2.ExoPlayer.STATE_BUFFERING);
                if((dirtyFlags & 0x190000L) != 0) {
                    if(controllerPlayerPlaybackStateExoPlayerSTATEIDLE) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }
                if((dirtyFlags & 0x190000L) != 0) {
                    if(controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING) {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x100000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x80000000000000L;
                    }
                }


                    // read controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? View.GONE : View.VISIBLE
                    controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGViewGONEViewVISIBLE = ((controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1a4100L) != 0) {

                    if (controller != null) {
                        // read controller.videoHasID
                        controllerVideoHasID = controller.videoHasID;
                    }
                    updateRegistration(17, controllerVideoHasID);


                    if (controllerVideoHasID != null) {
                        // read controller.videoHasID.get()
                        controllerVideoHasIDGet = controllerVideoHasID.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get())
                    androidxDatabindingViewDataBindingSafeUnboxControllerVideoHasIDGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerVideoHasIDGet);
                if((dirtyFlags & 0x1a4100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControllerVideoHasIDGet) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1c0000L) != 0) {

                    if (controller != null) {
                        // read controller.isVideoPlayWhenReady
                        controllerIsVideoPlayWhenReady = controller.isVideoPlayWhenReady;
                    }
                    updateRegistration(18, controllerIsVideoPlayWhenReady);


                    if (controllerIsVideoPlayWhenReady != null) {
                        // read controller.isVideoPlayWhenReady.get()
                        controllerIsVideoPlayWhenReadyGet = controllerIsVideoPlayWhenReady.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x190000L) != 0) {

                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
                controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEIDLE = ((controllerPlayerPlaybackStateExoPlayerSTATEBUFFERING) ? (true) : (controllerPlayerPlaybackStateExoPlayerSTATEIDLE));
        }
        if ((dirtyFlags & 0x180200L) != 0) {

                // read controller.mediaRemainInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaRemainInString.get()
                controllerMediaRemainInStringJavaLangObjectNullViewTubiControllerRemainingTimeAndroidStringControllerTimePositionTextDefaultControllerMediaRemainInString = ((controllerMediaRemainInStringJavaLangObjectNull) ? (viewTubiControllerRemainingTime.getResources().getString(R.string.controller_time_position_text_default)) : (controllerMediaRemainInStringGet));
        }
        if ((dirtyFlags & 0x1000000100000000L) != 0 || (dirtyFlags_1 & 0x40001L) != 0) {

                if (controller != null) {
                    // read controller.mediaEnded
                    controllerMediaEnded = controller.mediaEnded;
                }
                updateRegistration(8, controllerMediaEnded);


                if (controllerMediaEnded != null) {
                    // read controller.mediaEnded.get()
                    controllerMediaEndedGet = controllerMediaEnded.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaEndedGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false
                controllerMediaEndedBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet) == (false);
        }
        if ((dirtyFlags & 0x180004L) != 0) {

                // read controller.mediaPositionInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaPositionInString.get()
                controllerMediaPositionInStringJavaLangObjectNullViewTubiControllerElapsedTimeAndroidStringControllerTimePositionTextDefaultControllerMediaPositionInString = ((controllerMediaPositionInStringJavaLangObjectNull) ? (viewTubiControllerElapsedTime.getResources().getString(R.string.controller_time_position_text_default)) : (controllerMediaPositionInStringGet));
        }
        if ((dirtyFlags & 0x200000000L) != 0) {

                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
                controllerPlayerPlaybackStateExoPlayerSTATEENDED = (controllerPlayerPlaybackStateGet) == (com.google.android.exoplayer2.ExoPlayer.STATE_ENDED);
        }
        if ((dirtyFlags_1 & 0x4000L) != 0) {

                if (controller != null) {
                    // read controller.isCurrentAd
                    ControllerIsCurrentAd1 = controller.isCurrentAd;
                }
                updateRegistration(14, ControllerIsCurrentAd1);


                if (ControllerIsCurrentAd1 != null) {
                    // read controller.isCurrentAd.get()
                    controllerIsCurrentAdGet = ControllerIsCurrentAd1.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsCurrentAdGet);
            if((dirtyFlags & 0x184000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) {
                        dirtyFlags |= 0x1000000L;
                        dirtyFlags |= 0x4000000L;
                        dirtyFlags |= 0x1000000000000L;
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                        dirtyFlags |= 0x2000000L;
                        dirtyFlags |= 0x800000000000L;
                        dirtyFlags |= 0x20000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                controllerIsCurrentAd = !androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet;
        }

        if ((dirtyFlags & 0x1a4100L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControllerVideoHasIDGet) ? (controllerMediaEndedBooleanFalse) : (false));
            if((dirtyFlags & 0x1a4100L) != 0) {
                if(controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags_1 |= 0x10L;
                }
                else {
                        dirtyFlags_1 |= 0x8L;
                }
            }
        }
        if ((dirtyFlags & 0x190000L) != 0) {

                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
                controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED = ((controllerPlayerPlaybackStateExoPlayerSTATEIDLE) ? (true) : (controllerPlayerPlaybackStateExoPlayerSTATEENDED));
            if((dirtyFlags & 0x190000L) != 0) {
                if(controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED ? View.VISIBLE : View.GONE
                controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDEDViewVISIBLEViewGONE = ((controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDED) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x184100L) != 0) {

                // read controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangStringAnime) ? (controllerMediaEndedBooleanFalse) : (false));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0) ? (controllerMediaEndedBooleanFalse) : (false));
                // read controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangString1) ? (controllerMediaEndedBooleanFalse) : (false));
            if((dirtyFlags & 0x184100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags_1 |= 0x10000L;
                }
                else {
                        dirtyFlags_1 |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x184100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags |= 0x4000000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000000L;
                }
            }
            if((dirtyFlags & 0x184100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags |= 0x4000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x184400L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControllerMediaHasSubstitleGet) ? (controllerIsCurrentAd) : (false));
            if((dirtyFlags & 0x184400L) != 0) {
                if(controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags_1 |= 0x40L;
                }
                else {
                        dirtyFlags_1 |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
                controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = ((controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x4000004000000000L) != 0 || (dirtyFlags_1 & 0x10010L) != 0) {

                if (controller != null) {
                    // read controller.isCurrentAd
                    ControllerIsCurrentAd1 = controller.isCurrentAd;
                }
                updateRegistration(14, ControllerIsCurrentAd1);


                if (ControllerIsCurrentAd1 != null) {
                    // read controller.isCurrentAd.get()
                    controllerIsCurrentAdGet = ControllerIsCurrentAd1.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerIsCurrentAdGet);
            if((dirtyFlags & 0x184000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) {
                        dirtyFlags |= 0x1000000L;
                        dirtyFlags |= 0x4000000L;
                        dirtyFlags |= 0x1000000000000L;
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                        dirtyFlags |= 0x2000000L;
                        dirtyFlags |= 0x800000000000L;
                        dirtyFlags |= 0x20000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get())
                controllerIsCurrentAd = !androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet;
        }

        if ((dirtyFlags & 0x184100L) != 0) {

                // read controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalse) ? (controllerIsCurrentAd) : (false));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalse) ? (controllerIsCurrentAd) : (false));
                // read controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalse) ? (controllerIsCurrentAd) : (false));
            if((dirtyFlags & 0x184100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags |= 0x400000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000L;
                }
            }
            if((dirtyFlags & 0x184100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags_1 |= 0x4L;
                }
                else {
                        dirtyFlags_1 |= 0x2L;
                }
            }
            if((dirtyFlags & 0x184100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags_1 |= 0x1000L;
                }
                else {
                        dirtyFlags_1 |= 0x800L;
                }
            }


                // read controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
                controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = ((controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
                controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = ((controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
                controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = ((controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1a4100L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
                controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse = ((controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalse) ? (controllerIsCurrentAd) : (false));
            if((dirtyFlags & 0x1a4100L) != 0) {
                if(controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) {
                        dirtyFlags |= 0x10000000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
                controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE = ((controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x800000L) != 0) {

                if (controllerMediaType != null) {
                    // read controller.mediaType.equals("streaming")
                    controllerMediaTypeEqualsJavaLangStringStreaming = controllerMediaType.equals("streaming");
                }
            if((dirtyFlags & 0x180100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreaming) {
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000L;
                }
            }
            if((dirtyFlags & 0x180000L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreaming) {
                        dirtyFlags_1 |= 0x400L;
                }
                else {
                        dirtyFlags_1 |= 0x200L;
                }
            }
        }

        if ((dirtyFlags & 0x184000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? true : controller.mediaType.equals("streaming")
                controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming = ((androidxDatabindingViewDataBindingSafeUnboxControllerIsCurrentAdGet) ? (true) : (controllerMediaTypeEqualsJavaLangStringStreaming));
            if((dirtyFlags & 0x184000L) != 0) {
                if(controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming) {
                        dirtyFlags |= 0x40000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? true : controller.mediaType.equals("streaming") ? View.INVISIBLE : View.VISIBLE
                controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE = ((controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreaming) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x10000000000L) != 0) {

                if (controller != null) {
                    // read controller.mediaEnded
                    controllerMediaEnded = controller.mediaEnded;
                }
                updateRegistration(8, controllerMediaEnded);


                if (controllerMediaEnded != null) {
                    // read controller.mediaEnded.get()
                    controllerMediaEndedGet = controllerMediaEnded.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get())
                androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet = androidx.databinding.ViewDataBinding.safeUnbox(controllerMediaEndedGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false
                controllerMediaEndedBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxControllerMediaEndedGet) == (false);
        }
        if ((dirtyFlags & 0x180000L) != 0) {

                // read controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1")
                controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1 = ((controllerMediaTypeEqualsJavaLangStringStreaming) ? (true) : (controllerMediaTypeEqualsJavaLangString1));
            if((dirtyFlags & 0x180000L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1) {
                        dirtyFlags |= 0x400000000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x180100L) != 0) {

                // read controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
                controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse = ((controllerMediaTypeEqualsJavaLangStringStreaming) ? (controllerMediaEndedBooleanFalse) : (false));
            if((dirtyFlags & 0x180100L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse) {
                        dirtyFlags_1 |= 0x100L;
                }
                else {
                        dirtyFlags_1 |= 0x80L;
                }
            }


                // read controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? View.VISIBLE : View.GONE
                controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseViewVISIBLEViewGONE = ((controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x180000L) != 0) {

                // read controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1") ? true : controller.mediaType.equals("anime")
                controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1BooleanTrueControllerMediaTypeEqualsJavaLangStringAnime = ((controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1) ? (true) : (controllerMediaTypeEqualsJavaLangStringAnime));
            if((dirtyFlags & 0x180000L) != 0) {
                if(controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1BooleanTrueControllerMediaTypeEqualsJavaLangStringAnime) {
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                }
            }


                // read controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1") ? true : controller.mediaType.equals("anime") ? View.VISIBLE : View.GONE
                controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1BooleanTrueControllerMediaTypeEqualsJavaLangStringAnimeViewVISIBLEViewGONE = ((controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1BooleanTrueControllerMediaTypeEqualsJavaLangStringAnime) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x180001L) != 0) {
            // api target 1

            com.streamsaw.data.local.entity.Media.loadImage(this.exoArtwork, controllerCurrentMediaCoverGet);
            com.streamsaw.data.local.entity.Media.loadImage(this.imageViewMovieNext, controllerCurrentMediaCoverGet);
        }
        if ((dirtyFlags & 0x190000L) != 0) {
            // api target 1

            this.exoArtwork.setVisibility(controllerPlayerPlaybackStateExoPlayerSTATEIDLEBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEENDEDViewVISIBLEViewGONE);
            com.tubitv.ui.TubiLoadingView.onTubiLoadingViewToggle(this.viewTubiControllerLoading, controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGBooleanTrueControllerPlayerPlaybackStateExoPlayerSTATEIDLE);
            this.viewTubiControllerPlayToggleIb.setVisibility(controllerPlayerPlaybackStateExoPlayerSTATEBUFFERINGViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x100000L) != 0) {
            // api target 1

            this.mboundView16.setOnClickListener(mCallback12);
            this.mboundView18.setOnClickListener(mCallback14);
            this.mboundView25.setOnClickListener(mCallback21);
            this.mboundView26.setOnClickListener(mCallback22);
            this.mboundView34.setOnClickListener(mCallback30);
            this.mboundView35.setOnClickListener(mCallback31);
            this.mboundView37.setOnClickListener(mCallback33);
            this.mboundView38.setOnClickListener(mCallback34);
            this.mboundView40.setOnClickListener(mCallback36);
            this.mboundView41.setOnClickListener(mCallback37);
            this.viewAddMyList.setOnClickListener(mCallback11);
            this.viewAudioVideoSubs.setOnClickListener(mCallback20);
            this.viewEpisodes.setOnClickListener(mCallback23);
            this.viewEpisodesAnimes.setOnClickListener(mCallback17);
            this.viewMoviesList.setOnClickListener(mCallback35);
            this.viewNextEpisode.setOnClickListener(mCallback32);
            this.viewNextEpisodeAnimes.setOnClickListener(mCallback29);
            this.viewStreaming.setOnClickListener(mCallback26);
            this.viewTextAddMylistSream.setOnClickListener(mCallback13);
            this.viewTubiControllerAppSettings.setOnClickListener(mCallback3);
            this.viewTubiControllerClose.setOnClickListener(mCallback1);
            this.viewTubiControllerEpisodes.setOnClickListener(mCallback24);
            this.viewTubiControllerEpisodesAnimes.setOnClickListener(mCallback18);
            this.viewTubiControllerEpisodesText.setOnClickListener(mCallback25);
            this.viewTubiControllerEpisodesTextAnimes.setOnClickListener(mCallback19);
            this.viewTubiControllerForwardIb.setOnClickListener(mCallback10);
            this.viewTubiControllerMediaTvAudio.setOnClickListener(mCallback7);
            this.viewTubiControllerPlayToggleIb.setOnClickListener(mCallback9);
            this.viewTubiControllerRewindIb.setOnClickListener(mCallback8);
            this.viewTubiControllerScaleIb.setOnClickListener(mCallback4);
            this.viewTubiControllerSeekBar.setOnTouchListener(mCallback39);
            this.viewTubiControllerStreaming.setOnClickListener(mCallback27);
            this.viewTubiControllerStreamingText.setOnClickListener(mCallback28);
            this.viewTubiControllerSubstitleCurentLang.setOnClickListener(mCallback16);
            this.viewTubiControllerSubstitlesIcon.setOnClickListener(mCallback15);
            this.viewTubiControllerSubtitlesIb.setOnClickListener(mCallback2);
            this.viewTubiControllerSubtitlesIbIb.setOnClickListener(mCallback38);
            this.viewTubiControllerVideoIb.setOnClickListener(mCallback5);
            this.viewTubiControllerVideoSubstitleDialog.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x182000L) != 0) {
            // api target 1

            com.streamsaw.ui.player.views.AddToMyListmageButton.onStateChanged(this.mboundView16, androidxDatabindingViewDataBindingSafeUnboxControllerIsStreamOnFavoriteGet);
        }
        if ((dirtyFlags & 0x1a4100L) != 0) {
            // api target 1

            this.mboundView18.setVisibility(controllerVideoHasIDControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView48, controllerVideoNameGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerTitle, controllerVideoNameGet);
        }
        if ((dirtyFlags & 0x184000L) != 0) {
            // api target 1

            this.nextPlayFramelayout.setVisibility(controllerIsCurrentAdViewVISIBLEViewINVISIBLE);
            this.progressBar.setVisibility(controllerIsCurrentAdViewVISIBLEViewINVISIBLE);
            this.viewTubiControllerAppSettings.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerElapsedTime.setVisibility(controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerForwardIb.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerRemainingTime.setVisibility(controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerRewindIb.setVisibility(controllerIsCurrentAdViewGONEViewVISIBLE);
            this.viewTubiControllerScaleIb.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerSeekBar.setVisibility(controllerIsCurrentAdBooleanTrueControllerMediaTypeEqualsJavaLangStringStreamingViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerSubtitlesIbIb.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerTitle.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerVideoIb.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
            this.viewTubiControllerVideoSubstitleDialog.setVisibility(controllerIsCurrentAdViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x188000L) != 0) {
            // api target 1

            this.progressBar.setMax(intControllerMediaDuration);
            this.viewTubiControllerSeekBar.setMax(intControllerMediaDuration);
        }
        if ((dirtyFlags & 0x181000L) != 0) {
            // api target 1

            this.progressBar.setProgress(intControllerMediaCurrentTime);
            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.viewTubiControllerSeekBar, intControllerMediaCurrentTime);
        }
        if ((dirtyFlags & 0x180040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewVideoTimeRemaining, controllerAdsRemainInStringGet);
        }
        if ((dirtyFlags & 0x180100L) != 0) {
            // api target 1

            this.viewAddMyList.setVisibility(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseViewVISIBLEViewGONE);
            this.viewStreaming.setVisibility(controllerMediaTypeEqualsJavaLangStringStreamingControllerMediaEndedBooleanFalseBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x184100L) != 0) {
            // api target 1

            this.viewAudioVideoSubs.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
            this.viewEpisodes.setVisibility(controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
            this.viewEpisodesAnimes.setVisibility(controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
            this.viewMoviesList.setVisibility(controllerMediaTypeEqualsJavaLangString0ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
            this.viewNextEpisode.setVisibility(controllerMediaTypeEqualsJavaLangString1ControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
            this.viewNextEpisodeAnimes.setVisibility(controllerMediaTypeEqualsJavaLangStringAnimeControllerMediaEndedBooleanFalseBooleanFalseControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180080L) != 0) {
            // api target 1

            this.viewIslive.setVisibility(controllerIsLiveViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTextAddMylistSream, controllerAddtomylistGet);
        }
        if ((dirtyFlags & 0x180004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerElapsedTime, controllerMediaPositionInStringJavaLangObjectNullViewTubiControllerElapsedTimeAndroidStringControllerTimePositionTextDefaultControllerMediaPositionInString);
        }
        if ((dirtyFlags & 0x180000L) != 0) {
            // api target 1

            this.viewTubiControllerMediaTvAudio.setVisibility(controllerMediaTypeEqualsJavaLangStringStreamingBooleanTrueControllerMediaTypeEqualsJavaLangString1BooleanTrueControllerMediaTypeEqualsJavaLangStringAnimeViewVISIBLEViewGONE);
            androidx.databinding.adapters.SeekBarBindingAdapter.setOnSeekBarChangeListener(this.viewTubiControllerSeekBar, (androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch)controllerOnStartTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStartTrackingTouch, (androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch)controllerOnStopTrackingTouchAndroidxDatabindingAdaptersSeekBarBindingAdapterOnStopTrackingTouch, (androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged)controllerOnProgressChangedAndroidxDatabindingAdaptersSeekBarBindingAdapterOnProgressChanged, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x1c0000L) != 0) {
            // api target 1

            com.streamsaw.ui.player.views.PlayStateImageButton.onStateChanged(this.viewTubiControllerPlayToggleIb, controllerIsVideoPlayWhenReadyGet);
        }
        if ((dirtyFlags & 0x180200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerRemainingTime, controllerMediaRemainInStringJavaLangObjectNullViewTubiControllerRemainingTimeAndroidStringControllerTimePositionTextDefaultControllerMediaRemainInString);
        }
        if ((dirtyFlags & 0x180010L) != 0) {
            // api target 1

            this.viewTubiControllerSeekBar.setSecondaryProgress(intControllerMediaBufferedPosition);
        }
        if ((dirtyFlags & 0x180020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewTubiControllerSubstitleCurentLang, controllerVideoCurrentSubsGet);
        }
        if ((dirtyFlags & 0x184400L) != 0) {
            // api target 1

            this.viewTubiControllerSubtitlesIb.setVisibility(controllerMediaHasSubstitleControllerIsCurrentAdBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180008L) != 0) {
            // api target 1

            com.streamsaw.ui.player.views.SubstitleImageButton.onStateChanged(this.viewTubiControllerSubtitlesIb, androidxDatabindingViewDataBindingSafeUnboxControllerIsMediaSubstitleEnabledGet);
        }
    }
    // Listener Stub Implementations
    public static class OnProgressChangedImpl implements androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged{
        private com.streamsaw.ui.player.bindings.PlayerController value;
        public OnProgressChangedImpl setValue(com.streamsaw.ui.player.bindings.PlayerController value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onProgressChanged(android.widget.SeekBar arg0, int arg1, boolean arg2) {
            this.value.onProgressChanged(arg0, arg1, arg2); 
        }
    }
    public static class OnStartTrackingTouchImpl implements androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch{
        private com.streamsaw.ui.player.bindings.PlayerController value;
        public OnStartTrackingTouchImpl setValue(com.streamsaw.ui.player.bindings.PlayerController value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onStartTrackingTouch(android.widget.SeekBar arg0) {
            this.value.onStartTrackingTouch(arg0); 
        }
    }
    public static class OnStopTrackingTouchImpl implements androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch{
        private com.streamsaw.ui.player.bindings.PlayerController value;
        public OnStopTrackingTouchImpl setValue(com.streamsaw.ui.player.bindings.PlayerController value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onStopTrackingTouch(android.widget.SeekBar arg0) {
            this.value.onStopTrackingTouch(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 27: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadStreaming();
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 28: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadStreaming();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller.isVideoPlayWhenReady != null
                boolean controllerIsVideoPlayWhenReadyJavaLangObjectNull = false;
                // !controller.isVideoPlayWhenReady.get()
                boolean controllerIsVideoPlayWhenReady = false;
                // controller.isVideoPlayWhenReady
                androidx.databinding.ObservableBoolean ControllerIsVideoPlayWhenReady1 = null;
                // controller.isVideoPlayWhenReady.get()
                boolean controllerIsVideoPlayWhenReadyGet = false;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    ControllerIsVideoPlayWhenReady1 = controller.isVideoPlayWhenReady;

                    controllerIsVideoPlayWhenReadyJavaLangObjectNull = (ControllerIsVideoPlayWhenReady1) != (null);
                    if (controllerIsVideoPlayWhenReadyJavaLangObjectNull) {


                        controllerIsVideoPlayWhenReadyGet = ControllerIsVideoPlayWhenReady1.get();

                        controllerIsVideoPlayWhenReady = !controllerIsVideoPlayWhenReadyGet;

                        controller.triggerPlayOrPause(controllerIsVideoPlayWhenReady);
                    }
                }
                break;
            }
            case 25: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 37: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller.isMediaSubstitleEnabled
                androidx.databinding.ObservableField<java.lang.Boolean> controllerIsMediaSubstitleEnabled = null;
                // !controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean ControllerIsMediaSubstitleEnabled1 = null;
                // controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean controllerIsMediaSubstitleEnabledGet = null;
                // controller.isMediaSubstitleEnabled != null
                boolean controllerIsMediaSubstitleEnabledJavaLangObjectNull = false;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    controllerIsMediaSubstitleEnabled = controller.isMediaSubstitleEnabled;

                    controllerIsMediaSubstitleEnabledJavaLangObjectNull = (controllerIsMediaSubstitleEnabled) != (null);
                    if (controllerIsMediaSubstitleEnabledJavaLangObjectNull) {


                        controllerIsMediaSubstitleEnabledGet = controllerIsMediaSubstitleEnabled.get();

                        ControllerIsMediaSubstitleEnabled1 = !controllerIsMediaSubstitleEnabledGet;

                        controller.addToMyList(ControllerIsMediaSubstitleEnabled1);
                    }
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {






                    controller.seekBy((-1500) * (10));
                }
                break;
            }
            case 38: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {





                    controller.seekBy((1500) * (10));
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickOnSubs();
                }
                break;
            }
            case 26: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadStreaming();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksAudio();
                }
                break;
            }
            case 23: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 35: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller.isMediaSubstitleEnabled
                androidx.databinding.ObservableField<java.lang.Boolean> controllerIsMediaSubstitleEnabled = null;
                // !controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean ControllerIsMediaSubstitleEnabled1 = null;
                // controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean controllerIsMediaSubstitleEnabledGet = null;
                // controller.isMediaSubstitleEnabled != null
                boolean controllerIsMediaSubstitleEnabledJavaLangObjectNull = false;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    controllerIsMediaSubstitleEnabled = controller.isMediaSubstitleEnabled;

                    controllerIsMediaSubstitleEnabledJavaLangObjectNull = (controllerIsMediaSubstitleEnabled) != (null);
                    if (controllerIsMediaSubstitleEnabledJavaLangObjectNull) {


                        controllerIsMediaSubstitleEnabledGet = controllerIsMediaSubstitleEnabled.get();

                        ControllerIsMediaSubstitleEnabled1 = !controllerIsMediaSubstitleEnabledGet;

                        controller.addToMyList(ControllerIsMediaSubstitleEnabled1);
                    }
                }
                break;
            }
            case 36: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.loadMoviesList();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller.isMediaSubstitleEnabled
                androidx.databinding.ObservableField<java.lang.Boolean> controllerIsMediaSubstitleEnabled = null;
                // !controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean ControllerIsMediaSubstitleEnabled1 = null;
                // controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean controllerIsMediaSubstitleEnabledGet = null;
                // controller.isMediaSubstitleEnabled != null
                boolean controllerIsMediaSubstitleEnabledJavaLangObjectNull = false;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    controllerIsMediaSubstitleEnabled = controller.isMediaSubstitleEnabled;

                    controllerIsMediaSubstitleEnabledJavaLangObjectNull = (controllerIsMediaSubstitleEnabled) != (null);
                    if (controllerIsMediaSubstitleEnabledJavaLangObjectNull) {


                        controllerIsMediaSubstitleEnabledGet = controllerIsMediaSubstitleEnabled.get();

                        ControllerIsMediaSubstitleEnabled1 = !controllerIsMediaSubstitleEnabledGet;

                        controller.addToMyList(ControllerIsMediaSubstitleEnabled1);
                    }
                }
                break;
            }
            case 24: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 21: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksAudio();
                }
                break;
            }
            case 33: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 20: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksAudio();
                }
                break;
            }
            case 34: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {





                    controller.seekBy((1500) * (10));
                }
                break;
            }
            case 22: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksAudio();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller.isMediaSubstitleEnabled
                androidx.databinding.ObservableField<java.lang.Boolean> controllerIsMediaSubstitleEnabled = null;
                // !controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean ControllerIsMediaSubstitleEnabled1 = null;
                // controller.isMediaSubstitleEnabled.get()
                java.lang.Boolean controllerIsMediaSubstitleEnabledGet = null;
                // controller.isMediaSubstitleEnabled != null
                boolean controllerIsMediaSubstitleEnabledJavaLangObjectNull = false;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {




                    controllerIsMediaSubstitleEnabled = controller.isMediaSubstitleEnabled;

                    controllerIsMediaSubstitleEnabledJavaLangObjectNull = (controllerIsMediaSubstitleEnabled) != (null);
                    if (controllerIsMediaSubstitleEnabledJavaLangObjectNull) {


                        controllerIsMediaSubstitleEnabledGet = controllerIsMediaSubstitleEnabled.get();

                        ControllerIsMediaSubstitleEnabled1 = !controllerIsMediaSubstitleEnabledGet;

                        controller.triggerSubtitlesToggle(ControllerIsMediaSubstitleEnabled1);
                    }
                }
                break;
            }
            case 30: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 32: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.closePlayer();
                }
                break;
            }
            case 31: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 19: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksSubstitles();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onTracksVideo();
                }
                break;
            }
            case 17: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 29: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.nextEpisode();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.scale();
                }
                break;
            }
            case 18: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.onLoadEpisodes();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // controller
                com.streamsaw.ui.player.bindings.PlayerController controller = mController;
                // controller != null
                boolean controllerJavaLangObjectNull = false;



                controllerJavaLangObjectNull = (controller) != (null);
                if (controllerJavaLangObjectNull) {


                    controller.clickQualitySettings();
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnTouch(int sourceId , android.view.View callbackArg_0, android.view.MotionEvent callbackArg_1) {
        // localize variables for thread safety
        // controller
        com.streamsaw.ui.player.bindings.PlayerController controller = mController;
        // controller != null
        boolean controllerJavaLangObjectNull = false;
        // controller.isCurrentVideoAd
        boolean controllerIsCurrentVideoAd = false;



        controllerJavaLangObjectNull = (controller) != (null);
        if (controllerJavaLangObjectNull) {


            controllerIsCurrentVideoAd = controller.isCurrentVideoAd();
        }
        return controllerIsCurrentVideoAd;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.currentMediaCover
        flag 1 (0x2L): controller.videoName
        flag 2 (0x3L): controller.mediaPositionInString
        flag 3 (0x4L): controller.isMediaSubstitleEnabled
        flag 4 (0x5L): controller.mediaBufferedPosition
        flag 5 (0x6L): controller.videoCurrentSubs
        flag 6 (0x7L): controller.adsRemainInString
        flag 7 (0x8L): controller.isLive
        flag 8 (0x9L): controller.mediaEnded
        flag 9 (0xaL): controller.mediaRemainInString
        flag 10 (0xbL): controller.mediaHasSubstitle
        flag 11 (0xcL): controller.addtomylist
        flag 12 (0xdL): controller.mediaCurrentTime
        flag 13 (0xeL): controller.isStreamOnFavorite
        flag 14 (0xfL): controller.isCurrentAd
        flag 15 (0x10L): controller.mediaDuration
        flag 16 (0x11L): controller.playerPlaybackState
        flag 17 (0x12L): controller.videoHasID
        flag 18 (0x13L): controller.isVideoPlayWhenReady
        flag 19 (0x14L): controller
        flag 20 (0x15L): null
        flag 21 (0x16L): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED ? View.VISIBLE : View.GONE
        flag 22 (0x17L): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? true : controller.mediaType.equals("streaming")
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? true : controller.mediaType.equals("streaming")
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.VISIBLE : View.INVISIBLE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.VISIBLE : View.INVISIBLE
        flag 27 (0x1cL): controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
        flag 28 (0x1dL): controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE
        flag 29 (0x1eL): controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1") ? true : controller.mediaType.equals("anime") ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1") ? true : controller.mediaType.equals("anime") ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 33 (0x22L): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
        flag 34 (0x23L): controller.playerPlaybackState.get() == ExoPlayer.STATE_IDLE ? true : controller.playerPlaybackState.get() == ExoPlayer.STATE_ENDED
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get()) ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isLive.get()) ? View.VISIBLE : View.GONE
        flag 37 (0x26L): controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 38 (0x27L): controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 39 (0x28L): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 40 (0x29L): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? true : controller.mediaType.equals("streaming") ? View.INVISIBLE : View.VISIBLE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? true : controller.mediaType.equals("streaming") ? View.INVISIBLE : View.VISIBLE
        flag 43 (0x2cL): controller.mediaRemainInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaRemainInString.get()
        flag 44 (0x2dL): controller.mediaRemainInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaRemainInString.get()
        flag 45 (0x2eL): controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 46 (0x2fL): controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.INVISIBLE : View.VISIBLE
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.INVISIBLE : View.VISIBLE
        flag 49 (0x32L): controller.mediaPositionInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaPositionInString.get()
        flag 50 (0x33L): controller.mediaPositionInString.get() == null ? @android:string/controller_time_position_text_default : controller.mediaPositionInString.get()
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.GONE : View.VISIBLE
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) ? View.GONE : View.VISIBLE
        flag 55 (0x38L): controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? View.GONE : View.VISIBLE
        flag 56 (0x39L): controller.playerPlaybackState.get() == ExoPlayer.STATE_BUFFERING ? View.GONE : View.VISIBLE
        flag 57 (0x3aL): controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1") ? true : controller.mediaType.equals("anime")
        flag 58 (0x3bL): controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1") ? true : controller.mediaType.equals("anime")
        flag 59 (0x3cL): controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 60 (0x3dL): controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 61 (0x3eL): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 62 (0x3fL): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 63 (0x40L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 64 (0x41L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 65 (0x42L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 66 (0x43L): controller.mediaType.equals("0") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 67 (0x44L): androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 68 (0x45L): androidx.databinding.ViewDataBinding.safeUnbox(controller.videoHasID.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 69 (0x46L): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 70 (0x47L): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 71 (0x48L): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? View.VISIBLE : View.GONE
        flag 72 (0x49L): controller.mediaType.equals("streaming") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? View.VISIBLE : View.GONE
        flag 73 (0x4aL): controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1")
        flag 74 (0x4bL): controller.mediaType.equals("streaming") ? true : controller.mediaType.equals("1")
        flag 75 (0x4cL): controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 76 (0x4dL): controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false ? View.VISIBLE : View.GONE
        flag 77 (0x4eL): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 78 (0x4fL): androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaHasSubstitle.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 79 (0x50L): controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 80 (0x51L): controller.mediaType.equals("anime") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controller.isCurrentAd.get()) : false
        flag 81 (0x52L): controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
        flag 82 (0x53L): controller.mediaType.equals("1") ? androidx.databinding.ViewDataBinding.safeUnbox(controller.mediaEnded.get()) == false : false
    flag mapping end*/
    //end
}