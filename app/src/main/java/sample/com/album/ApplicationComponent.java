package sample.com.album;

import javax.inject.Singleton;

import dagger.Component;
import sample.com.album.module.ApplicationModule;
import sample.com.album.module.main.MainModule;
import sample.com.album.view.main.MainActivity;

@Singleton
@Component(modules = {ApplicationModule.class, MainModule.class})
public interface ApplicationComponent {
    void inject(MainActivity activity);
}
