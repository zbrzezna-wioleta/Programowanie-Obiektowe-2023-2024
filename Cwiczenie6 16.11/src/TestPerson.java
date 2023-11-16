import pl.edu.uwm.zad1.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Wioleta", "Zbrzezna", 21);
        Person person2 = new Person("Wioleta", "Zbrzezna", 21);
        System.out.println(person1);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());
    }
}
