package com.nam.myapplicationui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;

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

        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);
        mButton5 = findViewById(R.id.button5);
        mButton6 = findViewById(R.id.button6);

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton2.getText().toString() + " Click!!");
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton3.getText().toString() + " Click!!");
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton4.getText().toString() + " Click!!");
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton5.getText().toString() + " Click!!");
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton6.getText().toString() + " Click!!");
            }
        });



    }
}
