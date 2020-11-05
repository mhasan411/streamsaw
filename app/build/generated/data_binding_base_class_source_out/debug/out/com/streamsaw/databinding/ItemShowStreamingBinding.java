// Generated by data binding compiler. Do not edit!
package com.streamsaw.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.streamsaw.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemShowStreamingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView itemMovieImage;

  @NonNull
  public final TextView mgenres;

  @NonNull
  public final TextView moviePremuim;

  @NonNull
  public final TextView movietitle;

  @NonNull
  public final LinearLayout rootLayout;

  protected ItemShowStreamingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView itemMovieImage, TextView mgenres, TextView moviePremuim, TextView movietitle,
      LinearLayout rootLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemMovieImage = itemMovieImage;
    this.mgenres = mgenres;
    this.moviePremuim = moviePremuim;
    this.movietitle = movietitle;
    this.rootLayout = rootLayout;
  }

  @NonNull
  public static ItemShowStreamingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_show_streaming, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemShowStreamingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemShowStreamingBinding>inflateInternal(inflater, R.layout.item_show_streaming, root, attachToRoot, component);
  }

  @NonNull
  public static ItemShowStreamingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_show_streaming, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemShowStreamingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemShowStreamingBinding>inflateInternal(inflater, R.layout.item_show_streaming, null, false, component);
  }

  public static ItemShowStreamingBinding bind(@NonNull View view) {
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
  public static ItemShowStreamingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemShowStreamingBinding)bind(component, view, R.layout.item_show_streaming);
  }
}
