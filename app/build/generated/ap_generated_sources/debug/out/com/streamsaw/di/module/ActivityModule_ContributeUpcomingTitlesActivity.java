package com.streamsaw.di.module;

import com.streamsaw.ui.upcoming.UpcomingTitlesActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeUpcomingTitlesActivity {
  private ActivityModule_ContributeUpcomingTitlesActivity() {}

  @Binds
  @IntoMap
  @ClassKey(UpcomingTitlesActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UpcomingTitlesActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface UpcomingTitlesActivitySubcomponent
      extends AndroidInjector<UpcomingTitlesActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UpcomingTitlesActivity> {}
  }
}
