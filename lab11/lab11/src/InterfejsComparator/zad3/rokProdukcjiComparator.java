package InterfejsComparator.zad3;

import java.util.Comparator;

public class rokProdukcjiComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getRokProdukcji(), o2.getRokProdukcji());
    }
}
