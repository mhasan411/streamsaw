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

public abstract class ItemUpcomingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageViewShowCard;

  @NonNull
  public final TextView releaseShowCard;

  @NonNull
  public final TextView textViewGenreShowCard;

  @NonNull
  public final TextView textViewTitleShowCard;

  @NonNull
  public final RelativeLayout upcomingRelative;

  protected ItemUpcomingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageViewShowCard, TextView releaseShowCard, TextView textViewGenreShowCard,
      TextView textViewTitleShowCard, RelativeLayout upcomingRelative) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageViewShowCard = imageViewShowCard;
    this.releaseShowCard = releaseShowCard;
    this.textViewGenreShowCard = textViewGenreShowCard;
    this.textViewTitleShowCard = textViewTitleShowCard;
    this.upcomingRelative = upcomingRelative;
  }

  @NonNull
  public static ItemUpcomingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_upcoming, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemUpcomingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemUpcomingBinding>inflateInternal(inflater, R.layout.item_upcoming, root, attachToRoot, component);
  }

  @NonNull
  public static ItemUpcomingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_upcoming, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemUpcomingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemUpcomingBinding>inflateInternal(inflater, R.layout.item_upcoming, null, false, component);
  }

  public static ItemUpcomingBinding bind(@NonNull View view) {
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
  public static ItemUpcomingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemUpcomingBinding)bind(component, view, R.layout.item_upcoming);
  }
}
