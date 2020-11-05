// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import android.app.Application;
import com.streamsaw.ui.manager.AuthManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAuthManagerFactory implements Factory<AuthManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideAuthManagerFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AuthManager get() {
    return provideAuthManager(module, applicationProvider.get());
  }

  public static AppModule_ProvideAuthManagerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideAuthManagerFactory(module, applicationProvider);
  }

  public static AuthManager provideAuthManager(AppModule instance, Application application) {
    return Preconditions.checkNotNull(instance.provideAuthManager(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}