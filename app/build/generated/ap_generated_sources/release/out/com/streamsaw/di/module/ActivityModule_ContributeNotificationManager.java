package com.streamsaw.di.module;

import com.streamsaw.ui.notifications.NotificationManager;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent.class
)
public abstract class ActivityModule_ContributeNotificationManager {
  private ActivityModule_ContributeNotificationManager() {}

  @Binds
  @IntoMap
  @ClassKey(NotificationManager.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NotificationManagerSubcomponent.Factory builder);

  @Subcomponent
  public interface NotificationManagerSubcomponent extends AndroidInjector<NotificationManager> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NotificationManager> {}
  }
}
