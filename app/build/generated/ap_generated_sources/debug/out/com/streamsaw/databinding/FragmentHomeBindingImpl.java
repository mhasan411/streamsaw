package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.logo_image_top, 3);
        sViewsWithIds.put(R.id.scrollView, 4);
        sViewsWithIds.put(R.id.rv_featured, 5);
        sViewsWithIds.put(R.id.indicator, 6);
        sViewsWithIds.put(R.id.linear_latest_channels, 7);
        sViewsWithIds.put(R.id.linear_latest_channels_image, 8);
        sViewsWithIds.put(R.id.rv_latest_streaming, 9);
        sViewsWithIds.put(R.id.linear_watch, 10);
        sViewsWithIds.put(R.id.linear_watch_image, 11);
        sViewsWithIds.put(R.id.rv_countinue_watching, 12);
        sViewsWithIds.put(R.id.rv_recommended, 13);
        sViewsWithIds.put(R.id.rv_trending, 14);
        sViewsWithIds.put(R.id.image_ads, 15);
        sViewsWithIds.put(R.id.view_ad_text, 16);
        sViewsWithIds.put(R.id.ad_view_container, 17);
        sViewsWithIds.put(R.id.rv_latest, 18);
        sViewsWithIds.put(R.id.rv_series_popular, 19);
        sViewsWithIds.put(R.id.rv_series_recents, 20);
        sViewsWithIds.put(R.id.rv_newthisweek, 21);
        sViewsWithIds.put(R.id.rv_animes_linear, 22);
        sViewsWithIds.put(R.id.rv_animes, 23);
        sViewsWithIds.put(R.id.rv_popular, 24);
        sViewsWithIds.put(R.id.progress_bar, 25);
        sViewsWithIds.put(R.id.view_status, 26);
        sViewsWithIds.put(R.id.movie_image, 27);
        sViewsWithIds.put(R.id.movietitle, 28);
        sViewsWithIds.put(R.id.restartApp, 29);
        sViewsWithIds.put(R.id.close_status, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[17]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[15]
            , (me.relex.circleindicator.CircleIndicator2) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.TextView) bindings[28]
            , (android.widget.ProgressBar) bindings[25]
            , (android.widget.Button) bindings[29]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (android.widget.LinearLayout) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.TextView) bindings[16]
            , (android.widget.FrameLayout) bindings[26]
            );
        this.constraintLayout.setTag(null);
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