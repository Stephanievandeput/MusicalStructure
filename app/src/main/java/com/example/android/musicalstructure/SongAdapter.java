package com.example.android.musicalstructure;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Music> {

    public SongAdapter(Activity context, ArrayList<Music> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_songs, parent, false);
        }

        // Get the Music object located at this position in the list
        Music currentSong = getItem(position);

        // Find the TextView in the activity_songs.xml layout with the ID songs_text_view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.songs_text_view);
        // Get the song from the current Music object and
        // set this text on the song TextView
        songTextView.setText(currentSong.getSong());

        // Find the TextView in the activity_songs.xml layout with the ID artists_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artists_text_view);
        // Get the artist from the current Music object and
        // set this text on the artist TextView
        artistTextView.setText(currentSong.getArtist());

        // Find the TextView in the activity_songs.xml layout with the ID albums_text_view
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.albums_text_view);
        // Get the album from the current Music object and
        // set this text on the album TextView
        albumTextView.setText(currentSong.getAlbum());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
