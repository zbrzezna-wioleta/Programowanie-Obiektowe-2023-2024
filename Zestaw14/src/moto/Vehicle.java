package moto;

class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(){
    }
    public Vehicle(String brand, String model, int year) {
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    static Vehicle createCar(String brand, String model, int year)
    {
        return new Vehicle(brand,model,year);
    }
    public Vehicle createVehicle(String brand, String model, int year)
    {
        return new Vehicle(brand,model,year);
    }
}
