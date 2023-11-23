package pl.edu.uwm.ships;

class TestShip {
    public static void main(String[] args) {
        Ship ship1 = new Ship(325.89);
        Ship ship2 = null;
        Ship ship3 = new Ship(327.5644);
        Ship ship4 = new Ship(325.89);
        System.out.println(ship1.equals(ship1));
        System.out.println(ship1.equals(ship2));
        System.out.println(ship1.equals(ship3));
        System.out.println(ship1.equals(ship4));
        System.out.println(ship1.hashCode() == ship3.hashCode());
        System.out.println(ship1.hashCode() == ship4.hashCode());


    }
}
