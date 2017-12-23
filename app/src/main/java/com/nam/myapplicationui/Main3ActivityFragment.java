package com.nam.myapplicationui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class Main3ActivityFragment extends Fragment {

    public static final String LOGTAG = "XLOG42";

    public Main3ActivityFragment()
    {
        Log.i(LOGTAG, "this = " + this.toString());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View infl;

        //infl = inflater.inflate(R.layout.activity_home, container, false);
        infl = inflater.inflate(R.layout.fragment_main3, container, false);
        //return inflater.inflate(R.layout.fragment_main3, container, false);

        return infl;
    }
}
