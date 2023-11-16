package pl.edu.uwm.zad1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName,String lastName, int age){
        this.firstName = (firstName == null || firstName == "") ? "" : firstName;
        this.lastName = (lastName == null || lastName == "") ? "" : lastName;
        this.age = (age < 0) ? 0 : age;
    }

    @Override
    public String toString(){
        return "Person: "+ firstName + " " +  lastName + ", Age: " + age + ".";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }
    @Override
    public int hashCode(){
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }
}
