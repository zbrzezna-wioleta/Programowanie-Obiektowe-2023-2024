package com.fleet.management;

class Vehicle {
    private double fuelCapacity;
    public Vehicle(double fuelCapacity){

        this.fuelCapacity = fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        if (fuelCapacity < 5.0 || fuelCapacity > 150.0){
            this.fuelCapacity = 5.0;
        } else {
            this.fuelCapacity = fuelCapacity;
        }
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }


}
