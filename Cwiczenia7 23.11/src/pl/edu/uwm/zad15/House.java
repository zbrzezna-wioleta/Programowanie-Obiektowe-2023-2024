package pl.edu.uwm.zad15;

public class House extends Property{
    private int numberOfFloors;

    public House(String address, int size, double price, int numberOfFloors) {
        super(address, size, price);
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+", " + numberOfFloors+".";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        House house = (House) o;

        return numberOfFloors == house.numberOfFloors;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfFloors;
        return result;
    }
}
