package Interfejsy.Comparable.zad1;

public class Student  implements  Comparable<Student>{
    private String name;
    private double averageGrade;
    private int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.averageGrade, o.averageGrade);
    }
}
