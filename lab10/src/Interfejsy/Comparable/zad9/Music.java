package Interfejsy.Comparable.zad9;

import java.time.LocalDate;

public class Music implements Comparable<Music>{
    private String title;
    private String artist;
    private int releaseYear;

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Music o) {
        return this.releaseYear -o.releaseYear;
    }
}
