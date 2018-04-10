package com.example.android.musicalstructure;


public class Music {
    private String mSong;
    private String mArtist;
    private String mAlbum;

    public Music (String song, String artist, String album){
        mSong = song;
        mArtist = artist;
        mAlbum = album;
    }

    public String getSong(){
        return mSong;
    }

    public String getArtist(){
        return mArtist;
    }

    public String getAlbum(){
        return mAlbum;
    }
}