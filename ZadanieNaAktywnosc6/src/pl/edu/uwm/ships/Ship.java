package pl.edu.uwm.ships;

class Ship {
    private double tonnage;

    public Ship(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ship ship = (Ship) o;

        return Double.compare(ship.tonnage, tonnage) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(tonnage);
        return (int) (temp ^ (temp >>> 32));
    }
}
