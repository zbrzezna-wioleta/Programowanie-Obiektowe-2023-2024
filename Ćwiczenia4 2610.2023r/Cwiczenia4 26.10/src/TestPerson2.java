import java.util.ArrayList;
public class TestPerson2 {
    public static void main(String[] args) {
        ArrayList<Person> osoby = new ArrayList<>();
        osoby.add(null);
        System.out.println(osoby.get(0).name);
    }
}
class Person2{
    public String name;

}