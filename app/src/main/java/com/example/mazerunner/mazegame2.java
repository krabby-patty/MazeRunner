package com.example.mazerunner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mazerunner.views.CustomView;

import static android.content.SharedPreferences.*;

public class mazegame2 extends AppCompatActivity {
    Button E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,E12,E13,E14,E15,E16,E17,E18,E19,E20,E21,E22,E23,E24,S1,S2,S3,S4,S5,S6,S7,S8,S9,home;
    int edges[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},curplay,boxes[] = {0,0,0,0,0,0,0,0,0},player[] = {0,0,0,0};
    int num = 2,boxclose;
    int soundallow=0;
    SharedPreferences sharedPreferences;
    Vibrator vibrator;

    TextView tv;
    private RelativeLayout myLayout = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazegame2);
        sharedPreferences = getSharedPreferences("SHARED_PREFS",MODE_PRIVATE);
        num = sharedPreferences.getInt("Players",2);
        S1 = (Button) findViewById(R.id.s1);
        S2 = (Button) findViewById(R.id.s2);
        S3 = (Button) findViewById(R.id.s3);
        S4 = (Button) findViewById(R.id.s4);
        S5 = (Button) findViewById(R.id.s5);
        S6 = (Button) findViewById(R.id.s6);
        S7 = (Button) findViewById(R.id.s7);
        S8 = (Button) findViewById(R.id.s8);
        S9 = (Button) findViewById(R.id.s9);
        home = (Button) findViewById(R.id.Home);
        home.setVisibility(View.INVISIBLE);
        S1.setBackgroundColor(Color.WHITE);
        S2.setBackgroundColor(Color.WHITE);
        S3.setBackgroundColor(Color.WHITE);
        S4.setBackgroundColor(Color.WHITE);
        S5.setBackgroundColor(Color.WHITE);
        S6.setBackgroundColor(Color.WHITE);
        S7.setBackgroundColor(Color.WHITE);
        S8.setBackgroundColor(Color.WHITE);
        S9.setBackgroundColor(Color.WHITE);
        curplay = 1;
        tv = (TextView) findViewById(R.id.plann);
        tv.setText("Player 1 turn");
        E1 = (Button) findViewById(R.id.b1);
        E1.setBackgroundColor(Color.WHITE);
        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edges[0]==0) {
                    edges[0] = curplay;
                    if (curplay == 1)
                        E1.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E1.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E1.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E1.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E2 = (Button) findViewById(R.id.b2);
        E2.setBackgroundColor(Color.WHITE);
        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edges[1]==0) {
                    edges[1] = curplay;
                    if (curplay == 1)
                        E2.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E2.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E2.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E2.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E3 = (Button) findViewById(R.id.b3);
        E3.setBackgroundColor(Color.WHITE);
        E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edges[2]==0) {
                    edges[2] = curplay;
                    if (curplay == 1)
                        E3.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E3.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E3.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E3.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E4 = (Button) findViewById(R.id.b4);
        E4.setBackgroundColor(Color.WHITE);
        E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[3] == 0) {
                    edges[3] = curplay;
                    if (curplay == 1)
                        E4.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E4.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E4.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E4.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E5 = (Button) findViewById(R.id.b5);
        E5.setBackgroundColor(Color.WHITE);
        E5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[4] == 0) {
                    edges[4] = curplay;
                    if (curplay == 1)
                        E5.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E5.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E5.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E5.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E6 = (Button) findViewById(R.id.b6);
        E6.setBackgroundColor(Color.WHITE);
        E6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[5] == 0) {
                    edges[5] = curplay;
                    if (curplay == 1)
                        E6.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E6.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E6.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E6.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E7 = (Button) findViewById(R.id.b7);
        E7.setBackgroundColor(Color.WHITE);
        E7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[6] == 0) {
                    edges[6] = curplay;
                    if (curplay == 1)
                        E7.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E7.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E7.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E7.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E8 = (Button) findViewById(R.id.b8);
        E8.setBackgroundColor(Color.WHITE);
        E8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[7] == 0) {
                    edges[7] = curplay;
                    if (curplay == 1)
                        E8.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E8.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E8.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E8.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E9 = (Button) findViewById(R.id.b9);
        E9.setBackgroundColor(Color.WHITE);
        E9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edges[8]==0) {
                    edges[8] = curplay;
                    if (curplay == 1)
                        E9.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E9.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E9.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E9.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E10 = (Button) findViewById(R.id.b10);
        E10.setBackgroundColor(Color.WHITE);
        E10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[9] == 0) {
                    edges[9] = curplay;
                    if (curplay == 1)
                        E10.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E10.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E10.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E10.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E11 = (Button) findViewById(R.id.b11);
        E11.setBackgroundColor(Color.WHITE);
        E11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[10] == 0) {
                    edges[10] = curplay;
                    if (curplay == 1)
                        E11.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E11.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E11.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E11.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E12 = (Button) findViewById(R.id.b12);
        E12.setBackgroundColor(Color.WHITE);
        E12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[11] == 0) {
                    edges[11] = curplay;
                    if (curplay == 1)
                        E12.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E12.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E12.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E12.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E13 = (Button) findViewById(R.id.b13);
        E13.setBackgroundColor(Color.WHITE);
        E13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[12] == 0) {
                    edges[12] = curplay;
                    if (curplay == 1)
                        E13.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E13.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E13.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E13.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E14 = (Button) findViewById(R.id.b14);
        E14.setBackgroundColor(Color.WHITE);
        E14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[13] == 0) {
                    edges[13] = curplay;
                    if (curplay == 1)
                        E14.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E14.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E14.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E14.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E15 = (Button) findViewById(R.id.b15);
        E15.setBackgroundColor(Color.WHITE);
        E15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[14] == 0) {
                    edges[14] = curplay;
                    if (curplay == 1)
                        E15.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E15.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E15.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E15.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E16 = (Button) findViewById(R.id.b16);
        E16.setBackgroundColor(Color.WHITE);
        E16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[15] == 0) {
                    edges[15] = curplay;
                    if (curplay == 1)
                        E16.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E16.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E16.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E16.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E17 = (Button) findViewById(R.id.b17);
        E17.setBackgroundColor(Color.WHITE);
        E17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[16] == 0) {
                    edges[16] = curplay;
                    if (curplay == 1)
                        E17.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E17.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E17.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E17.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E18 = (Button) findViewById(R.id.b18);
        E18.setBackgroundColor(Color.WHITE);
        E18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[17] == 0) {
                    edges[17] = curplay;
                    if (curplay == 1)
                        E18.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E18.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E18.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E18.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E19 = (Button) findViewById(R.id.b19);
        E19.setBackgroundColor(Color.WHITE);
        E19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[18] == 0) {
                    edges[18] = curplay;
                    if (curplay == 1)
                        E19.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E19.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E19.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E19.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E20 = (Button) findViewById(R.id.b20);
        E20.setBackgroundColor(Color.WHITE);
        E20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[19] == 0) {
                    edges[19] = curplay;
                    if (curplay == 1)
                        E20.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E20.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E20.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E20.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E21 = (Button) findViewById(R.id.b21);
        E21.setBackgroundColor(Color.WHITE);
        E21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[20] == 0) {
                    edges[20] = curplay;
                    if (curplay == 1)
                        E21.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E21.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E21.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E21.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E22 = (Button) findViewById(R.id.b22);
        E22.setBackgroundColor(Color.WHITE);
        E22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[21] == 0) {
                    edges[21] = curplay;
                    if (curplay == 1)
                        E22.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E22.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E22.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E22.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E23 = (Button) findViewById(R.id.b23);
        E23.setBackgroundColor(Color.WHITE);
        E23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[22] == 0) {
                    edges[22] = curplay;
                    if (curplay == 1)
                        E23.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E23.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E23.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E23.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        E24 = (Button) findViewById(R.id.b24);
        E24.setBackgroundColor(Color.WHITE);
        E24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edges[23] == 0) {
                    edges[23] = curplay;
                    if (curplay == 1)
                        E24.setBackgroundColor(Color.RED);
                    else if (curplay == 2)
                        E24.setBackgroundColor(Color.BLUE);
                    else if (curplay == 3)
                        E24.setBackgroundColor(Color.YELLOW);
                    else if (curplay == 4)
                        E24.setBackgroundColor(Color.GREEN);
                    checkComp(curplay);
                    if (boxclose == 0)
                        playerToggle();
                    if (curplay != 0)
                        tv.setText("Player " + String.valueOf(curplay) + " turn");
                }
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });

    }
    public void checkComp(int p)
    {

        int color ;
        if(p==1)
        {
            color = Color.RED;
        }
        else if(p==2)
            color = Color.BLUE;
        else if (p==3)
            color = Color.YELLOW;
        else if(p==4)
            color = Color.GREEN;
        else
            color = Color.WHITE;
        boxclose = 0;
        if(boxes[0] == 0)
            if(edges[0]*edges[3]*edges[4]*edges[7] != 0)
            {
                boxes[0] = p;
                player[p-1]++;
                boxclose = 1;
                S1.setBackgroundColor(color);
            }
        if(boxes[1] ==0)
            if(edges[1]*edges[4]*edges[5]*edges[8] != 0)
            {
                boxes[1] = p;
                player[p-1]++;
                boxclose = 1;
                S2.setBackgroundColor(color);
            }
        if(boxes[2] == 0)
            if(edges[5]*edges[2]*edges[6]*edges[9] != 0)
            {
                boxes[2] = p;
                player[p-1]++;
                boxclose = 1;
                S3.setBackgroundColor(color);
            }
        if(boxes[3] == 0)
            if(edges[7]*edges[10]*edges[14]*edges[11] != 0)
            {
                boxes[3] = p;
                player[p-1]++;
                boxclose = 1;
                S4.setBackgroundColor(color);
            }
        if(boxes[4] == 0)
            if(edges[8]*edges[12]*edges[15]*edges[11] != 0)
            {
                boxes[4] = p;
                player[p-1]++;
                boxclose = 1;
                S5.setBackgroundColor(color);
            }
        if(boxes[5] == 0)
            if(edges[12]*edges[13]*edges[9]*edges[16] != 0)
            {
                boxes[5] = p;
                player[p-1]++;
                boxclose = 1;
                S6.setBackgroundColor(color);
            }
        if(boxes[6] == 0)
            if(edges[14]*edges[17]*edges[18]*edges[21] != 0)
            {
                boxes[6] = p;
                player[p-1]++;
                boxclose = 1;
                S7.setBackgroundColor(color);
            }
        if(boxes[7] == 0)
            if(edges[15]*edges[18]*edges[19]*edges[22] != 0)
            {
                boxes[7] = p;
                player[p-1]++;
                boxclose = 1;
                S8.setBackgroundColor(color);
            }
        if(boxes[8] == 0)
            if(edges[16]*edges[19]*edges[20]*edges[23] != 0)
            {
                boxes[8] = p;
                player[p-1]++;
                boxclose = 1;
                S9.setBackgroundColor(color);
            }
        winCheck();


        if(boxclose == 1)
        {

            playsound();
        }
    }
    public void winCheck()
    {
        int max,i,gameOver = 1,winner = 0,numwin=0;
        for(i=0;i<9;i++)
            gameOver*=boxes[i];
        if(gameOver!=0)
        {
            max=0;
            for(i=0;i<num;i++)
            {
                if(max<player[i])
                {
                    max = player[i];
                    winner = i;
                }

            }
            for(i=0;i<num;i++)
            {
                if(max==player[i])
                    numwin++;
            }
            if(numwin==1)
            tv.setText("Player " + String.valueOf(winner+1) + " wins!");
            else
            {
                tv.setText("It's a draw!");
            }
            vibrator =(Vibrator)getSystemService(VIBRATOR_SERVICE);
            vibrator.vibrate(1000);
            curplay = 0;

            playwinsound();
            home.setVisibility(View.VISIBLE);
        }
    }
    public void playerToggle()
    {
        curplay++;
        if(curplay>num)
            curplay = 1;
        else if(curplay == 1)
            curplay = 0;
    }
    public void playsound()
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.smb_coin);
        mp.start();
    }
    public void playwinsound()
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.smb_mariodie);
        mp.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goHome();
    }
    private void goHome()
    {
        Intent intent= new Intent(this, mainmenu.class);
        startActivity(intent);
    }

}
