package com.nam.myapplicationui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
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

        mToggleButton1 = findViewById(R.id.toggleButton3);

        mToggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (mToggleButton1.isChecked())
                {
                    FragmentAdd();
                }
                else
                {
                    FragmentRemove();
                }
            }
        });

        //WTF&&&777
        //TODO NEED FIX
        if (savedInstanceState != null)
        {
           return;
        }






    }

    private void FragmentAdd()
    {
        mFragment = new Main3ActivityFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment42, mFragment);
        //transaction.addToBackStack(null);
        transaction.commit();
    }

    private void FragmentRemove()
    {
        if (mFragment == null)
        {
            Log.i(LOGTAG, "WTF&&&777");

            return;
        }

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.remove(mFragment);
        //transaction.addToBackStack(null);
        transaction.commit();

    }
}
