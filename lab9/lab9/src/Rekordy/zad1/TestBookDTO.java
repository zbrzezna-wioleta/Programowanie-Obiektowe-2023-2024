package Rekordy.zad1;

public class TestBookDTO {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz", 25.67, 2010);
        System.out.println(b1);
        BookDTO b2 = new BookDTO("Krzyżacy", "Henryk Sienkiewicz", 35.67, 2000);
        BookDTO b3 = new BookDTO("TO", "Stephen King", 89.99, 2017);

        /*
        BookDTO b2 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz", 25.67, 2010);
        System.out.println(b1.equals(b2));
        System.out.println(b1 == b2);
        System.out.println(b1.hashCode() == b2.hashCode());
        System.out.println(b1.title());
        //b1.title() = "gadfgdfg";
        */
    }
}
