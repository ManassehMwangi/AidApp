package com.StJoseph.aidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Drowning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drowning);

        getSupportActionBar().hide();
    }
}