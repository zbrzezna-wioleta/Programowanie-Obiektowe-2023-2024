package Interfejsy.Comparable.zad11;

import java.util.Arrays;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        Student s1= new Student("Ania",3.4,2001);
        Student s2= new Student("Ania",3.4,2002);
        Student s3= new Student("Ania",5.4,2001);
        Student s4= new Student("Ania",3.6,2001);

        Student[]tab={s1,s2,s3,s4};
        Arrays.sort(tab);
        for(int i=0;i<4;i++){
            System.out.println(tab[i].toString());
        }
    }
}
