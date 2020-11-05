// Generated by data binding compiler. Do not edit!
package com.streamsaw.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.streamsaw.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemDownloadBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageViewShowCard;

  @NonNull
  public final TextView textViewDelete;

  @NonNull
  public final TextView textViewTitleShowCard;

  @NonNull
  public final RelativeLayout upcomingRelative;

  protected ListItemDownloadBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageViewShowCard, TextView textViewDelete, TextView textViewTitleShowCard,
      RelativeLayout upcomingRelative) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageViewShowCard = imageViewShowCard;
    this.textViewDelete = textViewDelete;
    this.textViewTitleShowCard = textViewTitleShowCard;
    this.upcomingRelative = upcomingRelative;
  }

  @NonNull
  public static ListItemDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_download, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemDownloadBinding>inflateInternal(inflater, R.layout.list_item_download, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemDownloadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_download, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemDownloadBinding>inflateInternal(inflater, R.layout.list_item_download, null, false, component);
  }

  public static ListItemDownloadBinding bind(@NonNull View view) {
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
  public static ListItemDownloadBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemDownloadBinding)bind(component, view, R.layout.list_item_download);
  }
}
