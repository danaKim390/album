package sample.com.album.viewmodel.main;

import android.content.ContentResolver;
import android.util.Log;
import android.view.View;

import sample.com.album.contract.main.MainContract;
import sample.com.album.log.ALog;

public class MainViewModel implements MainContract.ViewModel {
    ContentResolver contentResolver;

    public MainViewModel(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    @Override
    public void onClickMultiIntentAlbum(View view) {
        ALog.l("--onclick");
        //TODO intent open album

    }
}
