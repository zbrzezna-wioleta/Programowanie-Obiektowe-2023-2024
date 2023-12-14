package interfejsy.comparable.zad7;

public class Car implements Comparable<Car>{
    private String brand;
    private int mileage;
    private int yearOfProduction;

    @Override
    public int compareTo(Car obj) {
        return Integer.compare(this.mileage, obj.mileage);
    }
}
