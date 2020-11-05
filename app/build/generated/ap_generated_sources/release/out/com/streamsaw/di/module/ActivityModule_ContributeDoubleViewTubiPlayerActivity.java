package com.streamsaw.di.module;

import com.streamsaw.ui.player.activities.EasyPlexMainPlayer;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityModule_ContributeDoubleViewTubiPlayerActivity.EasyPlexMainPlayerSubcomponent.class
)
public abstract class ActivityModule_ContributeDoubleViewTubiPlayerActivity {
  private ActivityModule_ContributeDoubleViewTubiPlayerActivity() {}

  @Binds
  @IntoMap
  @ClassKey(EasyPlexMainPlayer.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EasyPlexMainPlayerSubcomponent.Factory builder);

  @Subcomponent
  public interface EasyPlexMainPlayerSubcomponent extends AndroidInjector<EasyPlexMainPlayer> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EasyPlexMainPlayer> {}
  }
}
