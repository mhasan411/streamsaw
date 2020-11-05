package com.streamsaw.di.module;

import com.streamsaw.ui.base.BaseActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContributeMainActivity.BaseActivitySubcomponent.class)
public abstract class ActivityModule_ContributeMainActivity {
  private ActivityModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(BaseActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BaseActivitySubcomponent.Factory builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  public interface BaseActivitySubcomponent extends AndroidInjector<BaseActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BaseActivity> {}
  }
}
