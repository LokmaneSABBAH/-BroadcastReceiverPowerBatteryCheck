package com.example.brodcastreceiver2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")){
            Toast.makeText(context, "start charging...", Toast.LENGTH_LONG).show();
        }
        else if(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED")){
            Toast.makeText(context, "end charging.", Toast.LENGTH_LONG).show();
        }

        //Toast.makeText(context, "start charging", Toast.LENGTH_LONG).show();
    }
}