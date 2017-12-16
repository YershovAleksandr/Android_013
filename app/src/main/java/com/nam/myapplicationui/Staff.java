package com.nam.myapplicationui;

import android.widget.TextView;

/**
 * Created by hp on 16.12.17.
 */

public class Staff
{
    //public static final String XHome;
    private String XHome;
    private String XDashboard;
    private String XNotification;

    public Staff()
    {
        XHome = new String("XH");
        XDashboard = new String("XD");
        XNotification = new String("XN");
    }

    public void XHomeDo(TextView textView)
    {
        textView.setText(R.string.title_home);
    }

    public void XDashboardDo(TextView textView)
    {
        textView.setText(R.string.title_dashboard);
    }

    public void XNotificationDo(TextView textView)
    {
        textView.setText(R.string.title_notifications);
    }

}
