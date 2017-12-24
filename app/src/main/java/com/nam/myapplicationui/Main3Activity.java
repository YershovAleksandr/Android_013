package com.nam.myapplicationui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ToggleButton;


public class Main3Activity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    private Main3ActivityFragment mFragment;

    private ToggleButton mToggleButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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

        mToggleButton1 = findViewById(R.id.toggleButton2);


        if (savedInstanceState != null)
        {
           return;
        }

        if (mToggleButton1.isChecked())
        {
            FragmentAdd();





    }

    private void FragmentAdd()
    {
        mFragment = new Main3ActivityFragment();

        //fragment.setArguments();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment42, mFragment).commit();
    }

    private void FragmentRemove()
    {
        if (mFragment == null)
        {
            Log.i(LOGTAG, "WTF&&&777");

            return;
        }

        getSupportFragmentManager().beginTransaction().remove(mFragment).commit();

    }
}
