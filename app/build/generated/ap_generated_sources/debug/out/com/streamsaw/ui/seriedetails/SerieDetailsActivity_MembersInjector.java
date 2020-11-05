// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.seriedetails;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.streamsaw.data.repository.MediaRepository;
import com.streamsaw.data.repository.SettingsRepository;
import com.streamsaw.ui.manager.AuthManager;
import com.streamsaw.ui.manager.SettingsManager;
import com.streamsaw.ui.manager.TokenManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SerieDetailsActivity_MembersInjector implements MembersInjector<SerieDetailsActivity> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<SettingsRepository> authRepositoryProvider;

  public SerieDetailsActivity_MembersInjector(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SettingsRepository> authRepositoryProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.authManagerProvider = authManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
  }

  public static MembersInjector<SerieDetailsActivity> create(
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SettingsRepository> authRepositoryProvider) {
    return new SerieDetailsActivity_MembersInjector(mediaRepositoryProvider, settingsManagerProvider, tokenManagerProvider, viewModelFactoryProvider, sharedPreferencesProvider, authManagerProvider, authRepositoryProvider);
  }

  @Override
  public void injectMembers(SerieDetailsActivity instance) {
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.seriedetails.SerieDetailsActivity.mediaRepository")
  public static void injectMediaRepository(SerieDetailsActivity instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.streamsaw.ui.seriedetails.SerieDetailsActivity.settingsManager")
  public static void injectSettingsManager(SerieDetailsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.seriedetails.SerieDetailsActivity.tokenManager")
  public static void injectTokenManager(SerieDetailsActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.seriedetails.SerieDetailsActivity.viewModelFactory")
  public static void injectViewModelFactory(SerieDetailsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.streamsaw.ui.seriedetails.SerieDetailsActivity.sharedPreferences")
  public static void injectSharedPreferences(SerieDetailsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.streamsaw.ui.seriedetails.SerieDetailsActivity.authManager")
  public static void injectAuthManager(SerieDetailsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.seriedetails.SerieDetailsActivity.authRepository")
  public static void injectAuthRepository(SerieDetailsActivity instance,
      SettingsRepository authRepository) {
    instance.authRepository = authRepository;
  }
}
