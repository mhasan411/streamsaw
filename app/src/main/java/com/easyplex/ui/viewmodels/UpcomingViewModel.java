package com.easyplex.ui.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.easyplex.data.model.MovieResponse;
import com.easyplex.data.model.status.Status;
import com.easyplex.data.model.upcoming.Upcoming;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.data.repository.MediaRepository;

import javax.inject.Inject;
import javax.inject.Named;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import timber.log.Timber;

public class UpcomingViewModel extends ViewModel {


    private MediaRepository mediaRepository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    public final MutableLiveData<Upcoming> upcomingMutableLiveData;
    public final MutableLiveData<MovieResponse> upcomingResponseMutableLive;


    @Inject
    @Named("status")
    ApiInterface requestStatusApi;

    @Inject
    UpcomingViewModel(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
        upcomingMutableLiveData = new MutableLiveData<>();
        upcomingResponseMutableLive = new MutableLiveData<>();


    }



    // Fetch Upcoming Movies
    public void getUpcomingMovie() {
        compositeDisposable.add(mediaRepository.getUpcoming()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .cache()
                .subscribe(upcomingResponseMutableLive::postValue, this::handleError)
        );
    }



    // Fetch Upcoming Movie Detail
    public void getUpcomingMovieDetail(int movieId) {
        compositeDisposable.add(mediaRepository.getUpcomingById(movieId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .cache()
                .subscribe(upcomingMutableLiveData::postValue, this::handleError)
        );
    }



    // Return Status
    public Observable<Status> getApiStatus(String key) {
        return requestStatusApi.getApiStatus(key);
    }


    // Handle Errors
    private void handleError(Throwable e) {
        e.printStackTrace();
        Timber.i("In onError()%s", e.getMessage());
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.clear();
    }


}
