package zlozonePolaWKlasie.zad8;

import zlozonePolaWKlasie.ArtGallery;

import java.util.ArrayList;

public class TestArtGallery {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Mona lisa");
        list.add("Mona lusa");
        list.add("Dama z łasicą");
        ArtGallery a1= new ArtGallery("galeria sztok pieknych","Meksyk",list);

    }
}
