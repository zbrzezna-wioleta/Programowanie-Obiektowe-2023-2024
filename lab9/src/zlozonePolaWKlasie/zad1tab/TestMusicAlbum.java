package zlozonePolaWKlasie.zad1tab;

import java.util.ArrayList;

public class TestMusicAlbum {
    public static void main(String[] args) {
        ArrayList<Double>list=new ArrayList<Double>();
        list.add(2.4);
        list.add(5.4);
        list.add(5.4);
        list.add(2.9);
        ArrayList<Double>list2=new ArrayList<Double>();
        list2.add(1.2);
        list2.add(1.2);
        list2.add(1.2);

        MusicAlbum m1= new MusicAlbum("Znak","Ewa Farna",list);
        System.out.println(m1.toString());
        m1.addRating(5.5);
        m1.removeRating(2.4);
        System.out.println(m1.toString());
        m1.setRatings(list2);
        System.out.println(m1.toString());
    }
}
