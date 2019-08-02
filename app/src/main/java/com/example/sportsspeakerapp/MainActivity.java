package com.example.sportsspeakerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.sportsspeakerapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imgBoxing, imgKickBoxing, imgJudo, imgKarate, imgAikido, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickBoxing = findViewById(R.id.imgKickBoxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgAikido = findViewById(R.id.imgAikado);
        imgTaekwondo = findViewById(R.id.imgTaekwando);
        imgKarate = findViewById(R.id.imgKarate);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickBoxing.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imageButtonView) {

        switch (imageButtonView.getId()) {
            case R.id.imgBoxing:
                playSportsMusic(imgBoxing.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                playSportsMusic(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportsMusic(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportsMusic(imgJudo.getTag().toString());
                break;
            case R.id.imgAikado:
                playSportsMusic(imgAikido.getTag().toString());
                break;
            case R.id.imgTaekwando:
                playSportsMusic(imgTaekwondo.getTag().toString());
                break;


        }
    }

    private void playSportsMusic(String sportsName) {
        MediaPlayer mMediaPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(sportsName, "raw", getPackageName()));
        mMediaPlayer.start();

    }
}

