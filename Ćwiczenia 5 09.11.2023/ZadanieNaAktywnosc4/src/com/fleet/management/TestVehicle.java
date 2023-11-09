package com.fleet.management;

class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(60.0);
        Vehicle vehicle2 = new Vehicle(158.0);
        System.out.println(vehicle1.getFuelCapacity());
        System.out.println(vehicle2.getFuelCapacity());
    }
}
