// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.base;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.streamsaw.ui.manager.AdsManager;
import com.streamsaw.ui.manager.SettingsManager;
import com.streamsaw.ui.manager.StatusManager;
import com.streamsaw.ui.manager.TokenManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<StatusManager> statusManagerProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<SharedPreferences.Editor> editorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BaseActivity_MembersInjector(Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<StatusManager> statusManagerProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> editorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.tokenManagerProvider = tokenManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.statusManagerProvider = statusManagerProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.editorProvider = editorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BaseActivity> create(Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<StatusManager> statusManagerProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> editorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BaseActivity_MembersInjector(tokenManagerProvider, settingsManagerProvider, adsManagerProvider, statusManagerProvider, sharedPreferencesProvider, editorProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectStatusManager(instance, statusManagerProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectEditor(instance, editorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.base.BaseActivity.tokenManager")
  public static void injectTokenManager(BaseActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.base.BaseActivity.settingsManager")
  public static void injectSettingsManager(BaseActivity instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.base.BaseActivity.adsManager")
  public static void injectAdsManager(BaseActivity instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.base.BaseActivity.statusManager")
  public static void injectStatusManager(BaseActivity instance, StatusManager statusManager) {
    instance.statusManager = statusManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.base.BaseActivity.sharedPreferences")
  public static void injectSharedPreferences(BaseActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.streamsaw.ui.base.BaseActivity.editor")
  public static void injectEditor(BaseActivity instance, SharedPreferences.Editor editor) {
    instance.editor = editor;
  }

  @InjectedFieldSignature("com.streamsaw.ui.base.BaseActivity.viewModelFactory")
  public static void injectViewModelFactory(BaseActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}