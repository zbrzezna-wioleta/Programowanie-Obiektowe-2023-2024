package InterfejsComparator.zad3;

import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        Car[] s = new Car[5];
        s[0] = new Car("AA", 2003, 1234);
        s[1] = new Car("AA", 2015, 1234);
        s[2] = new Car("AA", 2001, 1234);
        s[3] = new Car("AA", 2023, 1234);
        s[4] = new Car("AA", 2007, 1234);

        for (var elem:s){
            System.out.println(elem);
        }

        Arrays.sort(s, new rokProdukcjiComparator());

        for (var elem:s){
            System.out.println(elem);
        }
    }
}
