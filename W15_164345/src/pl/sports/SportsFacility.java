package pl.sports;

import java.util.Objects;

public class SportsFacility {
    private String name;
    private String location;
    private int capacity;

    public SportsFacility(String name, String location, int capacity){
        this.name = name;

        if (location == null || location == ""){
            this.location = "ul. Sportowa 10, 00-001 Warszawa";
        } else {
            this.location = location;
        }

        if (capacity < 0){
            this.capacity = 50;
        } else {
            this.capacity = capacity;
        }
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        if (location != null && location != ""){
            this.location = location;
        }
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
    }

    @Override
    public String toString() {
        String napis;
        if (name != null && name != ""){
            napis = getClass().getSimpleName() + ": Name: " + name + ". Location: " + location + ". Capacity:" + capacity + ".";
        } else {
            napis = getClass().getSimpleName() + ": " + "Location: " + location + ". Capacity:" + capacity + ".";
        }
        return napis;
    }

    @Override
    public boolean equals(Object o) {
        SportsFacility that = (SportsFacility) o;
        return location == that.location;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + capacity;
        return result;
    }

    public void expand(int arg){
        if (capacity + arg > 1000){
            capacity = 1000;
        } else {
            capacity += arg;
        }
    }
}
