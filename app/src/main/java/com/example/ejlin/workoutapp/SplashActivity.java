package com.example.ejlin.workoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void goToMain(View view) {

        Intent goToMain = new Intent(this,NewUserEntry.class);
        startActivity(goToMain);
    }
}
