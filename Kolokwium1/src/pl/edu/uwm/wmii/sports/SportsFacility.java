package pl.edu.uwm.wmii.sports;

public class SportsFacility {
    private String type;
    private String location;
    private int capacity;

    private SportsFacility(String type, String location, int capacity) {
        this.capacity = capacity;
        this.location = location;
        this.type = type;
    }

    public static SportsFacility createStadium(String type, String location, int capacity){
        return new SportsFacility(type,location, capacity);
    }

    public SportsFacility createFacility(String type, String location, int capacity){
        return new SportsFacility(type,location, capacity);
    }
}
