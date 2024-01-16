package moto;

class TestVehicle {
    public static void main(String[] args) {
        Vehicle v1 = Vehicle.createCar("audi","a4",2002);
        Vehicle v2 = new Vehicle().createVehicle("bmw","e34",2010);
    }
}
