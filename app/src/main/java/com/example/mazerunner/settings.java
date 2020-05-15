package com.example.mazerunner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class settings extends AppCompatActivity {
    Button btn3,btn4,btn23,btn24,btn25,back;
    int players,grid;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn23 = (Button) findViewById(R.id.btn23);
        btn24 = (Button) findViewById(R.id.btn24);
        btn25 = (Button) findViewById(R.id.btn25);


        btn3.setBackgroundColor(Color.WHITE);
        btn4.setBackgroundColor(Color.WHITE);

        btn23.setBackgroundColor(Color.WHITE);
        btn24.setBackgroundColor(Color.WHITE);
        btn25.setBackgroundColor(Color.WHITE);
        sharedPreferences = getSharedPreferences("SHARED_PREFS",MODE_PRIVATE);
        players = sharedPreferences.getInt("Players",2);
        grid = sharedPreferences.getInt("Grid",3);
        back = (Button) findViewById(R.id.Back);
        if(grid == 3)
        {
            btn3.setBackgroundColor(Color.GRAY);
        }
        else if(grid == 4)
        {
            btn4.setBackgroundColor(Color.GRAY);
        }

        if(players == 2)
        {
            btn23.setBackgroundColor(Color.GRAY);
        }
        else if(players == 3)
        {
            btn24.setBackgroundColor(Color.GRAY);
        }
        else if(players == 4)
        {
            btn25.setBackgroundColor(Color.GRAY);
        }
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackgroundColor(Color.GRAY);
                btn4.setBackgroundColor(Color.WHITE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("Grid",3);
                editor.apply();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setBackgroundColor(Color.GRAY);
                btn3.setBackgroundColor(Color.WHITE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("Grid",4);
                editor.apply();
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn23.setBackgroundColor(Color.GRAY);
                btn24.setBackgroundColor(Color.WHITE);
                btn25.setBackgroundColor(Color.WHITE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("Players",2);
                editor.apply();
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn24.setBackgroundColor(Color.GRAY);
                btn23.setBackgroundColor(Color.WHITE);
                btn25.setBackgroundColor(Color.WHITE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("Players",3);
                editor.apply();
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn25.setBackgroundColor(Color.GRAY);
                btn24.setBackgroundColor(Color.WHITE);
                btn23.setBackgroundColor(Color.WHITE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("Players",4);
                editor.apply();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHome();
            }
        });

    }
    public void goHome()
    {
        Intent intent = new Intent(this, mainmenu.class);
        startActivity(intent);
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goHome();
    }
}
