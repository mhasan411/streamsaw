// Generated by Dagger (https://dagger.dev).
package com.streamsaw.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MoviesViewModelFactory_Factory implements Factory<MoviesViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider;

  public MoviesViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public MoviesViewModelFactory get() {
    return newInstance(creatorsProvider.get());
  }

  public static MoviesViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    return new MoviesViewModelFactory_Factory(creatorsProvider);
  }

  public static MoviesViewModelFactory newInstance(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> creators) {
    return new MoviesViewModelFactory(creators);
  }
}
