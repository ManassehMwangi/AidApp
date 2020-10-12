package com.StJoseph.aidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Seizure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seizure);

        getSupportActionBar().hide();
    }
}