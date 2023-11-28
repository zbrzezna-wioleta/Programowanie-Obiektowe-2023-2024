package pl.sports;

import java.util.Objects;

public class Stadium extends SportsFacility{
    private String surfaceType;
    private int sportsTypes;

    public Stadium(String name, String location, int capacity, String surfaceType, int sportsTypes){
        super(name, location, capacity);
        if (surfaceType != ""){
            this.surfaceType = surfaceType;
        } else {
            this.surfaceType = "trawiasta";
        }
        if (sportsTypes >= 0) {
            this.sportsTypes = sportsTypes;
        } else {
            this.sportsTypes = 1;
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    public String getSurfaceType() {
        return surfaceType;
    }

    public int getSportsTypes() {
        return sportsTypes;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public void setCapacity(int capacity) {
        super.setCapacity(capacity);
    }

    public void setSurfaceType(String surfaceType) {
        if (surfaceType != ""){
            this.surfaceType = surfaceType;
        }
    }

    public void setSportsTypes(int sportsTypes) {
        if (sportsTypes >= 0) {
            this.sportsTypes = sportsTypes;
        }
    }

    @Override
    public String toString() {
        String napis;
        if (this.getName() != "" && this.getName() != null) {
            napis = getClass().getSimpleName() + ": Name: " + this.getName() + ". Location: " + this.getLocation() + ". Capacity: " + this.getCapacity() + "\nSurface Type: " + this.surfaceType + ". Number of sports: " + this.sportsTypes + ".";
        } else {
            napis = getClass().getSimpleName() + ": Location: " + this.getLocation() + ". Capacity: " + this.getCapacity() + "\nSurface Type: " + this.surfaceType + ". Number of sports: " + this.sportsTypes + ".";
        }
        return napis;
    }

    @Override
    public void expand(int arg) {
        if (getCapacity() + arg > 1500){
            setCapacity(1500);
        } else {
            setCapacity(getCapacity() + arg);
        }
        this.sportsTypes += 5;
    }

    @Override
    public boolean equals(Object o) {
        Stadium stadium = (Stadium) o;

        return this.getLocation() == stadium.getLocation() && this.sportsTypes == stadium.sportsTypes;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (surfaceType != null ? surfaceType.hashCode() : 0);
        result = 31 * result + sportsTypes;
        return result;
    }
}
