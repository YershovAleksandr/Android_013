package com.nam.myapplicationui;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HomeActivity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        int i;
        float f;
        String s;

/*        i = getIntent().getIntExtra("XInt", -1);
        f = getIntent().getFloatExtra("XFloat", -1.f);
        s = getIntent().getStringExtra("XString");*/



        Bundle bundle;

        bundle = getIntent().getExtras();
        //.getBundleExtra(null);

        i = bundle.getInt("XInt");
        f = bundle.getFloat("XFloat");
        s = bundle.getString("XString");


        Log.i(LOGTAG, "XInt = " + i);
        Log.i(LOGTAG, "XFloat = " + f);
        Log.i(LOGTAG, "XString = " + s);

    }
}
