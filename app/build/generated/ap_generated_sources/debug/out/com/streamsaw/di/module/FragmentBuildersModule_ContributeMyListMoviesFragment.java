package com.streamsaw.di.module;

import com.streamsaw.ui.mylist.MyListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeMyListMoviesFragment.MyListFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeMyListMoviesFragment {
  private FragmentBuildersModule_ContributeMyListMoviesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MyListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MyListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MyListFragmentSubcomponent extends AndroidInjector<MyListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MyListFragment> {}
  }
}
