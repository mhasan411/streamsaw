package com.streamsaw.di.module;

import com.streamsaw.ui.seriedetails.SerieDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeSerieDetailActivity {
  private ActivityModule_ContributeSerieDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SerieDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SerieDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SerieDetailsActivitySubcomponent extends AndroidInjector<SerieDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SerieDetailsActivity> {}
  }
}
