package com.streamsaw.di.module;

import com.streamsaw.ui.home.HomeFragment;
import com.streamsaw.ui.library.AnimesFragment;
import com.streamsaw.ui.library.LibraryFragment;
import com.streamsaw.ui.library.MoviesFragment;
import com.streamsaw.ui.library.SeriesFragment;
import com.streamsaw.ui.mylist.MyListFragment;
import com.streamsaw.ui.player.utilities.TrackSelectionDialog;
import com.streamsaw.ui.search.DiscoverFragment;
import com.streamsaw.ui.settings.SettingsActivity;
import com.streamsaw.ui.streaming.StreamingFragment;
import com.streamsaw.ui.upcoming.UpComingFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/*
 * @author Yobex.
 * */
@Module
public abstract class FragmentBuildersModule {


    @ContributesAndroidInjector
    abstract TrackSelectionDialog contributeTrackSelectionDialog();

    @ContributesAndroidInjector
    abstract HomeFragment contributeHomeFragment();

    @ContributesAndroidInjector
    abstract UpComingFragment contributeUpcomingFragment();

    @ContributesAndroidInjector
    abstract DiscoverFragment contributeDiscoverFragment();


    @ContributesAndroidInjector
    abstract MoviesFragment contributeMoviesFragment();

    @ContributesAndroidInjector
    abstract SeriesFragment contributeSeriesFragment();

    @ContributesAndroidInjector
    abstract LibraryFragment contributeLibraryFragment();

    @ContributesAndroidInjector
    abstract MyListFragment contributeMyListMoviesFragment();



    @ContributesAndroidInjector
    abstract AnimesFragment contributeAnimesFragment();

    @ContributesAndroidInjector
    abstract StreamingFragment contributeLiveFragment();

    @ContributesAndroidInjector
    abstract SettingsActivity contributeSettingsFragment();

}
