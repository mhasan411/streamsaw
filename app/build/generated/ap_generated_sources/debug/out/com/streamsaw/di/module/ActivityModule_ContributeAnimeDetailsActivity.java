package com.streamsaw.di.module;

import com.streamsaw.ui.animes.AnimeDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeAnimeDetailsActivity {
  private ActivityModule_ContributeAnimeDetailsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AnimeDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AnimeDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface AnimeDetailsActivitySubcomponent extends AndroidInjector<AnimeDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AnimeDetailsActivity> {}
  }
}
