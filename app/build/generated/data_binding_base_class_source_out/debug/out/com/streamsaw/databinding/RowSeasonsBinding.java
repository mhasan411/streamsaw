// Generated by data binding compiler. Do not edit!
package com.streamsaw.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.balysv.materialripple.MaterialRippleLayout;
import com.streamsaw.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowSeasonsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView downloadEpisode;

  @NonNull
  public final MaterialRippleLayout epLayout;

  @NonNull
  public final ImageView epcover;

  @NonNull
  public final TextView epnumber;

  @NonNull
  public final TextView epoverview;

  @NonNull
  public final TextView eptitle;

  @NonNull
  public final ProgressBar resumeProgressBar;

  protected RowSeasonsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView downloadEpisode, MaterialRippleLayout epLayout, ImageView epcover,
      TextView epnumber, TextView epoverview, TextView eptitle, ProgressBar resumeProgressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.downloadEpisode = downloadEpisode;
    this.epLayout = epLayout;
    this.epcover = epcover;
    this.epnumber = epnumber;
    this.epoverview = epoverview;
    this.eptitle = eptitle;
    this.resumeProgressBar = resumeProgressBar;
  }

  @NonNull
  public static RowSeasonsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_seasons, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowSeasonsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowSeasonsBinding>inflateInternal(inflater, R.layout.row_seasons, root, attachToRoot, component);
  }

  @NonNull
  public static RowSeasonsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_seasons, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowSeasonsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowSeasonsBinding>inflateInternal(inflater, R.layout.row_seasons, null, false, component);
  }

  public static RowSeasonsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RowSeasonsBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowSeasonsBinding)bind(component, view, R.layout.row_seasons);
  }
}
