package com.example.android.musicalstructure;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));
        songs.add(new Music("Sample Song", "Sample Artist", "Sample Album", R.raw.sample_audio_file));

        SongAdapter adapter =
                new SongAdapter(this, songs, R.color.colorMainBackground);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent nowIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                nowIntent.putExtra("songtitle", songs.get(position));
                startActivity(nowIntent);
            }
        });
    }
}
