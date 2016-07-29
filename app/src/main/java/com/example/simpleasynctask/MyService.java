package com.example.simpleasynctask;

        import android.app.Service;
        import android.content.Intent;
        import android.os.IBinder;
        import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "SeviceTAG_";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
     // new ExampleTask().execute();
        Log.d(TAG, "onCreate Service: " + Thread.currentThread());
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
