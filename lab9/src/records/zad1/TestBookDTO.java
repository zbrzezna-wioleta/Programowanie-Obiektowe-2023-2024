package records.zad1;

public class TestBookDTO {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("alicja","kopernik",20.30,2002);
        BookDTO b2 = new BookDTO("alicja","kopernik",20.30,2002);
        System.out.println(b1.price());
    }
}
