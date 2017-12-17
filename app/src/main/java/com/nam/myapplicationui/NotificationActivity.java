package com.nam.myapplicationui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NotificationActivity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        int i = getIntent().getIntExtra("XInt", -1);
        float f = getIntent().getFloatExtra("XFloat", -1.f);
        String s = getIntent().getStringExtra("XString");

        Log.i(LOGTAG, "XInt = " + i);
        Log.i(LOGTAG, "XFloat = " + f);
        Log.i(LOGTAG, "XString = " + s);


    }
}
