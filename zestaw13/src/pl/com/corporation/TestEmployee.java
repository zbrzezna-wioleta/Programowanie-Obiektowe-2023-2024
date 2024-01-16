package pl.com.corporation;

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Adam",3000);
        Employee e2 = new Employee("Adam",3000);
        Employee e3 = new Employee("Adam",3000);
        Employee e4 = new Employee("Adam",3000);
        Employee e5 = new Employee("Adam",3000);
        Employee e6 = null;
        System.out.println(Employee.getTotalEmployeeCount()); //5
    }
}
