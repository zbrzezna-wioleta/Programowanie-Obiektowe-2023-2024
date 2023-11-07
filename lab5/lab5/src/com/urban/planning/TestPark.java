package com.urban.planning;

public class TestPark {
    public static void main(String[] args) {
        Park park = new Park("Yellowstone", -5);
        System.out.println(park.getName());
        System.out.println(park.getArea());
        park.setName("Stoneyellow");
        System.out.println(park.getName());
        park.setArea(2);
        System.out.println(park.getArea());
        park.setArea(-2);
        System.out.println(park.getArea());
    }
}
