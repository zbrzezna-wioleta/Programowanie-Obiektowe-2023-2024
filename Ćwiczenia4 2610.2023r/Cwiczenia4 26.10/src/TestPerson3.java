public class TestPerson3 {
    public static void main(String[] args) {
        Person3 person = new Person3();
        Person3 person2 = new Person3();
        person.name = "Wioleta";
        person2.name = "Anna";
        person.introduceYourself();
        person.changeName("Jakub");
        person.introduceYourself();
        person.sayHello(person2);
        person.swapNames(person2);
        person.introduceYourself();
        person2.introduceYourself();
    }
}
class Person3{
    String name;
    void introduceYourself(){
        System.out.println("Hi, I'm " + name);
    }
    void sayHello(Person3 otherPerson3){
        System.out.println("Hello " + otherPerson3.name);
    }
    void changeName(String newName){
        name=newName;
    }
    void swapNames(Person3 otherPerson4){
        String temp = this.name;
        this.name = otherPerson4.name;
        otherPerson4.name = temp;
    }
}