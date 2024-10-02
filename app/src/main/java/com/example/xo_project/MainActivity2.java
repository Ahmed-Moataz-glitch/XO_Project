package com.example.xo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String sign, player1_name, player2_name;
    Button player1, x, o, player2, play;
    TextView player1_txt, player2_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        player1 = findViewById(R.id.main2_player1);
        x = findViewById(R.id.main2_x);
        o = findViewById(R.id.main2_O);
        player2 = findViewById(R.id.main2_player2);
        play = findViewById(R.id.main2_play);
        player1_txt = findViewById(R.id.main2_tv1);
        player2_txt = findViewById(R.id.main2_tv2);
        Intent intent = getIntent();
        player1_name = intent.getStringExtra("player1");
        player2_name = intent.getStringExtra("player2");
        player1.setText(player1_name);
        player2.setText(player2_name);
        player1_txt.setText(player1_name+" is");
        player2_txt.setText(player2_name+" is");
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_txt.setText(player1_name+" is X");
                player2_txt.setText(player2_name+" is O");
                sign = "X";
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_txt.setText(player1_name+" is O");
                player2_txt.setText(player2_name+" is X");
                sign = "O";
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("name", sign);
                intent.putExtra("player1", player1_name);
                intent.putExtra("player2", player2_name);
                startActivity(intent);
            }
        });
    }
}