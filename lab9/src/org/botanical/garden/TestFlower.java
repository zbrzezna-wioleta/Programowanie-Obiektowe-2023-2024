package org.botanical.garden;

public class TestFlower {
    public static void main(String[] args) {
        Flower f1= new Flower("mak","czerwony",false);
        Flower f2= new Flower("mak","czerwony",false);
        Flower f3= new Flower(null,"czerwony",false);
        System.out.println(f1);
        System.out.println(f3);
        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f3));
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
        System.out.println(f3.hashCode());
        System.out.println(f1.species());
    }
}
