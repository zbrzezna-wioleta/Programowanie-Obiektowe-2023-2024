package InterfejsComparator.zad15;

import java.util.Comparator;

public class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
    }
}
