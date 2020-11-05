package com.streamsaw.databinding;
import com.streamsaw.R;
import com.streamsaw.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySettingBindingImpl extends ActivitySettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.logo_image_top, 3);
        sViewsWithIds.put(R.id.scrollView, 4);
        sViewsWithIds.put(R.id.auth_name, 5);
        sViewsWithIds.put(R.id.logout, 6);
        sViewsWithIds.put(R.id.auth_email, 7);
        sViewsWithIds.put(R.id.auth_free, 8);
        sViewsWithIds.put(R.id.btn_premuim, 9);
        sViewsWithIds.put(R.id.membership_expire_in, 10);
        sViewsWithIds.put(R.id.btn_login, 11);
        sViewsWithIds.put(R.id.btn_edit_profile, 12);
        sViewsWithIds.put(R.id.subcribe_button, 13);
        sViewsWithIds.put(R.id.cancel_subcription_button, 14);
        sViewsWithIds.put(R.id.switch_push_notification, 15);
        sViewsWithIds.put(R.id.wifi_switch, 16);
        sViewsWithIds.put(R.id.autoplay_switch, 17);
        sViewsWithIds.put(R.id.download_list, 18);
        sViewsWithIds.put(R.id.substitle_size, 19);
        sViewsWithIds.put(R.id.current_size, 20);
        sViewsWithIds.put(R.id.ClearMyList, 21);
        sViewsWithIds.put(R.id.clearMyWatchHistory, 22);
        sViewsWithIds.put(R.id.linear_layout_clea_cache, 23);
        sViewsWithIds.put(R.id.privacy_policy, 24);
        sViewsWithIds.put(R.id.aboutus, 25);
        sViewsWithIds.put(R.id.view_plans, 26);
        sViewsWithIds.put(R.id.movie_image, 27);
        sViewsWithIds.put(R.id.recycler_view_plans, 28);
        sViewsWithIds.put(R.id.close_plans, 29);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivitySettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[25]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.SwitchCompat) bindings[17]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[14]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.TextView) bindings[20]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.LinearLayout) bindings[24]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (android.widget.Button) bindings[13]
            , (android.widget.LinearLayout) bindings[19]
            , (androidx.appcompat.widget.SwitchCompat) bindings[15]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.FrameLayout) bindings[26]
            , (androidx.appcompat.widget.SwitchCompat) bindings[16]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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