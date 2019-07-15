package com.example.challengeapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


public class Myprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);

        //Adds back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
