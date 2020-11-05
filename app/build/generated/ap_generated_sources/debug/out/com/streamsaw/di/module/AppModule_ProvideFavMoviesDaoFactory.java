// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.data.local.EasyPlexDatabase;
import com.streamsaw.data.local.dao.FavoriteDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFavMoviesDaoFactory implements Factory<FavoriteDao> {
  private final AppModule module;

  private final Provider<EasyPlexDatabase> dbProvider;

  public AppModule_ProvideFavMoviesDaoFactory(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public FavoriteDao get() {
    return provideFavMoviesDao(module, dbProvider.get());
  }

  public static AppModule_ProvideFavMoviesDaoFactory create(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    return new AppModule_ProvideFavMoviesDaoFactory(module, dbProvider);
  }

  public static FavoriteDao provideFavMoviesDao(AppModule instance, EasyPlexDatabase db) {
    return Preconditions.checkNotNull(instance.provideFavMoviesDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
