package zlozonePolaWKlasie.zad1tablica;

public class TestMusicAlbum {
    public static void main(String[] args) {
        double tab[]={2.5,6.4,8.8,9.9};
        double tab2[]={1.5,6.4,86.8,9.9};
        MusicAlbum m1= new MusicAlbum("super","taylor",tab);
        System.out.println(m1.toString());
        m1.addRating(3.5);
        System.out.println(m1.toString());
        m1.removeRating(3.5);
        System.out.println(m1.toString());

    }
}
