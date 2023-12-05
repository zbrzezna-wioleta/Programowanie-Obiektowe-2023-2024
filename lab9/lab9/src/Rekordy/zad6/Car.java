package Rekordy.zad6;

public record Car(String brand, String model, double fuelConsumptionPer100km) {
    public double fuelCost(double fuelPrice, double distance){
        double price;
        price = (distance*fuelPrice)/fuelConsumptionPer100km;
        return price;
    }
}
