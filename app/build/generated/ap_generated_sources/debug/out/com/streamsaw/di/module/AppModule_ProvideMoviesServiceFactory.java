// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.data.remote.ApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMoviesServiceFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideMoviesServiceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideMoviesService(module);
  }

  public static AppModule_ProvideMoviesServiceFactory create(AppModule module) {
    return new AppModule_ProvideMoviesServiceFactory(module);
  }

  public static ApiInterface provideMoviesService(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideMoviesService(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
