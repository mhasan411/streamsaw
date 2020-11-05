package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStreamingBindingImpl extends FragmentStreamingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.filter_btn, 1);
        sViewsWithIds.put(R.id.selected_genre, 2);
        sViewsWithIds.put(R.id.filter_btn_favorite, 3);
        sViewsWithIds.put(R.id.scrollView, 4);
        sViewsWithIds.put(R.id.planets_spinner, 5);
        sViewsWithIds.put(R.id.recyclerView, 6);
        sViewsWithIds.put(R.id.rv_featured, 7);
        sViewsWithIds.put(R.id.indicator, 8);
        sViewsWithIds.put(R.id.linear_watch, 9);
        sViewsWithIds.put(R.id.linear_watch_image, 10);
        sViewsWithIds.put(R.id.rv_latest_streaming, 11);
        sViewsWithIds.put(R.id.linear_watch_image2, 12);
        sViewsWithIds.put(R.id.linear_watch2, 13);
        sViewsWithIds.put(R.id.rv_most_watched_streamning, 14);
        sViewsWithIds.put(R.id.linear_favorite_image2, 15);
        sViewsWithIds.put(R.id.linear_favorite, 16);
        sViewsWithIds.put(R.id.rv_favorite_streamning, 17);
        sViewsWithIds.put(R.id.noResultsList, 18);
        sViewsWithIds.put(R.id.progress_bar, 19);
        sViewsWithIds.put(R.id.noMoviesFound, 20);
        sViewsWithIds.put(R.id.noResults, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStreamingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentStreamingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[3]
            , (me.relex.circleindicator.CircleIndicator2) bindings[8]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.LinearLayout) bindings[18]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[5]
            , (android.widget.ProgressBar) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (android.widget.TextView) bindings[2]
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