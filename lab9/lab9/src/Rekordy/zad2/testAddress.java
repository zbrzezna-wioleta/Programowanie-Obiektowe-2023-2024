package Rekordy.zad2;

public class testAddress {
    public static void main(String[] args) {
        Address a1 = new Address("Słoneczna", 54, "10-710", "Olsztyn");
        Person p1 = new Person("Jan", "Kowalski", a1);
        Person p2 = new Person("Jan", "Kowalski", new Address("Słoneczna", 54, "10-710", "Olsztyn"));
        System.out.println(a1);
        System.out.println(p1);
    }
}
