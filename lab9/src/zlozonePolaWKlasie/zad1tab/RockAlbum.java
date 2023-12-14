package zlozonePolaWKlasie.zad1tab;

import java.util.ArrayList;
import java.util.Objects;

public class RockAlbum extends MusicAlbum {
    private String rockGenre;

    public RockAlbum(String title, String author, ArrayList<Double> ratings, String rockGenre) {
        super(title, author, ratings);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString() {
        return super.toString() +
                "rockGenre='" + rockGenre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RockAlbum rockAlbum = (RockAlbum) o;

        return Objects.equals(rockGenre, rockAlbum.rockGenre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (rockGenre != null ? rockGenre.hashCode() : 0);
        return result;
    }
}
