package com.frederick.iterator;

import java.util.Hashtable;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SongCollection70s songCollection70s = new SongCollection70s();
        songCollection70s.add(new Song("Dancing Queen", "ABBA", 1976));
        songCollection70s.add(new Song("Stayin Alive", "Bee Gees", 1977));
        songCollection70s.add(new Song("Go Your Own Way", "Fleetwood Mac", 1977));

        SongCollection80s songCollection80s = new SongCollection80s();
        songCollection80s.add(new Song("Billie Jean", "Michael Jackson", 1988));
        songCollection80s.add(new Song("With or Without You", "U2", 1987));
        songCollection80s.add(new Song("What's Love Got to Do with It", "Tina Turner", 1984));

        SongCollection90s songCollection90s = new SongCollection90s();
        songCollection90s.add(new Song("I Want It That Way", "Backstreet Boys", 1999));
        songCollection90s.add(new Song("Don't Speak", "No Doubt", 1995));
        songCollection90s.add(new Song("My Heart Will Go On", "Celine Dion", 1997));

        Song[] songs70s = songCollection70s.getSongs();
        System.out.println("\n== Songs of the 70s ==");
        for (int i = 0; i < songs70s.length; i++) {
            if (songs70s[i] != null) {
                System.out.println(songs70s[i].toString());
            }
        }

        Hashtable<Integer, Song> songs80s = songCollection80s.getSongs();
        System.out.println("\n== Songs of the 80s ==");
        for (int i = 0; i < songs80s.size(); i++) {
            System.out.println(songs80s.get(i).toString());
        }

        List<Song> songs90s = songCollection90s.getSongs();
        System.out.println("\n== Songs of the 90s ==");
        for (int i = 0; i < songs90s.size() ; i++) {
            System.out.println(songs90s.get(i).toString());
        }
    }
}
