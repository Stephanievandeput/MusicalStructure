package com.example.android.musicalstructure;


import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Sunburn", "Muse","Showbiz" ));
        songs.add(new Music("Muscle Museum", "Muse","Showbiz" ));
        songs.add(new Music("Fillip", "Muse","Showbiz" ));
        songs.add(new Music("Falling Down", "Muse","Showbiz" ));
        songs.add(new Music("Cave", "Muse","Showbiz" ));
        songs.add(new Music("Showbiz", "Muse","Showbiz" ));
        songs.add(new Music("Unintended", "Muse","Showbiz" ));
        songs.add(new Music("Uno", "Muse","Showbiz" ));
        songs.add(new Music("Sober", "Muse","Showbiz" ));
        songs.add(new Music("Escape", "Muse","Showbiz" ));
        songs.add(new Music("Overdue", "Muse","Showbiz" ));
        songs.add(new Music("Hate This & I'll Love You", "Muse","Showbiz" ));

        SongAdapter adapter =
                new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);


    }
}
