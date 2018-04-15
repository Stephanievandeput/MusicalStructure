package com.example.android.musicalstructure;


import android.os.Parcel;
import android.os.Parcelable;

public class Music implements Parcelable {
    private String mSong;
    private String mArtist;
    private String mAlbum;
    private int mAudioFile;

    public Music(String song, String artist, String album) {
        mSong = song;
        mArtist = artist;
        mAlbum = album;
    }

    public Music(String song, String artist, String album, int audioFile) {
        mSong = song;
        mArtist = artist;
        mAlbum = album;
        mAudioFile = audioFile;
    }

    protected Music(Parcel in) {
        mSong = in.readString();
        mArtist = in.readString();
        mAlbum = in.readString();
        mAudioFile = in.readInt();
    }

    public static final Creator<Music> CREATOR = new Creator<Music>() {
        @Override
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        @Override
        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

    public String getSong() {
        return mSong;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public int getAudioFile() {
        return mAudioFile;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mSong);
        parcel.writeString(mArtist);
        parcel.writeString(mAlbum);
        parcel.writeInt(mAudioFile);
    }
}