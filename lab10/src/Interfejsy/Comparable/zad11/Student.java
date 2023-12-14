package Interfejsy.Comparable.zad11;

public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfStudies;

    public Student(String name, double averageGrade, int yearOfStudies) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudies = yearOfStudies;
    }

    @Override
    public int compareTo(Student o) {
        int result = Double.compare(o.averageGrade,this.averageGrade);
        if (result != 0) {
            return result;
        }
        return Integer.compare(this.yearOfStudies, o.yearOfStudies);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfStudies=" + yearOfStudies +
                '}';
    }
}
