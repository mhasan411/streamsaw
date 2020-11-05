package com.streamsaw.di.module;

import com.streamsaw.ui.trailer.TrailerPreviewActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModule_ContributeTrailerPreviewActivity.TrailerPreviewActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeTrailerPreviewActivity {
  private ActivityModule_ContributeTrailerPreviewActivity() {}

  @Binds
  @IntoMap
  @ClassKey(TrailerPreviewActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TrailerPreviewActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface TrailerPreviewActivitySubcomponent
      extends AndroidInjector<TrailerPreviewActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TrailerPreviewActivity> {}
  }
}
