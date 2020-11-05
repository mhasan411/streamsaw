// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.settings;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.streamsaw.ui.manager.AdsManager;
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
public final class SettingsActivity_MembersInjector implements MembersInjector<SettingsActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<AuthManager> authManagerProvider;

  public SettingsActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<AuthManager> authManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.authManagerProvider = authManagerProvider;
  }

  public static MembersInjector<SettingsActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<AuthManager> authManagerProvider) {
    return new SettingsActivity_MembersInjector(viewModelFactoryProvider, sharedPreferencesEditorProvider, sharedPreferencesProvider, tokenManagerProvider, settingsManagerProvider, adsManagerProvider, authManagerProvider);
  }

  @Override
  public void injectMembers(SettingsActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.settings.SettingsActivity.viewModelFactory")
  public static void injectViewModelFactory(SettingsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.streamsaw.ui.settings.SettingsActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(SettingsActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.streamsaw.ui.settings.SettingsActivity.sharedPreferences")
  public static void injectSharedPreferences(SettingsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.streamsaw.ui.settings.SettingsActivity.tokenManager")
  public static void injectTokenManager(SettingsActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.settings.SettingsActivity.settingsManager")
  public static void injectSettingsManager(SettingsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.settings.SettingsActivity.adsManager")
  public static void injectAdsManager(SettingsActivity instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.settings.SettingsActivity.authManager")
  public static void injectAuthManager(SettingsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }
}