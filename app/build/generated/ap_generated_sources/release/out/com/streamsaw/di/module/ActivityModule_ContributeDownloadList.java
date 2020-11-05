package com.streamsaw.di.module;

import com.streamsaw.ui.download.DownloadList;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContributeDownloadList.DownloadListSubcomponent.class)
public abstract class ActivityModule_ContributeDownloadList {
  private ActivityModule_ContributeDownloadList() {}

  @Binds
  @IntoMap
  @ClassKey(DownloadList.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DownloadListSubcomponent.Factory builder);

  @Subcomponent
  public interface DownloadListSubcomponent extends AndroidInjector<DownloadList> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DownloadList> {}
  }
}
