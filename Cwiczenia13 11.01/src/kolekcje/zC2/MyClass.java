package kolekcje.zC2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(12);
        list.add(14);
        List<Integer> wynik = removeDuplicates(list);
        System.out.println(wynik);
    }
    public static <T> List<T> removeDuplicates(ArrayList<T> lista){
        Set<T> zbior = new HashSet<>();
        List<T> wynikLista = new ArrayList<>();
        for (T elem : lista){
            if (zbior.add(elem)){
                wynikLista.add(elem);
            }
        }
        return wynikLista;
     }
}
