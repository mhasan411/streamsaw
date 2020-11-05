package com.streamsaw.di.module;

import com.streamsaw.ui.library.SeriesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeSeriesFragment {
  private FragmentBuildersModule_ContributeSeriesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SeriesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SeriesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SeriesFragmentSubcomponent extends AndroidInjector<SeriesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SeriesFragment> {}
  }
}
