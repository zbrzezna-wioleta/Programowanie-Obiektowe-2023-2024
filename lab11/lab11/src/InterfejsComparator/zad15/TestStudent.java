package InterfejsComparator.zad15;

import InterfejsComparator.zad15.Student;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] list = new Student[5];
        list[0] = new Student(123, "DD", 4.3);
        list[1] = new Student(312, "CC", 2.8);
        list[2] = new Student(456, "AA", 4.6);
        list[3] = new Student(215, "BB", 3.1);
        list[4] = new Student(783, "EE", 4.3);

        System.out.println("Before:");
        for(var el: list){
            System.out.println(el);
        }

        Arrays.sort(list, new AverageGradeComparator());
        System.out.println("\nAfter grade sorting:");
        for(var el: list){
            System.out.println(el);
        }

        Arrays.sort(list, new IdComparator());
        System.out.println("\nAfter grade and id sorting:");
        for(var el: list){
            System.out.println(el);
        }
    }
}
