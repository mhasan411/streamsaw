package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEasyplexPlayerBindingImpl extends ActivityEasyplexPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tubitv_player, 4);
        sViewsWithIds.put(R.id.main_nav_host_fragment, 5);
        sViewsWithIds.put(R.id.exo_track_selection_init_view, 6);
        sViewsWithIds.put(R.id.view_media_is_premuim, 7);
        sViewsWithIds.put(R.id.back_is_premuim, 8);
        sViewsWithIds.put(R.id.close_premuim, 9);
        sViewsWithIds.put(R.id.view_status, 10);
        sViewsWithIds.put(R.id.movie_image, 11);
        sViewsWithIds.put(R.id.movietitle, 12);
        sViewsWithIds.put(R.id.restartApp, 13);
        sViewsWithIds.put(R.id.close_status, 14);
        sViewsWithIds.put(R.id.frame_substitles, 15);
        sViewsWithIds.put(R.id.close_substitle, 16);
        sViewsWithIds.put(R.id.substitle_scroll, 17);
        sViewsWithIds.put(R.id.rv_substitles, 18);
        sViewsWithIds.put(R.id.frame_qualities, 19);
        sViewsWithIds.put(R.id.close_qualities, 20);
        sViewsWithIds.put(R.id.qualities_scroll, 21);
        sViewsWithIds.put(R.id.rv_qualites, 22);
        sViewsWithIds.put(R.id.frame_layout_movies_list, 23);
        sViewsWithIds.put(R.id.close_movies_list, 24);
        sViewsWithIds.put(R.id.movie_list_btn, 25);
        sViewsWithIds.put(R.id.view_text_movie_list_genre_name, 26);
        sViewsWithIds.put(R.id.movies_list_spinner, 27);
        sViewsWithIds.put(R.id.rv_featured, 28);
        sViewsWithIds.put(R.id.noResults, 29);
        sViewsWithIds.put(R.id.view_text_genre_name_selected, 30);
        sViewsWithIds.put(R.id.frame_layout_seasons, 31);
        sViewsWithIds.put(R.id.filter_btn, 32);
        sViewsWithIds.put(R.id.current_selected_seasons, 33);
        sViewsWithIds.put(R.id.scrollView, 34);
        sViewsWithIds.put(R.id.close_episode, 35);
        sViewsWithIds.put(R.id.planets_spinner, 36);
        sViewsWithIds.put(R.id.recycler_view_episodes, 37);
        sViewsWithIds.put(R.id.frame_layout_streaming, 38);
        sViewsWithIds.put(R.id.closeStreaming, 39);
        sViewsWithIds.put(R.id.genreStreamRelative, 40);
        sViewsWithIds.put(R.id.currentStreamingGenre, 41);
        sViewsWithIds.put(R.id.spinnerMediaStreaming, 42);
        sViewsWithIds.put(R.id.recyclerViewStreaming, 43);
        sViewsWithIds.put(R.id.noResultsStream, 44);
        sViewsWithIds.put(R.id.viewTextGenreNameSelectedStream, 45);
        sViewsWithIds.put(R.id.framlayout_media_ended, 46);
        sViewsWithIds.put(R.id.filter_btn_ended, 47);
        sViewsWithIds.put(R.id.selected_season_ended, 48);
        sViewsWithIds.put(R.id.close_media_ended, 49);
        sViewsWithIds.put(R.id.spinner_media_ended, 50);
        sViewsWithIds.put(R.id.rv_episodes_ended, 51);
        sViewsWithIds.put(R.id.nextPlayLayout, 52);
        sViewsWithIds.put(R.id.image_view_movie_next, 53);
        sViewsWithIds.put(R.id.text_view_video_next_name, 54);
        sViewsWithIds.put(R.id.text_view_video_release, 55);
        sViewsWithIds.put(R.id.text_view_video_next_release_date, 56);
        sViewsWithIds.put(R.id.view_media_substitle_support, 57);
        sViewsWithIds.put(R.id.rating_bar, 58);
        sViewsWithIds.put(R.id.vpaid_webview, 59);
        sViewsWithIds.put(R.id.webview_player, 60);
        sViewsWithIds.put(R.id.cuepoint_indictor, 61);
        sViewsWithIds.put(R.id.frame_layout_ads_remaining, 62);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_left, 63);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_right, 64);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_bottom, 65);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_left, 66);
        sViewsWithIds.put(R.id.tubi_tv_controller_guideline_seek_right, 67);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEasyplexPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 68, sIncludes, sViewsWithIds));
    }
    private ActivityEasyplexPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[8]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[49]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[16]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[61]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[41]
            , (com.google.android.exoplayer2.ui.TrackSelectionView) bindings[6]
            , (android.widget.RelativeLayout) bindings[32]
            , (android.widget.RelativeLayout) bindings[47]
            , (android.widget.FrameLayout) bindings[62]
            , (android.widget.FrameLayout) bindings[23]
            , (android.widget.FrameLayout) bindings[31]
            , (android.widget.FrameLayout) bindings[38]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.FrameLayout) bindings[46]
            , (android.widget.RelativeLayout) bindings[40]
            , (android.widget.ImageView) bindings[53]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.RelativeLayout) bindings[25]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[27]
            , (android.widget.TextView) bindings[12]
            , (android.widget.FrameLayout) bindings[52]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[44]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[36]
            , (androidx.core.widget.NestedScrollView) bindings[21]
            , (android.widget.RatingBar) bindings[58]
            , (androidx.recyclerview.widget.RecyclerView) bindings[37]
            , (androidx.recyclerview.widget.RecyclerView) bindings[43]
            , (android.widget.Button) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[51]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.core.widget.NestedScrollView) bindings[34]
            , (android.widget.TextView) bindings[48]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[50]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[42]
            , (androidx.core.widget.NestedScrollView) bindings[17]
            , (android.widget.TextView) bindings[54]
            , (android.widget.TextView) bindings[56]
            , (android.widget.TextView) bindings[55]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[65]
            , (androidx.constraintlayout.widget.Guideline) bindings[63]
            , (androidx.constraintlayout.widget.Guideline) bindings[64]
            , (androidx.constraintlayout.widget.Guideline) bindings[66]
            , (androidx.constraintlayout.widget.Guideline) bindings[67]
            , (com.streamsaw.ui.player.views.TubiExoPlayerView) bindings[4]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.ImageView) bindings[57]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[26]
            , (android.webkit.WebView) bindings[59]
            , (android.webkit.WebView) bindings[60]
            );
        this.coordinator.setTag(null);
        this.textViewVideoTimeRemaining.setTag(null);
        this.viewSerieControllerTitle.setTag(null);
        this.viewSkipText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.controller);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControllerVideoName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeControllerAdsRemainInString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeControllerTimeRemaining((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControllerVideoName(androidx.databinding.ObservableField<java.lang.String> ControllerVideoName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerAdsRemainInString(androidx.databinding.ObservableField<java.lang.String> ControllerAdsRemainInString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControllerTimeRemaining(androidx.databinding.ObservableField<java.lang.String> ControllerTimeRemaining, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> controllerVideoName = null;
        java.lang.String controllerAdsRemainInStringGet = null;
        java.lang.String controllerVideoNameGet = null;
        java.lang.String controllerTimeRemainingGet = null;
        com.streamsaw.ui.player.bindings.PlayerController controller = mController;
        androidx.databinding.ObservableField<java.lang.String> controllerAdsRemainInString = null;
        androidx.databinding.ObservableField<java.lang.String> controllerTimeRemaining = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (controller != null) {
                        // read controller.videoName
                        controllerVideoName = controller.videoName;
                    }
                    updateRegistration(0, controllerVideoName);


                    if (controllerVideoName != null) {
                        // read controller.videoName.get()
                        controllerVideoNameGet = controllerVideoName.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (controller != null) {
                        // read controller.adsRemainInString
                        controllerAdsRemainInString = controller.adsRemainInString;
                    }
                    updateRegistration(1, controllerAdsRemainInString);


                    if (controllerAdsRemainInString != null) {
                        // read controller.adsRemainInString.get()
                        controllerAdsRemainInStringGet = controllerAdsRemainInString.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (controller != null) {
                        // read controller.timeRemaining
                        controllerTimeRemaining = controller.timeRemaining;
                    }
                    updateRegistration(2, controllerTimeRemaining);


                    if (controllerTimeRemaining != null) {
                        // read controller.timeRemaining.get()
                        controllerTimeRemainingGet = controllerTimeRemaining.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewVideoTimeRemaining, controllerTimeRemainingGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewSerieControllerTitle, controllerVideoNameGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.viewSkipText, controllerAdsRemainInStringGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controller.videoName
        flag 1 (0x2L): controller.adsRemainInString
        flag 2 (0x3L): controller.timeRemaining
        flag 3 (0x4L): controller
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}