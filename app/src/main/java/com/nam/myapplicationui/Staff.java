package com.nam.myapplicationui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by hp on 16.12.17.
 */

public class Staff
{
    public static final String LOGTAG = "XLOG42";

    //public static final String XHome;
    private String XHome;
    private String XDashboard;
    private String XNotification;

    private AppCompatActivity mActivity;


    public Staff(AppCompatActivity xactivity)
    {
        XHome = new String("XH");
        XDashboard = new String("XD");
        XNotification = new String("XN");

        mActivity = xactivity;
    }

    public void XHomeDo(TextView textView)
    {
        textView.setText(R.string.title_home);

        XActivity(0);
    }

    public void XDashboardDo(TextView textView)
    {
        textView.setText(R.string.title_dashboard);

        XActivity(1);
    }

    public void XNotificationDo(TextView textView)
    {
        textView.setText(R.string.title_notifications);

        XActivity(2);
    }

    private void XActivity(int hack)
    {
        Intent intent = new Intent();

        switch (hack)
        {
            case 0 :
            {
                intent.setClass(mActivity.getBaseContext(), HomeActivity.class);

                break;
            }
            case 1 :
            {
                intent.setClass(mActivity.getBaseContext(), DashboardActivity.class);

                break;
            }
            case 2 :
            {
                intent.setClass(mActivity.getBaseContext(), NotificationActivity.class);

                break;
            }
        }

        Log.i(LOGTAG, "Class = " + this.getClass().toString());

        mActivity.startActivity(intent);
    }

}
