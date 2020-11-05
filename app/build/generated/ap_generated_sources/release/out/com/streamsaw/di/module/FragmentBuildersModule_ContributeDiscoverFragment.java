package com.streamsaw.di.module;

import com.streamsaw.ui.search.DiscoverFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeDiscoverFragment {
  private FragmentBuildersModule_ContributeDiscoverFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DiscoverFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DiscoverFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface DiscoverFragmentSubcomponent extends AndroidInjector<DiscoverFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DiscoverFragment> {}
  }
}
