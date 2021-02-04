package com.frederick.iterator;

import java.util.ArrayList;
import java.util.List;

public class SongCollection90s {
    private List<Song> songs = new ArrayList<>();

    public void add(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }
}
