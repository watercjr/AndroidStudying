package com.example.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {

    public static final String TAG = "BootCompleteReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        Log.d(TAG, "Hello, I receiving a StartUp Message!");
        Toast.makeText(context, "Boot Complete", Toast.LENGTH_LONG).show();
    }
}
