package com.supinternet.td11;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class IncrementerService extends Service {

    public static int counter = 0;

    @Override
    public void onCreate() {
        super.onCreate();

        IncrementerService.counter++;
    }

    public IncrementerService() {
        IncrementerService.counter++;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
