package ZłożonePolaWKlasie.zad1;

import java.util.ArrayList;

public class MusicAlbum {
    String title;
    String artist;
    double[] ratings;

    public MusicAlbum(String title, String artist, double[] ratings){
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
    }

    public double[] dodajUsunOcene(double ocena, boolean dodaj, boolean usun){
        if (dodaj) {
            int length = ratings.length + 1;
            double[] newRatings = new double[length];
            for (int i = 0; i < ratings.length; i++) {
                newRatings[i] = ratings[i];
            }
            newRatings[length - 1] = ocena;
            ratings = newRatings;
        }
        if (usun){
            boolean usunieto = false;
            int index = 0;
            int length = ratings.length - 1;
            double[] newRatings = new double[length];
            for (int i = 0; i < ratings.length; i++) {
                if(ratings[i] != ocena) {
                    newRatings[index] = ratings[i];
                    index++;
                } else if(usunieto){
                    newRatings[index] = ratings[i];
                    index++;
                } else {
                    usunieto = true;
                }
            }
            ratings = newRatings;
        }
        return ratings;
    }
}
