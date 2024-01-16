package algorithm;

public class TestDuplicatesFinder {
    public static void main(String[] args) {
        Integer[] tab1 = {1,2,3,2,5};
        Integer[] tab2 = {1,2,3,4,5};
        DuplicateFinder df = new DuplicateFinder();

        System.out.println(df.findDuplicates(tab1));
        System.out.println(df.findDuplicates(tab2));
    }
}
