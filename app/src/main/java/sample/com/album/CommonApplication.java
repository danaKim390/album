package sample.com.album;

import android.app.Application;

import sample.com.album.module.ApplicationModule;
import sample.com.album.module.main.MainModule;

public class CommonApplication extends Application {
    public ApplicationComponent getComponent() {
        return component;
    }

    ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
            .applicationModule(new ApplicationModule((this)))
            .mainModule(new MainModule())
            .build();
    }
}
