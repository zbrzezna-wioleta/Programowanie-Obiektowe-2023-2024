package education;

import java.util.Objects;

public class School {
    private String name;
    private String address;
    private int students;

    public School(String name, String address, int students) {
        this.name = (name==null||name.isEmpty())?"Wydział Matematyki i Informatyki UWM":name;
        this.address = (address==null||address.isEmpty())?"ul. Słoneczna 54, 10-710 Olsztyn":address;
        this.students = students<0?100:students;
    }
    public String getName() {
        return (name==null||name.isEmpty())?"Wydział Matematyki i Informatyki UWM":name;
    }
    public void setName(String name) {
        if(!(name==null||name.isEmpty()))
            this.name=name;
    }
    public String getAddress() {
        return (address==null||address.isEmpty())?"ul. Słoneczna 54, 10-710 Olsztyn":address;
    }
    public void setAddress(String address) {
        if(!(address==null||address.isEmpty()))
            this.address=address;
    }
    public int getStudents() {
        return students<0?100:students;
    }
    public void setStudents(int students) {
        if(!(students>100))
            this.students=students;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": Name: " + name + ". " +
                "Address: " + address + ". " +
                "Number of students: " + students +
                ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(address, school.address);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(address);
    }


    public void recruitment(int x)
    {
        this.students=+x;
        this.students=(this.students>500?500:students);
    }
    static void checkLimit(School sch)
    {
        System.out.println("obecnie: "+sch.students+", ile zostalo: "+(1000-sch.students));
    }
}
