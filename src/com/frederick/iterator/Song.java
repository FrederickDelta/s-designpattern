package com.frederick.iterator;

public class Song {
    private String title;
    private String artist;
    private int year;

    public Song(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String toString() {
        return String.format("%d %s - %s", year, artist, title);
    }
}
