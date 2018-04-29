package com.example.android.pleventourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Sights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SightsFragment())
                .commit();

    }
}
