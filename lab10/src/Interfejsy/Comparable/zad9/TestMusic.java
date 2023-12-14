package Interfejsy.Comparable.zad9;

import java.util.Arrays;
import java.util.Collections;

public class TestMusic {
    public static void main(String[] args) {
        Music m1= new Music ("laviwa","lala",290);
        Music m2= new Music ("laviwa","lala",1002);
        Music m3= new Music ("laviwa","lala",1503);
        Music m4= new Music ("laviwa","lala",1234);
        Music []tab ={m1,m2,m3,m4};
        Arrays.sort(tab, Collections.reverseOrder());
        for(int i=0;i<4;i++){
            System.out.println(tab[i].toString());
        }
    }
}
