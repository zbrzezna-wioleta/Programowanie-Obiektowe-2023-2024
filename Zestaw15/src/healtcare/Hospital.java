package healtcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private String location;
    private double capacity;

    public Hospital(String name, String location, double capacity) {
        this.name = name;
        this.location = (location==null||location.isEmpty())?"ul. Zdrowia 123, 00-999 Warszawa":location;
        this.capacity = (capacity<0?50.0:capacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location!=null&&!location.isEmpty())
            this.location=location;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity>0)
            this.capacity=capacity;
    }

    @Override
    public String toString() {
        if(name==null||name.isEmpty())
            return getClass().getName() + ": Location: "
                    + location + ".  Capacity: " + capacity + '.';

        return getClass().getName() + ": Name: " + name + ". Location: "
                + location + ".  Capacity: " + capacity + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        if(!Objects.equals(name, hospital.name)) return false;
        if(!Objects.equals(location, hospital.location)) return false;
        return Double.compare(capacity, hospital.capacity)==0;
    }

    @Override
    public int hashCode() {                 //name moze byc nullem
        int result=name == null? 0 :name.hashCode();
        result=31*result+location.hashCode();
        return 31 * result+Double.valueOf(capacity).hashCode();
    }
    void expand(double x)
    {
        this.capacity=this.capacity+x;
        if(this.capacity>1000.0)
            this.capacity=1000.0;
    }
}
