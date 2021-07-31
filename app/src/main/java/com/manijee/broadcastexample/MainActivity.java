package com.manijee.broadcastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
IntentFilter filter;
MyReceiver myReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filter=new IntentFilter(Intent.ACTION_TIME_TICK);
        myReceiver=new MyReceiver();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(myReceiver,filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(myReceiver);
    }
}