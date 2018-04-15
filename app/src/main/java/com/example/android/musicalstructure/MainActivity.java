package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.category_songs);

        // Set a click listener on the songs View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });


        //Find the View that shows the now playing category
        TextView nowPlaying = (TextView) findViewById(R.id.category_now_playing);

        //Set a click listener on the nowPlaying View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the nowPlaying View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });


    }
}
