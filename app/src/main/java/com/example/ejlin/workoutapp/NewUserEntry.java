package com.example.ejlin.workoutapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewUserEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_entry);


    }


    public void navigateToMenu(View view) {

        Intent toMenu = new Intent(this,WorkoutDiary.class);
        startActivity(toMenu);
    }
}
