package com.example.xo_project;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        try {
            sleep(3000);
            Intent i = new Intent(Splash_Screen.this, MainActivity.class);
            startActivity(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finish();
    }
}