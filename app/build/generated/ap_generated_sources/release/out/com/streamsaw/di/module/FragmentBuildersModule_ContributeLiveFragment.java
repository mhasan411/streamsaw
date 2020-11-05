package com.streamsaw.di.module;

import com.streamsaw.ui.streaming.StreamingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeLiveFragment {
  private FragmentBuildersModule_ContributeLiveFragment() {}

  @Binds
  @IntoMap
  @ClassKey(StreamingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StreamingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface StreamingFragmentSubcomponent extends AndroidInjector<StreamingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StreamingFragment> {}
  }
}
