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
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DashboardActivity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    public Button mButton;
    public CheckBox mCheckBox1;
    public CheckBox mCheckBox2;

    public RadioButton mRadioButton1;
    public RadioButton mRadioButton2;
    public RadioButton mRadioButton3;

    public RadioGroup mRadioGroup;

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

        mRadioButton1 = findViewById(R.id.radioButton);
        mRadioButton2 = findViewById(R.id.radioButton2);
        mRadioButton3 = findViewById(R.id.radioButton3);

        mRadioGroup = findViewById(R.id.radioGroup);

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

                String chk2res;

                if (mCheckBox2.isChecked())
                {
                    chk2res = "";
                }
                else
                {
                    chk2res = "not ";
                }

                chk2res = chk2res + "checked";

                Log.i(LOGTAG, "CheckBox 2 is " + chk2res + "Click!!!");


                int id = mRadioGroup.getCheckedRadioButtonId();

                Log.i(LOGTAG, "Radio Group wtf ??? " +  id);


            }
        });

    }

}
