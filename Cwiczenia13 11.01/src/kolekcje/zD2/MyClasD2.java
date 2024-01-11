//package kolekcje.zD2;
//
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//
//public class MyClasD2 {
//    public <T> List<T> findCommonElements(LinkedList<T> list1, LinkedList<T> list2){
//        HashSet<T> zbior1 = new HashSet<>(list1);
//        List<T> wynik = new LinkedList<>();
//        for(T elem : list2){
//            if (zbior1.contains(elem) && !wynik.contains(elem)){
//                wynik.add(elem);
//            }
//        }
//        return wynik;
//    }
//}
