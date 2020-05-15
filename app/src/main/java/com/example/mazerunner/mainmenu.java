package com.example.mazerunner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mainmenu extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView title;
    Button btnPlay,btnSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title= (TextView) findViewById(R.id.TITLE);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnSettings = (Button) findViewById(R.id.btnSettings);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPlay();
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSet();
            }
        });

    }
    public void goPlay()
    {
        Intent intent;
        sharedPreferences = getSharedPreferences("SHARED_PREFS",MODE_PRIVATE);
        int grid = sharedPreferences.getInt("Grid",3);
        if(grid == 3)
            intent = new Intent(this,mazeGame.class);
        else
            intent = new Intent(this, mazegame2.class);
        startActivity(intent);
    }
    public void goSet()
    {
        Intent intent = new Intent(this,settings.class);
        startActivity(intent);
    }
}
