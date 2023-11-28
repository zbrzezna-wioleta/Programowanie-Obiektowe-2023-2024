import pl.edu.uwm.wmii.commerce.Bookstore;
import pl.edu.uwm.wmii.commerce.Store;

public class TestStore {
    public static void main(String[] args) {
        Store s1 = new Store("Lidl","ul. pudga gg", 5);
        Store s2 = new Store("",null, -2);
        Store s3 = new Store("Lidl+","ul. pudga ggwp", 5);
        System.out.println(s1.getAddress());
        System.out.println(s1.getName());
        System.out.println(s1.getEmployees());
        System.out.println(s2.getAddress());
        System.out.println(s2.getName());
        System.out.println(s2.getEmployees());
        System.out.println(s1.toString());
        System.out.println(s1.equals(s3));
        s1.hireEmployees(56);
        System.out.println(s1.getEmployees());
        System.out.println(Store.checkCapacity(s1));

        Bookstore bs1 = new Bookstore("Lidl","ul. pudga gg", 5, "cosinus", 19);
        Bookstore bs2 = new Bookstore("",null, -2, null, -45);
        Bookstore bs3 = new Bookstore("Lidl+","ul. pudga gglow", 5, "cosinus", 59);
        System.out.println(bs1.getAddress());
        System.out.println(bs1.getName());
        System.out.println(bs1.getEmployees());
        System.out.println(bs1.getGenre());
        System.out.println(bs1.getBooksInStock());
        System.out.println(bs2.getAddress());
        System.out.println(bs2.getName());
        System.out.println(bs2.getEmployees());
        System.out.println(bs2.getGenre());
        System.out.println(bs2.getBooksInStock());
        System.out.println(bs1.toString());
        System.out.println(bs1.equals(bs3));
        bs1.hireEmployees(77);
        System.out.println(bs1.getEmployees());
        System.out.println(Bookstore.checkCapacity(bs1));


    }
}
