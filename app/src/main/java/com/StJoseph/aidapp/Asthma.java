package com.StJoseph.aidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Asthma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);

        getSupportActionBar().hide();
    }
}