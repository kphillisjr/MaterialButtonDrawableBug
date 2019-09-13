package com.example;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar myBar = getSupportActionBar();
        if(myBar!=null) {
            myBar.setSubtitle("Vector Drawable on Buttons");
        }
        Button switchView = findViewById(R.id.ChangeActivity);
        switchView.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        });
    }
}
