package Interfejsy.zad10;

public class VehicleManagerTest {
    public static void main(String[] args) {
        Car c1= new Car();
        Motorcycle m1= new Motorcycle();
        System.out.println(c1.startEngine());
        System.out.println(m1.startEngine());
        System.out.println(m1.getFuelLevel());
        System.out.println(c1.getFuelLevel());
    }
}
