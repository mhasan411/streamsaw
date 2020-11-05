package com.streamsaw.di.module;

import com.streamsaw.ui.upcoming.UpComingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeUpcomingFragment {
  private FragmentBuildersModule_ContributeUpcomingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UpComingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UpComingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UpComingFragmentSubcomponent extends AndroidInjector<UpComingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UpComingFragment> {}
  }
}
