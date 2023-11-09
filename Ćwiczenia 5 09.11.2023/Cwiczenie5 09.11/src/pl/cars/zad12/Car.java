package pl.cars.zad12;

class Car {
    private String brand;
    private String model;
    private int productionYear;
    private int mileage;
    private String color;
    public Car(String brand, String model, int productionYear, int mileage, String color){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }
}
