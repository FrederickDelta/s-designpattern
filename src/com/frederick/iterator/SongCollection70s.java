package com.frederick.iterator;

import java.util.ArrayList;
import java.util.List;

public class SongCollection70s {
    private Song[] songs = new Song[10];
    private int index;

    public void add(Song song) {
        songs[index] = song;
        index++;
    }

    public Song[] getSongs() {
        return songs;
    }
}
