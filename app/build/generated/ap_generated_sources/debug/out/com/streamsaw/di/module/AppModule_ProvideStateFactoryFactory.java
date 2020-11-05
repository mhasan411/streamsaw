// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.ui.player.fsm.concrete.factory.StateFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideStateFactoryFactory implements Factory<StateFactory> {
  private final AppModule module;

  public AppModule_ProvideStateFactoryFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public StateFactory get() {
    return provideStateFactory(module);
  }

  public static AppModule_ProvideStateFactoryFactory create(AppModule module) {
    return new AppModule_ProvideStateFactoryFactory(module);
  }

  public static StateFactory provideStateFactory(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideStateFactory(), "Cannot return null from a non-@Nullable @Provides method");
  }
}