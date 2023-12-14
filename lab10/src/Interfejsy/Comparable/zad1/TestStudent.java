package Interfejsy.Comparable.zad1;

import java.util.Arrays;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        Student s1= new Student("Ania",4.4,2002);
        Student s2= new Student("Basia",5.4,2002);
        Student s3= new Student("Emil",3.4,2002);
        Student s4= new Student("Witek",4.2,2002);
        Student s5= new Student("Kamil",4.5,2002);
        Student[] tab={s1,s2,s3,s4,s5};
        Arrays.sort(tab, Collections.reverseOrder());
        for(int i=0;i<5;i++){
            System.out.println(tab[i].toString());
        }
    }
}
