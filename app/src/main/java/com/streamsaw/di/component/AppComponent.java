package com.streamsaw.di.component;

import android.app.Application;

import com.streamsaw.EasyPlexApp;
import com.streamsaw.di.module.ActivityModule;
import com.streamsaw.di.module.FragmentBuildersModule;
import com.streamsaw.di.module.AppModule;
import com.streamsaw.ui.player.activities.EasyPlexMainPlayer;

import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/*
 * Component which actually determines all the modules that has to be used and
 * in which classes these dependency injection should work.
 *
 * @author Yobex.
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityModule.class,
        FragmentBuildersModule.class})

public interface AppComponent {

    @Component.Builder
    interface Builder {


        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    // Where the dependency injection has to be used.
    void inject(EasyPlexApp app);
    void inject(EasyPlexMainPlayer activity);

}
