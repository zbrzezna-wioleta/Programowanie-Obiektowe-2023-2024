package records.zad6;

public record Car(String brand,String model,int fuelConsumptionPer100km) {
    public double fuelCost(double fuelPrice, double distance){

        return fuelPrice*fuelConsumptionPer100km *distance/100;
    }
}
