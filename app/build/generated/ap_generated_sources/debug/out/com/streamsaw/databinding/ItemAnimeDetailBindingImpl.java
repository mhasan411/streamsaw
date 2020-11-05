package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAnimeDetailBindingImpl extends ItemAnimeDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.collapsing_toolbar, 2);
        sViewsWithIds.put(R.id.MovieCover, 3);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.planets_spinner, 5);
        sViewsWithIds.put(R.id.scrollView, 6);
        sViewsWithIds.put(R.id.rating_bar, 7);
        sViewsWithIds.put(R.id.serieTitle, 8);
        sViewsWithIds.put(R.id.mrelease, 9);
        sViewsWithIds.put(R.id.mseason, 10);
        sViewsWithIds.put(R.id.mgenres, 11);
        sViewsWithIds.put(R.id.serieOverview, 12);
        sViewsWithIds.put(R.id.RecycleViewTrailerLayout, 13);
        sViewsWithIds.put(R.id.lyt_not_found, 14);
        sViewsWithIds.put(R.id.ButtonPlayTrailer, 15);
        sViewsWithIds.put(R.id.season_current, 16);
        sViewsWithIds.put(R.id.recycler_view_episodes, 17);
        sViewsWithIds.put(R.id.backbutton, 18);
        sViewsWithIds.put(R.id.report, 19);
        sViewsWithIds.put(R.id.favoriteIcon, 20);
        sViewsWithIds.put(R.id.shareIcon, 21);
        sViewsWithIds.put(R.id.progress_bar, 22);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAnimeDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ItemAnimeDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[15]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[13]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[18]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[2]
            , (com.streamsaw.util.WishListIconView) bindings[20]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[5]
            , (android.widget.ProgressBar) bindings[22]
            , (android.widget.RatingBar) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (android.widget.ImageView) bindings[19]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[21]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
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