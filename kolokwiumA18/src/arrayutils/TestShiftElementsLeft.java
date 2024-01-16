package arrayutils;

public class TestShiftElementsLeft {
    public static void main(String[] args) {
        //Integer[] tab = {1, 2, 3, 4, 5, 6};
        Book[] tab = new Book[4];
        tab[0] = new Book("Title1", "Author1", 1997);
        tab[1] = new Book("Title2", "Author2", 2007);
        tab[2] = new Book("Title3", "Author3", 1971);
        tab[3] = new Book("Title4", "Author4", 2024);

        System.out.println("Before:");
        for(var el:tab){
            System.out.println(el);
        }

        ElemLeft.shiftElementsLeft(tab);

        System.out.println("\nAfter:");
        for(var el:tab){
            System.out.println(el);
        }
    }
}
