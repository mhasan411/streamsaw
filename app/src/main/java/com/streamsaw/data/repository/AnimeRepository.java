package com.streamsaw.data.repository;


import androidx.lifecycle.LiveData;

import com.streamsaw.data.local.dao.FavoriteDao;
import com.streamsaw.data.local.entity.Media;
import com.streamsaw.data.remote.ApiInterface;
import com.streamsaw.ui.manager.SettingsManager;
import com.streamsaw.data.model.MovieResponse;
import com.streamsaw.data.model.report.Report;

import javax.inject.Inject;
import javax.inject.Singleton;
import io.reactivex.rxjava3.core.Observable;
import timber.log.Timber;


/**
 * Repository that acts as a mediators between different data sources; API network and ROOM database.
 * It abstracts the data sources from the rest of the app
 *
 * @author Yobex.
 */
@Singleton
public class AnimeRepository {

    ApiInterface requestMainApi;


    @Inject
    SettingsManager settingsManager;


    private final FavoriteDao favoriteDao;


    @Inject
    AnimeRepository(ApiInterface requestMainApi , FavoriteDao favoriteDao) {
        this.requestMainApi = requestMainApi;
        this.favoriteDao = favoriteDao;


    }



    // Add Anime in favorite
    public void addFavorite(Media anime) {
        favoriteDao.saveMediaToFavorite(anime);
    }


    // Remove Anime from favorite
    public void removeFavorite(Media mediaDetail) {
        Timber.i("Removing %s to database", mediaDetail.getTitle());
        favoriteDao.deleteMediaFromFavorite(mediaDetail);
    }


    // Return if the movie or serie is in favorite table
    public LiveData<Media> isFavorite(int movieid) {
        return favoriteDao.isFavoriteMovie(movieid);
    }




    // Return Animes List
    public Observable<MovieResponse> getAnimes() {
        return requestMainApi.getAnimes(settingsManager.getSettings().getPurchaseKey());
    }



    // Send Report
    public Observable<Report> getReport(String title,String message) {
        return requestMainApi.report(title,message);
    }



    // Return Anime Details By Id
    public Observable<Media> getAnimeDetails(String animeId) {
        return requestMainApi.getAnimeById(animeId,settingsManager.getSettings().getPurchaseKey());
    }

}
