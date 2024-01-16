package beveragedesign;

public class TestDrinkSet {
    public static void main(String[] args) {
        DrinkSet ds1 = new DrinkSet(null, -2.5);
        DrinkSet ds2 = new DrinkSet("Koktail", 1.0);

        Object dsc1 = ds1.clone();
        Object dsc2 = ds2.clone();

        ds1.setName("Jakis drink");
        ds2.setName("Jakis koktail");

        System.out.println("Obiekt 1:");
        System.out.println(ds1);

        System.out.println("Obiekt 1 klon:");
        System.out.println(dsc1);

        System.out.println("Obiekt 2:");
        System.out.println(ds2);

        System.out.println("Obiekt 2 klon");
        System.out.println(dsc2);
    }
}
