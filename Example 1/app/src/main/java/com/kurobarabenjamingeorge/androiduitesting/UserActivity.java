package com.kurobarabenjamingeorge.androiduitesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent incomingIntent = getIntent();
        if(incomingIntent.hasExtra(MainActivity.KEY)){
            String username = incomingIntent.getStringExtra(MainActivity.KEY);
            TextView usernameTV = (TextView) findViewById(R.id.usernameTextview);
            usernameTV.setText(username);
        }
    }
}
