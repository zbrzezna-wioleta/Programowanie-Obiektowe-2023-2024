package zlozonePolaWKlasie.zad8;

public class TestProcessor {
    public static void main(String[] args) {
        Processor p1= new Processor(23.3,4,"intel");
        Computer c1 = new Computer("macbook","s4",p1);
        System.out.println(p1);
        System.out.println(c1);
    }

}
