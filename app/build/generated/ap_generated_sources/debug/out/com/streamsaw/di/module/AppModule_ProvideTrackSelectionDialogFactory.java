// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.ui.player.utilities.TrackSelectionDialog;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideTrackSelectionDialogFactory implements Factory<TrackSelectionDialog> {
  private final AppModule module;

  public AppModule_ProvideTrackSelectionDialogFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public TrackSelectionDialog get() {
    return provideTrackSelectionDialog(module);
  }

  public static AppModule_ProvideTrackSelectionDialogFactory create(AppModule module) {
    return new AppModule_ProvideTrackSelectionDialogFactory(module);
  }

  public static TrackSelectionDialog provideTrackSelectionDialog(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideTrackSelectionDialog(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
