package com.example.hiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityFragment extends AppCompatActivity {

    Button FragmentA, FragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        FragmentA = (Button) findViewById(R.id.FragmentA);
        FragmentB = (Button) findViewById(R.id.FragmentB);



        FragmentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { loadFragment(new FragmentA()); }
        });

        FragmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { loadFragment(new FragmentB()); }
        });

    }
    private void loadFragment(com.example.hiandroid.FragmentA fragmentA) {
    }
    private void loadFragment(com.example.hiandroid.FragmentB fragmentB) {
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.constraintLayout, fragment);
        fragmentTransaction.commit();
    }


}