package com.nam.myapplicationui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class Main3Activity extends AppCompatActivity {

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


        if (savedInstanceState != null)
        {
           return;
        }

        FragmentAdd();





    }

    private void FragmentAdd()
    {
        Main3ActivityFragment fragment = new Main3ActivityFragment();

        //fragment.setArguments();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment42, fragment).commit();
    }

    private void FragmentRemove()
    {
        Main3Activity fragment =

        getSupportFragmentManager().beginTransaction().remove(fragment).commit();

    }
}
