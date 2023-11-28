package pl.edu.uwm.wmii.commerce;

public class Store {
    private String name;
    private String address;
    private int employees;

    public Store(String name, String address, int employees) {
        this.name = (name == null || name.isEmpty()) ? "Centralny Sklep" : name;
        this.address = (address == null || address.isEmpty()) ? "ul. Handlowa 123, 00-001 Warszawa" : address;;
        this.employees = employees > 0 ? employees : 10;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployees() {
        return employees;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){

        }
        else
            this.name = name;

    }

    public void setAddress(String address) {
        if(address == null || address.isEmpty()){

        }
        else
            this.address = address;
    }

    public void setEmployees(int employees) {
        if(employees < 0){

        }
        else
            this.employees = employees;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ". Name: " + name  +
                ". Address: " + address  +
                ". Number of employees: " + employees+ ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        return employees == store.employees;
    }

    @Override
    public int hashCode() {
        return employees;
    }

    public void hireEmployees(int employees){
        this.employees = this.employees+employees > 50 ? 50 : this.employees+employees;
    }

    public static int checkCapacity(Store arg){
        return 50 - arg.employees;
    }
}
