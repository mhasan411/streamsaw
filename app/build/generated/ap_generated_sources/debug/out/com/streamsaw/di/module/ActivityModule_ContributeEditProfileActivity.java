package com.streamsaw.di.module;

import com.streamsaw.ui.profile.EditProfileActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeEditProfileActivity {
  private ActivityModule_ContributeEditProfileActivity() {}

  @Binds
  @IntoMap
  @ClassKey(EditProfileActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditProfileActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface EditProfileActivitySubcomponent extends AndroidInjector<EditProfileActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditProfileActivity> {}
  }
}
