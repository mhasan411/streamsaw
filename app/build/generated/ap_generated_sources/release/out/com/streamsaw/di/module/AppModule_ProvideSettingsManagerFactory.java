// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import android.app.Application;
import com.streamsaw.ui.manager.SettingsManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSettingsManagerFactory implements Factory<SettingsManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideSettingsManagerFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SettingsManager get() {
    return provideSettingsManager(module, applicationProvider.get());
  }

  public static AppModule_ProvideSettingsManagerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideSettingsManagerFactory(module, applicationProvider);
  }

  public static SettingsManager provideSettingsManager(AppModule instance,
      Application application) {
    return Preconditions.checkNotNull(instance.provideSettingsManager(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}