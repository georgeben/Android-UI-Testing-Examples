package com.kurobarabenjamingeorge.androiduitesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String KEY = "Username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = (EditText) findViewById(R.id.nameEditText);
        Button submitBtn = (Button) findViewById(R.id.submitButton);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = et.getText().toString().trim();
                if(!(TextUtils.isEmpty(text))){
                    Intent i = new Intent(MainActivity.this, UserActivity.class);
                    i.putExtra(KEY, text);
                    startActivity(i);
                }else {
                    Toast.makeText(MainActivity.this, "Please enter your username", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });

    }
}
