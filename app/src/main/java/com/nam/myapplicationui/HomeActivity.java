package com.nam.myapplicationui;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    public TextView mTextView;
    public EditText mEditText;
    public Button mButton;

    private String StrTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mTextView = findViewById(R.id.textView);
        mEditText = findViewById(R.id.editText);
        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button click Motherfacka!!!");

                StrTxt = mEditText.getText().toString();

                Log.i(LOGTAG, "Edit Text = " + StrTxt);
            }
        });

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


        Log.i(LOGTAG, "TextView = " + mTextView.getText());
        Log.i(LOGTAG, "EditText = " + mEditText.getText());
        Log.i(LOGTAG, "Button = " + mButton.getText());

    }
}
