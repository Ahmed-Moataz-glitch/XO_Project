package com.example.xo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Players_Name extends AppCompatActivity {
    String player1_name, player2_name, player1 = "", player2 = "";
    TextView tv1, tv2;
    EditText et1, et2;
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_name);
        tv1 = findViewById(R.id.main1_player1);
        tv2 = findViewById(R.id.main1_player2);
        et1 = findViewById(R.id.main1_et1);
        et2 = findViewById(R.id.main1_et2);
        play = findViewById(R.id.main1_play);
        Intent intent = getIntent();
        player1 = intent.getStringExtra("player1_name");
        player2 = intent.getStringExtra("player2_name");
        SharedPreferences sharedPreferences = getSharedPreferences(String.valueOf(Result.class), 0);
        player1 = sharedPreferences.getString("player1Name", "Ahmed");
        player2 = sharedPreferences.getString("player2Name", "Omar");
        et1.setText(player1);
        et2.setText(player2);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_name = et1.getText().toString();
                player2_name = et2.getText().toString();
                Intent intent = new Intent(Players_Name.this, MainActivity2.class);
                intent.putExtra("player1", player1_name);
                intent.putExtra("player2", player2_name);
                startActivity(intent);
            }
        });

    }
}