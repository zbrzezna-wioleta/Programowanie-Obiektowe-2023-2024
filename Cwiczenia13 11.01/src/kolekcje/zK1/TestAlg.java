package kolekcje.zK1;

import java.util.HashMap;

public class TestAlg {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Av", 5.6);
        map.put("t", 1.3);
        map.put("AA", 1.5);
        map.put("kk", 5.6);
        map.put("345626", 5.6);
        System.out.println(map);
        Alg a1 = new Alg();
        HashMap<Double, Integer> result = a1.countValueOccurrences(map);
        System.out.println(result);
    }
}
