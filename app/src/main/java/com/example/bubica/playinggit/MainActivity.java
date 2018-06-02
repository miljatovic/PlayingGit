package com.example.bubica.playinggit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("My second GIT commit", "We rock'n'roll");
        Log.i("My third commit", "This is now funny");


    }
}
