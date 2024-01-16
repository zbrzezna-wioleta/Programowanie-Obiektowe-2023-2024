package electronics;

class Appliance {
    private String brand;
    private String model;
    private double powerUsage;

    private Appliance(String brand, String model, double powerUsage) {
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
    }

    public static Appliance createFridge(String brand, String model, double powerUsage)
    {
        return new Appliance(brand,model,powerUsage);
    }
    public Appliance createAppliance(String brand, String model, double powerUsage) {
        return new Appliance(brand,model,powerUsage);
    }
}
