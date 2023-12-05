package ZłożonePolaWKlasie.zad1;

import java.util.Arrays;

public class testMusicAlbum {
    public static void main(String[] args) {
        double[] oc = {5.2, 6.5, 3.9};
        MusicAlbum m1 = new MusicAlbum("123", "234", oc);
        System.out.println(Arrays.toString(m1.ratings));
        m1.dodajUsunOcene(6.6, true, false);
        m1.dodajUsunOcene(6.6, true, false);
        System.out.println(Arrays.toString(m1.ratings));
        m1.dodajUsunOcene(6.6, false, true);
        System.out.println(Arrays.toString(m1.ratings));
    }
}
