// Generated by Dagger (https://dagger.dev).
package com.streamsaw.data.repository;

import com.streamsaw.data.remote.ApiInterface;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Named;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsRepository_MembersInjector implements MembersInjector<SettingsRepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<ApiInterface> requestStatusApiProvider;

  public SettingsRepository_MembersInjector(Provider<ApiInterface> apiInterfaceProvider,
      Provider<ApiInterface> requestStatusApiProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.requestStatusApiProvider = requestStatusApiProvider;
  }

  public static MembersInjector<SettingsRepository> create(
      Provider<ApiInterface> apiInterfaceProvider,
      Provider<ApiInterface> requestStatusApiProvider) {
    return new SettingsRepository_MembersInjector(apiInterfaceProvider, requestStatusApiProvider);
  }

  @Override
  public void injectMembers(SettingsRepository instance) {
    injectApiInterface(instance, apiInterfaceProvider.get());
    injectRequestStatusApi(instance, requestStatusApiProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.data.repository.SettingsRepository.apiInterface")
  public static void injectApiInterface(SettingsRepository instance, ApiInterface apiInterface) {
    instance.apiInterface = apiInterface;
  }

  @InjectedFieldSignature("com.streamsaw.data.repository.SettingsRepository.requestStatusApi")
  @Named("status")
  public static void injectRequestStatusApi(SettingsRepository instance,
      ApiInterface requestStatusApi) {
    instance.requestStatusApi = requestStatusApi;
  }
}