package sample.com.album.module;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Named("ApplicationContext")
    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }

    @Provides
    public ContentResolver provideContentResolver() {
        return application.getContentResolver();
    }
}
