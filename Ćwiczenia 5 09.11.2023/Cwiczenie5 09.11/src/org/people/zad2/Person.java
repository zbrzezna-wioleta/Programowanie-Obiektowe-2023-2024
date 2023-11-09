package org.people.zad2;

class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName){
        firstName=firstName; // nie można tak musi byc this Zmienna „firstName” jest przypisana sama do siebie
        this.lastName=lastName;
    }
}
