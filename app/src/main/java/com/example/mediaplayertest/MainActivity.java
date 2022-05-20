package com.example.mediaplayertest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     MediaPlayer mediaPlayer;

     Button btPlay;
     Button btPause;
     Button btStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        btPlay = (Button) findViewById(R.id.btPlay);
        btPause = (Button) findViewById(R.id.btPause);
        btStop = (Button) findViewById(R.id.btStop);

        btStop.setEnabled(false);

        createOnClickListeners();
    }

    private void createOnClickListeners() {
        btPlay.setOnClickListener(new Button.OnClickListener()) {
            @Override
            public void onClick(Button button) {
            Button btPlay = (Button) button;
            btPlay.
            }
        }
        
    }




}