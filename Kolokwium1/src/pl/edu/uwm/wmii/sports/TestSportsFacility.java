package pl.edu.uwm.wmii.sports;

public class TestSportsFacility {
    public static void main(String[] args) {
        SportsFacility sf = SportsFacility.createStadium("Gym", "In true gym place", 69);
        SportsFacility sf2 = sf.createFacility("Basen", "In true basen place", 99);
    }
}
