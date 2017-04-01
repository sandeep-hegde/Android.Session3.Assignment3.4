package com.example.sandeep.bundleloginscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Bundle bundle=this.getIntent().getExtras();
        String userNameBundle=bundle.getString("UserName");

        Toast.makeText(getApplicationContext(), "Welcome "+userNameBundle,Toast.LENGTH_LONG).show();
    }
}
