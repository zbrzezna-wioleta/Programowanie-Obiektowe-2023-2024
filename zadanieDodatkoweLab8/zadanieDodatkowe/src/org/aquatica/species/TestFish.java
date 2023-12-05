package org.aquatica.species;

public class TestFish {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        Fish f2 = new Fish("Szczupak", 4, false);
        System.out.println(f1.finCount());
        System.out.println(f1.species());
        System.out.println(f2.canLiveInFreshWater());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f2.equals(f1));
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
    }
}
