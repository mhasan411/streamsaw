// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.viewmodels;

import com.streamsaw.data.repository.MediaRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MoviesListViewModel_Factory implements Factory<MoviesListViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  public MoviesListViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
  }

  @Override
  public MoviesListViewModel get() {
    return newInstance(mediaRepositoryProvider.get());
  }

  public static MoviesListViewModel_Factory create(
      Provider<MediaRepository> mediaRepositoryProvider) {
    return new MoviesListViewModel_Factory(mediaRepositoryProvider);
  }

  public static MoviesListViewModel newInstance(MediaRepository mediaRepository) {
    return new MoviesListViewModel(mediaRepository);
  }
}