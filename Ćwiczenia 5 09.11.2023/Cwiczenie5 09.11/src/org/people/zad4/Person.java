package org.people.zad4;

class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName){
        this(firstName, lastName,0);
    }
}
