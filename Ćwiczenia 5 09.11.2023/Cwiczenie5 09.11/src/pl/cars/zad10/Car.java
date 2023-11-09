package pl.cars.zad10;

class Car {
    String brand;
    String model;
    int price;
    {
        price = 50000;
    }
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        price = 700;
    }

    public int getPrice() {
        return price;
    }
}
