package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.musicalstructure.AlbumAdapter;
import com.example.android.musicalstructure.Music;
import com.example.android.musicalstructure.R;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

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

        AlbumAdapter adapter =
                new AlbumAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
