//Android Developer Training Session 3 - Assignment 3.4
//On successful login show the user name on next screen using bundle passing as "Welcome UserName"

package com.example.sandeep.bundleloginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void openActivityB(View v) {

        //Create Intent object
        Intent openNewActivity = new Intent(ActivityA.this,ActivityB.class);

        //Setting data in bundle and then setting bundle in intent object
        Bundle dataBundle = new Bundle();
        dataBundle.putString("UserName", "Sandeep");
        openNewActivity.putExtras(dataBundle);
        startActivity(openNewActivity);

    }
}
