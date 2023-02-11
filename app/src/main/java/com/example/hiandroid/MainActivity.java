package com.example.hiandroid;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG,"This is a verbase log.");
        Log.d(TAG,"This is a verbase log.");
        Log.i(TAG,"This is a verbase log.");
        Log.w(TAG,"This is a verbase log.");
        Log.e(TAG,"This is a verbase log.");

        Button button = (button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener());{
            @Override
                    public void onclick(View v) {
                Log.i(TAG,"Button Clicker")
            }
        }
    }
}