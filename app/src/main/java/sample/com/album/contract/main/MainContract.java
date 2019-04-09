package sample.com.album.contract.main;

import android.view.View;

import dagger.Module;

public interface MainContract {
    interface ViewModel {
        void onClickMultiIntentAlbum(View view);
    }
}
