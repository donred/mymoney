package com.example.ravindrad.mymoney;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by ravindrad on 13/09/15.
 */
public class MainService  extends Service{

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startid){
        Toast.makeText(this,"Service Started :)",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    public void onDestroy(){
        super.onDestroy();;
        Toast.makeText(this,"Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
