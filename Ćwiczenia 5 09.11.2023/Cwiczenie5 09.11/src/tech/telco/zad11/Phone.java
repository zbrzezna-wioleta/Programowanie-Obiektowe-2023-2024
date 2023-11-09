package tech.telco.zad11;

class Phone {
    String manufacturer;
    String model;
    String operatingSystem;
    {
        operatingSystem = "Android";
    }
    public Phone(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        setOperatingSystem("iOS");
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
