package com.streamsaw.di.module;

import com.streamsaw.ui.animes.AnimeDetailsActivity;
import com.streamsaw.ui.base.BaseActivity;
import com.streamsaw.ui.download.DownloadList;
import com.streamsaw.ui.login.LoginActivity;
import com.streamsaw.ui.moviedetails.MovieDetailsActivity;
import com.streamsaw.ui.notifications.NotificationManager;
import com.streamsaw.ui.payment.Payment;
import com.streamsaw.ui.payment.PaymentDetails;
import com.streamsaw.ui.player.activities.EasyPlexMainPlayer;
import com.streamsaw.ui.profile.EditProfileActivity;
import com.streamsaw.ui.register.RegisterActivity;
import com.streamsaw.ui.seriedetails.SerieDetailsActivity;
import com.streamsaw.ui.splash.SplashActivity;
import com.streamsaw.ui.trailer.TrailerPreviewActivity;
import com.streamsaw.ui.upcoming.UpcomingTitlesActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Binds all sub-components within the app. Add bindings for other sub-components here.
 * @ContributesAndroidInjector was introduced removing the need to:
 * a) Create separate components annotated with @Subcomponent (the need to define @Subcomponent classes.)
 * b) Write custom annotations like @PerActivity.
 *
 * @author Yobex.
 */
@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract BaseActivity contributeMainActivity();


    @ContributesAndroidInjector()
    abstract Payment contributePayment();

    @ContributesAndroidInjector()
    abstract NotificationManager contributeNotificationManager();


    @ContributesAndroidInjector()
    abstract DownloadList contributeDownloadList();

    @ContributesAndroidInjector()
    abstract PaymentDetails contributePaymentDetails();

    @ContributesAndroidInjector()
    abstract EditProfileActivity contributeEditProfileActivity();

    @ContributesAndroidInjector()
    abstract MovieDetailsActivity contributeMovieDetailActivity();

    @ContributesAndroidInjector()
    abstract SerieDetailsActivity contributeSerieDetailActivity();

    @ContributesAndroidInjector()
    abstract LoginActivity contributeLoginActivity();

    @ContributesAndroidInjector()
    abstract RegisterActivity contributeRegisterActivity();

    @ContributesAndroidInjector()
    abstract TrailerPreviewActivity contributeTrailerPreviewActivity();

    @ContributesAndroidInjector()
    abstract UpcomingTitlesActivity contributeUpcomingTitlesActivity();

    @ContributesAndroidInjector()
    abstract AnimeDetailsActivity contributeAnimeDetailsActivity();

    @ContributesAndroidInjector()
    abstract EasyPlexMainPlayer contributeDoubleViewTubiPlayerActivity();

    @ContributesAndroidInjector()
    abstract SplashActivity contributeSplashActivity();


}
