// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesCompositeDisposableFactory implements Factory<CompositeDisposable> {
  private final AppModule module;

  public AppModule_ProvidesCompositeDisposableFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CompositeDisposable get() {
    return providesCompositeDisposable(module);
  }

  public static AppModule_ProvidesCompositeDisposableFactory create(AppModule module) {
    return new AppModule_ProvidesCompositeDisposableFactory(module);
  }

  public static CompositeDisposable providesCompositeDisposable(AppModule instance) {
    return Preconditions.checkNotNull(instance.providesCompositeDisposable(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
