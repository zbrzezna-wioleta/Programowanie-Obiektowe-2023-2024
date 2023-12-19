package InterfejsComparator.zad10;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int base = Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
        if (base!=0)
            return base;
        else {
            return o2.getName().compareTo(o1.getName());
        }
    }
}
