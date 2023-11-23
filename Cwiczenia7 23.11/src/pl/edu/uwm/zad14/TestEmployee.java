package pl.edu.uwm.zad14;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Nowak", 4000);
        Employee employee2 = new Employee("Jan", "Nowak", 4000);
        Employee employee3 = null;
        Employee employee4 = new Employee(null, "Nowak", 4000);
        Employee employee5 = new Employee(new String("Jan"), "Nowak", 4000);
        System.out.println(employee1);
        System.out.println(employee1.equals(employee1));
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee3));
        System.out.println(employee1.equals(employee4));
        System.out.println(employee1.equals(employee5));
        Programmer programmer1 = new Programmer("Jan", "Nowak", 4000, "java");
        Tester tester1 = new Tester("Jan", "Nowak", 4000, "logiczny");
        System.out.println(programmer1);
        System.out.println(tester1);
        System.out.println(employee1.hashCode() == employee5.hashCode());
    }
}
