package zlozonepola.zad3lt;

import zlozonepola.zad3.Book;
import zlozonepola.zad3.FantasyBook;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(4.2);
        list.add(7.2);
        list.add(8.9);
        Book book1 = new Book("After", "Anna Nowak", list);
        System.out.println(book1);
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(4.2);
        list2.add(7.2);
        list2.add(8.9);
        FantasyBook fantasyBook1 = new FantasyBook("After", "Anna Nowak", list2, "XX");
        System.out.println(fantasyBook1);
        System.out.println(book1.equals(fantasyBook1));
        System.out.println(book1.hashCode() == fantasyBook1.hashCode());

    }
}
