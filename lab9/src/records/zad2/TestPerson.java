package records.zad2;

public class TestPerson {
    public static void main(String[] args) {
        Address a1= new Address("malinowa",4,"11-003","Warszawa");
        Person p1= new Person("Adam","Kowalczyk",a1);
        System.out.println(p1);
    }
}
