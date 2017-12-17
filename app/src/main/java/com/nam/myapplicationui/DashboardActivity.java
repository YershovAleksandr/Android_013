package com.nam.myapplicationui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DashboardActivity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    public Button mButton;
    public CheckBox mCheckBox1;
    public CheckBox mCheckBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        int i = getIntent().getIntExtra("XInt", -1);
        float f = getIntent().getFloatExtra("XFloat", -1.f);
        String s = getIntent().getStringExtra("XString");

        Log.i(LOGTAG, "XInt = " + i);
        Log.i(LOGTAG, "XFloat = " + f);
        Log.i(LOGTAG, "XString = " + s);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mCheckBox1 = findViewById(R.id.checkBox);
        mCheckBox2 = findViewById(R.id.checkBox2);


        mButton = findViewById(R.id.button7);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(LOGTAG, "Button " + mButton.getText().toString() + "Click!!!");

                String chk1res;

                if (mCheckBox1.isChecked())
                {
                    chk1res = "";
                }
                else
                {
                    chk1res = "not ";
                }

                chk1res = chk1res + "checked";

                Log.i(LOGTAG, "CheckBox 1 is " + chk1res + "Click!!!");


            }
        });

    }

}
