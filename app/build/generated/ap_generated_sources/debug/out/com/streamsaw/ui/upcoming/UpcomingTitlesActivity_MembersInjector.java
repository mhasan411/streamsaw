// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.upcoming;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpcomingTitlesActivity_MembersInjector implements MembersInjector<UpcomingTitlesActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public UpcomingTitlesActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UpcomingTitlesActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new UpcomingTitlesActivity_MembersInjector(androidInjectorProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UpcomingTitlesActivity instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.upcoming.UpcomingTitlesActivity.androidInjector")
  public static void injectAndroidInjector(UpcomingTitlesActivity instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }

  @InjectedFieldSignature("com.streamsaw.ui.upcoming.UpcomingTitlesActivity.viewModelFactory")
  public static void injectViewModelFactory(UpcomingTitlesActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
