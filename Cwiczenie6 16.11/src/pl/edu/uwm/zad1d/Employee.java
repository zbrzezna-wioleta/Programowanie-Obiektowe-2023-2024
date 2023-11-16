package pl.edu.uwm.zad1d;

public class Employee extends Person {
    public Employee(String firstName, String lastName) {
        this.lastName = lastName;
        setFirstName(firstName);
    }
}
