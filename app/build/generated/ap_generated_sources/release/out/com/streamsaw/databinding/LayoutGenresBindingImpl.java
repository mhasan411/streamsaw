package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutGenresBindingImpl extends LayoutGenresBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.filter_btn, 1);
        sViewsWithIds.put(R.id.selected_genre, 2);
        sViewsWithIds.put(R.id.filter_btn_allgenres, 3);
        sViewsWithIds.put(R.id.selected_genre_left, 4);
        sViewsWithIds.put(R.id.scrollView, 5);
        sViewsWithIds.put(R.id.planets_spinner, 6);
        sViewsWithIds.put(R.id.planets_spinner_sort, 7);
        sViewsWithIds.put(R.id.recyclerView, 8);
        sViewsWithIds.put(R.id.progress_bar, 9);
        sViewsWithIds.put(R.id.noMoviesFound, 10);
        sViewsWithIds.put(R.id.noResults, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutGenresBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private LayoutGenresBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[6]
            , (com.chivorn.smartmaterialspinner.SmartMaterialSpinner) bindings[7]
            , (android.widget.ProgressBar) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
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