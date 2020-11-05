package com.streamsaw.di.module;

import com.streamsaw.ui.player.utilities.TrackSelectionDialog;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeTrackSelectionDialog.TrackSelectionDialogSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeTrackSelectionDialog {
  private FragmentBuildersModule_ContributeTrackSelectionDialog() {}

  @Binds
  @IntoMap
  @ClassKey(TrackSelectionDialog.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TrackSelectionDialogSubcomponent.Factory builder);

  @Subcomponent
  public interface TrackSelectionDialogSubcomponent extends AndroidInjector<TrackSelectionDialog> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TrackSelectionDialog> {}
  }
}
