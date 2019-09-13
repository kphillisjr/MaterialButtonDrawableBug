package com.example;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar myBar = getSupportActionBar();
        if(myBar!=null) {
            myBar.setSubtitle("Vector Drawable on material Buttons");
        }

        Button switchView = findViewById(R.id.ChangeActivity);
        switchView.setOnClickListener((view) -> {
            finish();
        });
    }

}
