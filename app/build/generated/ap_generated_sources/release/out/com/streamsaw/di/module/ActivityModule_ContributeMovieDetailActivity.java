package com.streamsaw.di.module;

import com.streamsaw.ui.moviedetails.MovieDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeMovieDetailActivity {
  private ActivityModule_ContributeMovieDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MovieDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MovieDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface MovieDetailsActivitySubcomponent extends AndroidInjector<MovieDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MovieDetailsActivity> {}
  }
}
