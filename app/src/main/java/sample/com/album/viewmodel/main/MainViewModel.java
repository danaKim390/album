package sample.com.album.viewmodel.main;

import android.content.ContentResolver;

import sample.com.album.contract.main.MainContract;

public class MainViewModel implements MainContract.ViewModel {
    ContentResolver contentResolver;

    public MainViewModel(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    @Override
    public void onClickMultiIntentAlbum() {

    }
}
