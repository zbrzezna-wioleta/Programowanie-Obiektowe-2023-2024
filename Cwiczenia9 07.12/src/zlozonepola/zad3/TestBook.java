package zlozonepola.zad3;

public class TestBook {
    public static void main(String[] args) {
        double [] tab = {4.5, 2.0, 5};
        Book book1 = new Book("After", "Anna Nowak", tab);
        System.out.println(book1);
        FantasyBook fantasyBook1 = new FantasyBook("After", "Anna Nowak", tab, "XX");
        System.out.println(fantasyBook1);
        System.out.println(book1.equals(fantasyBook1));
        System.out.println(book1.hashCode() == fantasyBook1.hashCode());
        double [] temp = book1.getReviews();
        temp[0] = 8;
        System.out.println(book1);
        book1.addReviews(7);
        System.out.println(book1);
        book1.removeLast();
        System.out.println(book1);
    }
}
