package com.streamsaw.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.Nullable;
import androidx.room.Room;
import com.streamsaw.data.local.EasyPlexDatabase;
import com.streamsaw.data.local.dao.DownloadDao;
import com.streamsaw.data.local.dao.HistoryDao;
import com.streamsaw.data.local.dao.StreamListDao;
import com.streamsaw.data.model.ads.AdMediaModel;
import com.streamsaw.data.model.ads.AdRetriever;
import com.streamsaw.data.model.ads.CuePointsRetriever;
import com.streamsaw.data.model.media.MediaModel;
import com.streamsaw.data.remote.ApiInterface;
import com.streamsaw.ui.manager.AdsManager;
import com.streamsaw.ui.manager.AuthManager;
import com.streamsaw.ui.manager.SettingsManager;
import com.streamsaw.ui.manager.StatusManager;
import com.streamsaw.ui.manager.TokenManager;
import com.streamsaw.data.local.dao.FavoriteDao;
import com.streamsaw.data.remote.ServiceGenerator;
import com.streamsaw.di.ViewModelModule;
import com.streamsaw.ui.player.controller.PlayerAdLogicController;
import com.streamsaw.ui.player.controller.PlayerUIController;
import com.streamsaw.ui.player.fsm.callback.AdInterface;
import com.streamsaw.ui.player.fsm.callback.CuePointCallBack;
import com.streamsaw.ui.player.fsm.callback.RetrieveAdCallback;
import com.streamsaw.ui.player.fsm.concrete.FetchCuePointState;
import com.streamsaw.ui.player.fsm.concrete.factory.StateFactory;
import com.streamsaw.ui.player.fsm.listener.AdPlayingMonitor;
import com.streamsaw.ui.player.fsm.listener.CuePointMonitor;
import com.streamsaw.ui.player.fsm.state_machine.FsmPlayer;
import com.streamsaw.ui.player.fsm.state_machine.FsmPlayerImperial;
import com.streamsaw.ui.player.interfaces.VpaidClient;
import com.streamsaw.ui.player.utilities.TrackSelectionDialog;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

import static android.content.Context.MODE_PRIVATE;
import static com.streamsaw.util.Constants.PREF_FILE;


/**
 * Application-wide dependencies.
 * Module means the class which contains methods who will provide dependencies.
 *
 * @author Yobex.
 */


@Module(includes = ViewModelModule.class)
public
class AppModule {


    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application.getApplicationContext();
    }



    @Provides
    @Singleton
    TrackSelectionDialog provideTrackSelectionDialog(){

        return new TrackSelectionDialog();

    }


    @Provides
    @Singleton
    ApiInterface provideMoviesService() {
        return ServiceGenerator.createService(ApiInterface.class);

    }





    @Provides
    @Singleton
    @Named("app")
    ApiInterface provideServiceApp() {
        return ServiceGenerator.createServiceApp(ApiInterface.class);

    }

    @Provides
    @Singleton
    @Named("status")
    ApiInterface provideServiceStatus(SettingsManager tokenManager) {
        return ServiceGenerator.createServiceWithStatus(ApiInterface.class,tokenManager);

    }

    @Provides
    @Singleton
    @Named("imdb")
    ApiInterface provideMoviesServiceImdb() {
        return ServiceGenerator.createServiceImdb(ApiInterface.class);

    }

    @Provides
    @Singleton
    @Named("Auth")
    ApiInterface provideServiceAuth(TokenManager tokenManager) {
        return ServiceGenerator.createServiceWithAuth(ApiInterface.class,tokenManager);

    }


    @Singleton
    @Provides
    EasyPlexDatabase provideDb(Application app) {
        return Room.databaseBuilder(app, EasyPlexDatabase.class, "easyplex.db").allowMainThreadQueries().fallbackToDestructiveMigration().build();
    }

    @Singleton
    @Provides
    FavoriteDao provideFavMoviesDao(EasyPlexDatabase db) {
        return db.favoriteDao();
    }


    @Singleton
    @Provides
    DownloadDao provideProgressDao(EasyPlexDatabase db){

        return db.progressDao();

    }


    @Singleton
    @Provides
    StreamListDao provideStreamyDao(EasyPlexDatabase db){

        return db.streamListDao();

    }

    @Singleton
    @Provides
    HistoryDao provideHistoryDao(EasyPlexDatabase db){

        return db.historyDao();

    }


    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(Application application) {

        return application.getSharedPreferences(PREF_FILE, MODE_PRIVATE);
    }

    @Provides
    @Singleton
    public TokenManager provideTokenManager(Application application){

        return new TokenManager(application.getSharedPreferences(PREF_FILE,MODE_PRIVATE));
    }




    @Provides
    @Singleton
    AdsManager provideAdsManager(Application application) {

        return new AdsManager(application.getSharedPreferences(PREF_FILE,MODE_PRIVATE));
    }


    @Provides
    @Singleton
    StatusManager provideStatusManager(Application application) {

        return new StatusManager(application.getSharedPreferences(PREF_FILE,MODE_PRIVATE));
    }

    @Provides
    @Singleton
    SettingsManager provideSettingsManager(Application application){

        return new SettingsManager(application.getSharedPreferences(PREF_FILE,MODE_PRIVATE));
    }


    @Provides
    @Singleton
    AuthManager provideAuthManager(Application application){

        return new AuthManager(application.getSharedPreferences(PREF_FILE,MODE_PRIVATE));
    }


    @Provides
    @Singleton
    SharedPreferences.Editor providesSharedPreferencesEditor(Application application) {

        return application.getSharedPreferences(PREF_FILE, MODE_PRIVATE).edit();
    }



    @Provides
    @Singleton
    CompositeDisposable providesCompositeDisposable() {
        return new CompositeDisposable();
    }



    @Provides
    @Singleton
    StateFactory provideStateFactory() {
        return new StateFactory();
    }

    @Provides
    @Singleton
    FsmPlayer provideFsmPlayer(StateFactory factory) {
        return new FsmPlayerImperial(factory) {
            @Override
            public Class initializeState() {
                return FetchCuePointState.class;
            }
        };
    }

    @Provides
    @Singleton
    PlayerUIController provideController() {
        return new PlayerUIController();
    }

    @Provides
    @Singleton
    PlayerAdLogicController provideComponentController() {
        return new PlayerAdLogicController();
    }

    @Provides
    @Singleton
    AdRetriever provideAdRetriever() {
        return new AdRetriever();
    }

    @Provides
    @Singleton
    CuePointsRetriever provideCuePointsRetriever() {
        return new CuePointsRetriever();
    }

    @Provides
    @Singleton
    AdPlayingMonitor provideAdPlayingMonitor(FsmPlayer player) {
        return new AdPlayingMonitor(player);
    }

    @Provides
    @Singleton
    CuePointMonitor provideCuePointMonitor(FsmPlayer fsmPlayer) {

        return new CuePointMonitor(fsmPlayer) {
            @Override
            public int networkingAhead() {
                return 5000;
            }
        };
    }

    @Provides
    @Singleton
    AdMediaModel provideAdMediaModel() {
        MediaModel ad1 = MediaModel
                .ad("",
                        "https://codecanyon.net/user/yobex", false);

        final List<MediaModel> list = new ArrayList<>();
        list.add(ad1);

        return  new  AdMediaModel(list) {
            @Nullable
            @Override
            public MediaModel nextAD() {
                return !list.isEmpty() ? list.get(0) : null;
            }
        };

    }

    @Provides
    @Singleton
    AdInterface provideAdInterfaceNoPreroll() {

        // using the fake generated AdMediaModel to do has the returned data.
        return new AdInterface() {
            @Override
            public void fetchAd(AdRetriever retriever, RetrieveAdCallback callback) {
                callback.onReceiveAd(provideAdMediaModel());
            }

            @Override
            public void fetchQuePoint(CuePointsRetriever retriever, CuePointCallBack callBack) {

                callBack.onCuePointReceived(null);

            }
        };
    }

    @Provides
    @Singleton
    VpaidClient provideVpaidClient() {
        return new VpaidClient() {
            @Override
            public void init(MediaModel ad) {


                //

            }

            @Override
            public void notifyAdError(int code, String error) {

                //

            }

            @Override
            public void notifyVideoEnd() {

                //

            }

            @Override
            public String getVastXml() {
                return null;
            }
        };
    }
}
