package com.example.julianandres.parquedelcafe.services;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Gt on 13/02/2016.
 */
public class MyService extends Service {

    private Context ctx;

    public MyService ()
    {
        super();
        this.ctx=this.getApplicationContext();
    }

    public myService (Context c)
    {
        super();
        this.ctx=c;
    }

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }


}
