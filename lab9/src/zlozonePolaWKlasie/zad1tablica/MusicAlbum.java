package zlozonePolaWKlasie.zad1tablica;

import java.util.Arrays;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String author;
    private double ratings[];

    public MusicAlbum(String title, String author, double[] ratings) {
        this.title = title;
        this.author = author;
        this.ratings = ratings;
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

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicAlbum that = (MusicAlbum) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(author, that.author)) return false;
        return Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }
    public void addRating(double a){
        double[] temp=new double[ratings.length+1];
        for(int i=0;i<ratings.length;i++){
            temp[i]=ratings[i];
        }
        temp[ratings.length]=a;
        ratings=temp;
    }
    public void removeRating(double a){
        double[] temp=new double[ratings.length-1];
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]!=a){
            temp[i]=ratings[i];
        }}
        ratings=temp;

    }
}

