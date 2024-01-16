package school;

import java.util.ArrayList;
import java.util.Collections;

public class TestSchoolBook {
    public static void main(String[] args) {
        ArrayList<SchoolBook> list = new ArrayList<>(4);
        list.add(new SchoolBook("Hobbit", "J.R.R. Tolkien", 8.6f));
        list.add(new SchoolBook("Krzyżacy", "Henryk Sienkiewicz", 4.3f));
        list.add(new SchoolBook("Ksiazka135546", "autor1", 7.2f));
        list.add(new SchoolBook("Ksiazka22", "autor2", 5.7f));

        System.out.println("Before:");
        for(var el:list){
            System.out.println(el);
        }

        Collections.sort(list);

        System.out.println("\nAfter:");
        for(var el:list){
            System.out.println(el);
        }
    }
}
