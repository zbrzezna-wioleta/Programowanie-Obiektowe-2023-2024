package info.people.zad13;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", 21, "Olsztyn, Słoneczna 54");
        System.out.println(person.introduceYourself());
    }
}
