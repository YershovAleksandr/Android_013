package com.nam.myapplicationui;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends AppCompatActivity {

    public static final String LOGTAG = "XLOG42";

    static final int PICK_CONTACT_REQUEST = 42;

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

                Uri number = Uri.parse("tel:*100" + "#");

                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

                startActivity(callIntent);

            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton3.getText().toString() + " Click!!");

                Uri location = Uri.parse("geo:0,0?q=Russia, Новосибирск, Красный проспект 59");

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

                startActivity(mapIntent);

            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton4.getText().toString() + " Click!!");

                Uri webpage = Uri.parse("http://www.google.com");

                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

                startActivity(webIntent);
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton5.getText().toString() + " Click!!");

                Intent pickContactIntent = new Intent(Intent.ACTION_PICK, Uri.parse("contact://contacts"));

                pickContactIntent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);

                startActivityForResult(pickContactIntent, PICK_CONTACT_REQUEST);

            }
        });


        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(LOGTAG, "Button " + mButton6.getText().toString() + " Click!!");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //Log.i(LOGTAG, "OnActivityResult id = " + PICK_CONTSCT_REQUEST);

        if (requestCode == PICK_CONTACT_REQUEST){
            Log.i(LOGTAG, "OnActivityResult id = " + PICK_CONTACT_REQUEST);

            if (resultCode == RESULT_OK)
            {
                Log.i(LOGTAG, "RESULT_OK");

                Uri contactUri = data.getData();

                String[] projection = {ContactsContract.CommonDataKinds.Phone.NUMBER};

                Cursor cursor = getContentResolver()
                        .query(contactUri, projection, null, null, null);

                cursor.moveToFirst();

                int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                String number = cursor.getString(column);

                Log.i(LOGTAG, "Number = " + number);


            }

        }
    }
}
