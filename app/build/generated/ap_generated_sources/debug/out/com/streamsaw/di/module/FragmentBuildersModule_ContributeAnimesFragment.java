package com.streamsaw.di.module;

import com.streamsaw.ui.library.AnimesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeAnimesFragment {
  private FragmentBuildersModule_ContributeAnimesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AnimesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AnimesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AnimesFragmentSubcomponent extends AndroidInjector<AnimesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AnimesFragment> {}
  }
}
