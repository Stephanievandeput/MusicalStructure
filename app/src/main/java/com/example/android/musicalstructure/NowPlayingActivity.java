package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button toSongs = (Button) findViewById(R.id.to_songs);
        toSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSongsIntent = new Intent(NowPlayingActivity.this, SongsActivity.class);
                startActivity(toSongsIntent);
            }
        });

        Intent intent = getIntent();
        Music music = intent.getParcelableExtra("songtitle");

        if (music != null) {
            String songtitle = music.getSong();
            String artist = music.getArtist();
            String album = music.getAlbum();

            TextView textView1 = findViewById(R.id.now_playing_text_view1);
            textView1.setText(songtitle);

            TextView textView2 = findViewById(R.id.now_playing_text_view2);
            textView2.setText(artist);

            TextView textView3 = findViewById(R.id.now_playing_text_view3);
            textView3.setText(album);

            Button playButton = findViewById(R.id.play_button);
            Button stopButton = findViewById(R.id.stop_button);
            Button pauseButton = findViewById(R.id.pause_button);

            mediaPlayer = MediaPlayer.create(NowPlayingActivity.this, music.getAudioFile());

            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!mediaPlayer.isPlaying()) {
                        mediaPlayer.start();
                    } else if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                }
            });

            pauseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.pause();
                }
            });

            stopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.stop();
                }
            });


        }
    }
}
