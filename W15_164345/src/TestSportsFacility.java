import pl.sports.SportsFacility;
import pl.sports.Stadium;


public class TestSportsFacility {
    public static void main(String[] args) {
        SportsFacility s1 = new SportsFacility("s1", "l1", 5);
        SportsFacility s2 = new SportsFacility("s1", "l1", 5);

        Stadium st1 = new Stadium("st1", "l1", 500, "trawiasta", -8);
        Stadium st2 = new Stadium("st1", "l1", 500, "trawiasta", 1);

        System.out.println(s1.equals(s2));

        System.out.println(st1.hashCode() == st2.hashCode());

        System.out.println(s1.hashCode() == s2.hashCode());

        System.out.println(st2.equals(st1));

        st1.setName("Stadion Narodowy");
        System.out.println(s1);
        st2.setCapacity(15);
        st1.setLocation("Warszawa");

        System.out.println(st1.equals(st2));

        System.out.println(st1.hashCode() == st2.hashCode());

        s1.expand(123);
        s2.expand(123);

        System.out.println(s1.equals(s2));

        System.out.println(s1);
        s1.expand(999);
        System.out.println(s1);
        st1.expand(1200);
        System.out.println(st1);
        st1.setName("");
        System.out.println(st1);
    }
}
