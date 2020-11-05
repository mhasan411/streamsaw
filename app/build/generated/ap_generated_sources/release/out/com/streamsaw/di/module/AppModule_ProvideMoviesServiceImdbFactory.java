// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.data.remote.ApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMoviesServiceImdbFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideMoviesServiceImdbFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideMoviesServiceImdb(module);
  }

  public static AppModule_ProvideMoviesServiceImdbFactory create(AppModule module) {
    return new AppModule_ProvideMoviesServiceImdbFactory(module);
  }

  public static ApiInterface provideMoviesServiceImdb(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideMoviesServiceImdb(), "Cannot return null from a non-@Nullable @Provides method");
  }
}