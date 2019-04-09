package sample.com.album.module.main;

import android.content.ContentResolver;

import dagger.Module;
import dagger.Provides;
import sample.com.album.contract.main.MainContract;
import sample.com.album.viewmodel.main.MainViewModel;

@Module
public class MainModule {
    @Provides
    MainViewModel provideMainViewModel(ContentResolver contentResolver) {
        return new MainViewModel(contentResolver);
    }
}
