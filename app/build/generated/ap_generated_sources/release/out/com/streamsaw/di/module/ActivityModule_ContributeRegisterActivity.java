package com.streamsaw.di.module;

import com.streamsaw.ui.register.RegisterActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeRegisterActivity {
  private ActivityModule_ContributeRegisterActivity() {}

  @Binds
  @IntoMap
  @ClassKey(RegisterActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RegisterActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface RegisterActivitySubcomponent extends AndroidInjector<RegisterActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RegisterActivity> {}
  }
}
