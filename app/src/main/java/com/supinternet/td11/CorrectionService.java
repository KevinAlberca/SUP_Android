package com.supinternet.td11;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class CorrectionService extends Service {
    private static int counter = 0;

    public CorrectionService() {
    }

    IBinder mBinder = new IncrementBinder();

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public class IncrementBinder extends Binder {
        public int getIncrement() {
            return ++counter;
        }

    }
}
