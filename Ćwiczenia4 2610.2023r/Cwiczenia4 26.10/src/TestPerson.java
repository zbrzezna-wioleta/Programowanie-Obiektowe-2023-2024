public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Wioleta";
        Person person2 = person1;
        person1.name = "Anna";
        System.out.println(person1.name);
        System.out.println(person2.name);


    }
}
class  Person{
    String name;

}