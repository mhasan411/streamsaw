// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.data.model.ads.CuePointsRetriever;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCuePointsRetrieverFactory implements Factory<CuePointsRetriever> {
  private final AppModule module;

  public AppModule_ProvideCuePointsRetrieverFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CuePointsRetriever get() {
    return provideCuePointsRetriever(module);
  }

  public static AppModule_ProvideCuePointsRetrieverFactory create(AppModule module) {
    return new AppModule_ProvideCuePointsRetrieverFactory(module);
  }

  public static CuePointsRetriever provideCuePointsRetriever(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideCuePointsRetriever(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
