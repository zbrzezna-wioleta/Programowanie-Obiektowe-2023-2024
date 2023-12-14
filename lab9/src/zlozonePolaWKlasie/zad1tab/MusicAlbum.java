package zlozonePolaWKlasie.zad1tab;

import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String author;
    private ArrayList<Double>ratings;

    public void addRating(double a){
        ratings.add(a);
    }

    public MusicAlbum(String title, String author, ArrayList<Double> ratings) {
        this.title = title;
        this.author = author;
        this.ratings = ratings;
    }

    public void removeRating(double a){
        ratings.remove(a);

    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ratings=" + ratings +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Double> getRatings() {
        return new ArrayList<>(ratings);
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = ratings != null ? new ArrayList<>(ratings) : new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicAlbum that = (MusicAlbum) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(author, that.author)) return false;
        return Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (ratings != null ? ratings.hashCode() : 0);
        return result;
    }
}

