package com.frederick.iterator;

import java.util.Hashtable;

public class SongCollection80s {
    private Hashtable<Integer, Song> songs = new Hashtable<>();
    private int index;

    public void add(Song song) {
        songs.put(index, song);
        index++;
    }

    public Hashtable<Integer, Song> getSongs() {
        return songs;
    }
}
