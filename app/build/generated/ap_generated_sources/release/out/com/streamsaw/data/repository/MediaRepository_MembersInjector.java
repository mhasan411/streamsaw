// Generated by Dagger (https://dagger.dev).
package com.streamsaw.data.repository;

import com.streamsaw.data.remote.ApiInterface;
import com.streamsaw.ui.manager.SettingsManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Named;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MediaRepository_MembersInjector implements MembersInjector<MediaRepository> {
  private final Provider<ApiInterface> requestImdbApiProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ApiInterface> requestAppApiProvider;

  public MediaRepository_MembersInjector(Provider<ApiInterface> requestImdbApiProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider) {
    this.requestImdbApiProvider = requestImdbApiProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.requestAppApiProvider = requestAppApiProvider;
  }

  public static MembersInjector<MediaRepository> create(
      Provider<ApiInterface> requestImdbApiProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider) {
    return new MediaRepository_MembersInjector(requestImdbApiProvider, settingsManagerProvider, requestAppApiProvider);
  }

  @Override
  public void injectMembers(MediaRepository instance) {
    injectRequestImdbApi(instance, requestImdbApiProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectRequestAppApi(instance, requestAppApiProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.data.repository.MediaRepository.requestImdbApi")
  @Named("imdb")
  public static void injectRequestImdbApi(MediaRepository instance, ApiInterface requestImdbApi) {
    instance.requestImdbApi = requestImdbApi;
  }

  @InjectedFieldSignature("com.streamsaw.data.repository.MediaRepository.settingsManager")
  public static void injectSettingsManager(MediaRepository instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.streamsaw.data.repository.MediaRepository.requestAppApi")
  @Named("app")
  public static void injectRequestAppApi(MediaRepository instance, ApiInterface requestAppApi) {
    instance.requestAppApi = requestAppApi;
  }
}
