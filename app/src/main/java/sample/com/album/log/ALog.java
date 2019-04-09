package sample.com.album.log;

import android.util.Log;

public class ALog {
    public static String LOG_KEY = "AlbumTestLog";

    public static void l(String log) {
        Log.d(LOG_KEY, log);
    }
}
