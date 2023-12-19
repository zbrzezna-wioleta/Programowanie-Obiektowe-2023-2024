package InterfejsComparator.zad10;


import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(123, "DD", 4.3));
        list.add(new Student(312, "CC", 2.8));
        list.add(new Student(456, "AA", 4.6));
        list.add(new Student(215, "BB", 3.1));
        list.add(new Student(783, "EE", 4.3));

        System.out.println("Before:");

        for(var elem: list){
            System.out.println(elem);
        }

        list.sort(new MyComparator());

        System.out.println("After:");

        for(var elem: list){
            System.out.println(elem);
        }
    }
}
