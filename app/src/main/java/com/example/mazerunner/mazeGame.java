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

public class mazeGame extends AppCompatActivity {
    Button E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,E12,S1,S2,S3,S4,home;
    int edges[] = {0,0,0,0,0,0,0,0,0,0,0,0},curplay,boxes[] = {0,0,0,0},player[] = {0,0,0,0};
    int num = 2,boxclose;
    int soundallow;
    SharedPreferences sharedPreferences;
    Vibrator vibrator;

    TextView tv;
    private RelativeLayout myLayout = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maze_game);
        sharedPreferences = getSharedPreferences("SHARED_PREFS",MODE_PRIVATE);
        num = sharedPreferences.getInt("Players",2);
        S1 = (Button) findViewById(R.id.s1);
        S2 = (Button) findViewById(R.id.s2);
        S3 = (Button) findViewById(R.id.s3);
        S4 = (Button) findViewById(R.id.s4);
        home = (Button) findViewById(R.id.Home);
        home.setVisibility(View.INVISIBLE);
        S1.setBackgroundColor(Color.WHITE);
        S2.setBackgroundColor(Color.WHITE);
        S3.setBackgroundColor(Color.WHITE);
        S4.setBackgroundColor(Color.WHITE);
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
        if(edges[0]*edges[2]*edges[3]*edges[5] != 0)
        {
            boxes[0] = p;
            player[p-1]++;
            boxclose = 1;
            S1.setBackgroundColor(color);
        }
        if(boxes[1] ==0)
        if(edges[1]*edges[3]*edges[4]*edges[6] != 0)
        {
            boxes[1] = p;
            player[p-1]++;
            boxclose = 1;
            S2.setBackgroundColor(color);
        }
        if(boxes[2] == 0)
        if(edges[5]*edges[7]*edges[8]*edges[10] != 0)
        {
            boxes[2] = p;
            player[p-1]++;
            boxclose = 1;
            S3.setBackgroundColor(color);
        }
        if(boxes[3] == 0)
        if(edges[6]*edges[8]*edges[9]*edges[11] != 0)
        {
            boxes[3] = p;
            player[p-1]++;
            boxclose = 1;
            S4.setBackgroundColor(color);
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
        for(i=0;i<4;i++)
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
