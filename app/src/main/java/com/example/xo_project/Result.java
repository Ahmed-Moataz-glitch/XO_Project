package com.example.xo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    Intent intent;
    TextView tv1;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv1 = findViewById(R.id.main4_tv1);
        btn = findViewById(R.id.main4_btn);
        intent = getIntent();
        String result = intent.getStringExtra("result");
        String player1 = intent.getStringExtra("player1_name");
        String player2 = intent.getStringExtra("player2_name");
        tv1.setText(result);
        SharedPreferences sharedPreferences;
        sharedPreferences = getSharedPreferences(String.valueOf(this), 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("player1Name", player1);
        editor.putString("player2Name", player2);
        editor.commit();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Result.this, Players_Name.class);
                intent.putExtra("player1_name", player1);
                intent.putExtra("player2_name", player2);
                startActivity(intent);
            }
        });


    }
}