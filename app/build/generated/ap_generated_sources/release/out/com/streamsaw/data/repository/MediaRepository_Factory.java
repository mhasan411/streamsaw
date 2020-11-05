// Generated by Dagger (https://dagger.dev).
package com.streamsaw.data.repository;

import com.streamsaw.data.local.dao.DownloadDao;
import com.streamsaw.data.local.dao.FavoriteDao;
import com.streamsaw.data.local.dao.HistoryDao;
import com.streamsaw.data.local.dao.StreamListDao;
import com.streamsaw.data.remote.ApiInterface;
import com.streamsaw.ui.manager.SettingsManager;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MediaRepository_Factory implements Factory<MediaRepository> {
  private final Provider<FavoriteDao> favoriteDaoProvider;

  private final Provider<DownloadDao> downloadDaoProvider;

  private final Provider<ApiInterface> requestMainApiProvider;

  private final Provider<ApiInterface> requestImdbApiProvider;

  private final Provider<HistoryDao> historyDaoProvider;

  private final Provider<StreamListDao> streamListDaoProvider;

  private final Provider<ApiInterface> requestImdbApiProvider2;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ApiInterface> requestAppApiProvider;

  public MediaRepository_Factory(Provider<FavoriteDao> favoriteDaoProvider,
      Provider<DownloadDao> downloadDaoProvider, Provider<ApiInterface> requestMainApiProvider,
      Provider<ApiInterface> requestImdbApiProvider, Provider<HistoryDao> historyDaoProvider,
      Provider<StreamListDao> streamListDaoProvider, Provider<ApiInterface> requestImdbApiProvider2,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider) {
    this.favoriteDaoProvider = favoriteDaoProvider;
    this.downloadDaoProvider = downloadDaoProvider;
    this.requestMainApiProvider = requestMainApiProvider;
    this.requestImdbApiProvider = requestImdbApiProvider;
    this.historyDaoProvider = historyDaoProvider;
    this.streamListDaoProvider = streamListDaoProvider;
    this.requestImdbApiProvider2 = requestImdbApiProvider2;
    this.settingsManagerProvider = settingsManagerProvider;
    this.requestAppApiProvider = requestAppApiProvider;
  }

  @Override
  public MediaRepository get() {
    MediaRepository instance = newInstance(favoriteDaoProvider.get(), downloadDaoProvider.get(), requestMainApiProvider.get(), requestImdbApiProvider.get(), historyDaoProvider.get(), streamListDaoProvider.get());
    MediaRepository_MembersInjector.injectRequestImdbApi(instance, requestImdbApiProvider2.get());
    MediaRepository_MembersInjector.injectSettingsManager(instance, settingsManagerProvider.get());
    MediaRepository_MembersInjector.injectRequestAppApi(instance, requestAppApiProvider.get());
    return instance;
  }

  public static MediaRepository_Factory create(Provider<FavoriteDao> favoriteDaoProvider,
      Provider<DownloadDao> downloadDaoProvider, Provider<ApiInterface> requestMainApiProvider,
      Provider<ApiInterface> requestImdbApiProvider, Provider<HistoryDao> historyDaoProvider,
      Provider<StreamListDao> streamListDaoProvider, Provider<ApiInterface> requestImdbApiProvider2,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider) {
    return new MediaRepository_Factory(favoriteDaoProvider, downloadDaoProvider, requestMainApiProvider, requestImdbApiProvider, historyDaoProvider, streamListDaoProvider, requestImdbApiProvider2, settingsManagerProvider, requestAppApiProvider);
  }

  public static MediaRepository newInstance(FavoriteDao favoriteDao, DownloadDao downloadDao,
      ApiInterface requestMainApi, ApiInterface requestImdbApi, HistoryDao historyDao,
      StreamListDao streamListDao) {
    return new MediaRepository(favoriteDao, downloadDao, requestMainApi, requestImdbApi, historyDao, streamListDao);
  }
}