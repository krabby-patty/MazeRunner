package com.example.mazerunner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title,title2;
    ImageView image;
    Animation topAnim,bottomAnim;
    Button btnPlay,btnSettings;
    SharedPreferences sharedPreferences;
    int sound1=0,sound2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        playopen();
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        setContentView(R.layout.splash_screen);
        title2 = (TextView) findViewById(R.id.title2);
        image = (ImageView) findViewById(R.id.img);
        image.setAnimation(topAnim);
        title2.setAnimation(bottomAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                active();
            }
        },3000);

    }

    public void active()
    {
        playrun();
        Intent intent = new Intent(this, mainmenu.class);
        startActivity(intent);
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
    public void playopen()
    {
        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.gong);
        mp1.start();

    }
    public void playrun()
    {
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.run);
        mp.setLooping(true);
        mp.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onDestroy();
    }


}
