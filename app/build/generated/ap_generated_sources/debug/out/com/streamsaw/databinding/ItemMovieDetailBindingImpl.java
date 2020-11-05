package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMovieDetailBindingImpl extends ItemMovieDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.collapsing_toolbar, 2);
        sViewsWithIds.put(R.id.image_movie_poster, 3);
        sViewsWithIds.put(R.id.mPlay, 4);
        sViewsWithIds.put(R.id.PlayButtonIcon, 5);
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.item_detail_container, 7);
        sViewsWithIds.put(R.id.rating_bar, 8);
        sViewsWithIds.put(R.id.view_movie_rating, 9);
        sViewsWithIds.put(R.id.text_movie_title, 10);
        sViewsWithIds.put(R.id.text_movie_release, 11);
        sViewsWithIds.put(R.id.mgenres, 12);
        sViewsWithIds.put(R.id.text_overview_label, 13);
        sViewsWithIds.put(R.id.time_remaning, 14);
        sViewsWithIds.put(R.id.resume_progress_bar, 15);
        sViewsWithIds.put(R.id.ad_view_container, 16);
        sViewsWithIds.put(R.id.banner_container, 17);
        sViewsWithIds.put(R.id.RecycleViewTrailerLayout, 18);
        sViewsWithIds.put(R.id.ButtonPlayTrailer, 19);
        sViewsWithIds.put(R.id.download_movie, 20);
        sViewsWithIds.put(R.id.recycler_view_cast_movie_detail, 21);
        sViewsWithIds.put(R.id.rv_mylike, 22);
        sViewsWithIds.put(R.id.related_not_found, 23);
        sViewsWithIds.put(R.id.backbutton, 24);
        sViewsWithIds.put(R.id.report, 25);
        sViewsWithIds.put(R.id.favoriteIcon, 26);
        sViewsWithIds.put(R.id.shareIcon, 27);
        sViewsWithIds.put(R.id.progress_bar, 28);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMovieDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ItemMovieDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[19]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.FrameLayout) bindings[16]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.LinearLayout) bindings[17]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[2]
            , (android.widget.Button) bindings[20]
            , (com.streamsaw.util.WishListIconView) bindings[26]
            , (android.widget.ImageView) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[28]
            , (android.widget.RatingBar) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ProgressBar) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            , (android.widget.TextView) bindings[9]
            );
        this.myCoordinatorLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}