package com.example.xo_project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    int sign_x=0,x1=0,x2=0,x3=0,x4=0,x5=0,x6=0,x7=0,x8=0,x9=0;
    int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
    String sign, player1_name, player2_name;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
    Button player,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        player = findViewById(R.id.main3_player);
        tv1 = findViewById(R.id.main3_tv1);
        tv2 = findViewById(R.id.main3_tv2);
        tv3 = findViewById(R.id.main3_tv3);
        tv4 = findViewById(R.id.main3_tv4);
        tv5 = findViewById(R.id.main3_tv5);
        tv6 = findViewById(R.id.main3_tv6);
        tv7 = findViewById(R.id.main3_tv7);
        tv8 = findViewById(R.id.main3_tv8);
        tv9 = findViewById(R.id.main3_tv9);
        btn1 = findViewById(R.id.main3_btn1);
        btn2 = findViewById(R.id.main3_btn2);
        btn3 = findViewById(R.id.main3_btn3);
        btn4 = findViewById(R.id.main3_btn4);
        btn5 = findViewById(R.id.main3_btn5);
        btn6 = findViewById(R.id.main3_btn6);
        btn7 = findViewById(R.id.main3_btn7);
        btn8 = findViewById(R.id.main3_btn8);
        btn9 = findViewById(R.id.main3_btn9);
        Intent intent = getIntent();
        sign = intent.getStringExtra("name");
        player1_name = intent.getStringExtra("player1");
        player2_name = intent.getStringExtra("player2");
        if(sign.equals("X")){
            sign_x = 1;
        }else{
            sign_x = 2;
        }
        player.setText(player1_name);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1==0) {
                    c1 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x1 = (sign_x == 1) ? 1 : 2;
                    }else{
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x1 = (sign_x == 1) ? 2 : 1;
                    }
                    tv1.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2==0) {
                    c2 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x2 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x2 = (sign_x == 1) ? 2 : 1;
                    }
                    tv2.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3==0) {
                    c3 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x3 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x3 = (sign_x == 1) ? 2 : 1;
                    }
                    tv3.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c4==0) {
                    c4 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x4 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x4 = (sign_x == 1) ? 2 : 1;
                    }
                    tv4.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c5==0) {
                    c5 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x5 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x5 = (sign_x == 1) ? 2 : 1;
                    }
                    tv5.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c6==0) {
                    c6 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x6 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x6 = (sign_x == 1) ? 2 : 1;
                    }
                    tv6.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c7==0) {
                    c7 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x7 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x7 = (sign_x == 1) ? 2 : 1;
                    }
                    tv7.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c8==0) {
                    c8 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x8 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x8 = (sign_x == 1) ? 2 : 1;
                    }
                    tv8.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c9==0) {
                    c9 = 1;
                    if (player.getText().toString().equals(player1_name)) {
                        player.setText(player2_name);
                        sign = (sign_x == 1) ? "X" : "O";
                        x9 = (sign_x == 1) ? 1 : 2;
                    } else {
                        player.setText(player1_name);
                        sign = (sign_x == 1) ? "O" : "X";
                        x9 = (sign_x == 1) ? 2 : 1;
                    }
                    tv9.setText(sign);
                    checkForWinOrDraw();
                }
            }
        });
    }
    private boolean checkWinCondition(int sign) {
        if(sign == 1){
            if(((x1 == 1 && x2 == 1 && x3 == 1) ||
                    (x4 == 1 && x5 == 1 && x6 == 1) ||
                    (x7 == 1 && x8 == 1 && x9 == 1) ||
                    (x1 == 1 && x4 == 1 && x7 == 1) ||
                    (x2 == 1 && x5 == 1 && x8 == 1) ||
                    (x3 == 1 && x6 == 1 && x9 == 1) ||
                    (x1 == 1 && x5 == 1 && x9 == 1) ||
                    (x3 == 1 && x5 == 1 && x7 == 1))||

                    ((x1 == 2 && x2 == 2 && x3 == 2) ||
                            (x4 == 2 && x5 == 2 && x6 == 2) ||
                            (x7 == 2 && x8 == 2 && x9 == 2) ||
                            (x1 == 2 && x4 == 2 && x7 == 2) ||
                            (x2 == 2 && x5 == 2 && x8 == 2) ||
                            (x3 == 2 && x6 == 2 && x9 == 2) ||
                            (x1 == 2 && x5 == 2 && x9 == 2) ||
                            (x3 == 2 && x5 == 2 && x7 == 2))){
                return true;
            }
        }else if(sign == 2){
            if(((x1 == 1 && x2 == 1 && x3 == 1) ||
                    (x4 == 1 && x5 == 1 && x6 == 1) ||
                    (x7 == 1 && x8 == 1 && x9 == 1) ||
                    (x1 == 1 && x4 == 1 && x7 == 1) ||
                    (x2 == 1 && x5 == 1 && x8 == 1) ||
                    (x3 == 1 && x6 == 1 && x9 == 1) ||
                    (x1 == 1 && x5 == 1 && x9 == 1) ||
                    (x3 == 1 && x5 == 1 && x7 == 1))||

                    ((x1 == 2 && x2 == 2 && x3 == 2) ||
                            (x4 == 2 && x5 == 2 && x6 == 2) ||
                            (x7 == 2 && x8 == 2 && x9 == 2) ||
                            (x1 == 2 && x4 == 2 && x7 == 2) ||
                            (x2 == 2 && x5 == 2 && x8 == 2) ||
                            (x3 == 2 && x6 == 2 && x9 == 2) ||
                            (x1 == 2 && x5 == 2 && x9 == 2) ||
                            (x3 == 2 && x5 == 2 && x7 == 2))){
                return true;
            }
        }
        return false;
    }
    private boolean isTableFull() {
        return c1 == 1 && c2 == 1 && c3 == 1 && c4 == 1 && c5 == 1 && c6 == 1 && c7 == 1 && c8 == 1 && c9 == 1;
    }
    private void checkForWinOrDraw() {
        if (checkWinCondition(sign_x == 1 ? 1 : 2)) {
            if(sign_x == 1){
                Intent intent = new Intent(MainActivity3.this, Result.class);
                intent.putExtra("result", (sign.equals("X")) ? player1_name+" Won" : player2_name+" Won");
                intent.putExtra("player1_name", player1_name);
                intent.putExtra("player2_name", player2_name);
                startActivity(intent);
            }else if(sign_x == 2){
                Intent intent = new Intent(MainActivity3.this, Result.class);
                intent.putExtra("result", (sign.equals("O")) ? player1_name+" Won" : player2_name+" Won");
                intent.putExtra("player1_name", player1_name);
                intent.putExtra("player2_name", player2_name);
                startActivity(intent);
            }
        }else if (isTableFull()) {
            Intent intent = new Intent(MainActivity3.this, Result.class);
            intent.putExtra("result", "        Draw");
            intent.putExtra("player1_name", player1_name);
            intent.putExtra("player2_name", player2_name);
            startActivity(intent);
        }
    }
}