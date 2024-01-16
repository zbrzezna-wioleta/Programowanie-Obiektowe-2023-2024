package healtcare;

import java.util.Objects;

public class Clinic extends Hospital{
    private String specialization;
    private double rating;

    public Clinic(String name, String location, double capacity, String specialization, double rating) {
        super(name, location, capacity);
        this.specialization = (specialization==null||specialization.isEmpty())?"ogolna":specialization;
        this.rating = (rating<0.0 & rating>5.0)?3.0:rating;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if(specialization!=null||!specialization.isEmpty())
            this.specialization=specialization;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating>=0.0 & rating <=5.0)
            this.rating=rating;
    }

    @Override
    void expand(double x) {
        setCapacity(getCapacity()+x);
        if(getCapacity()>500.0)
            setCapacity(500);
        this.rating+=0.5;
        if(this.rating>5.0)
            this.rating=5.0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Specialization: " +
                specialization + ". Rating: " + rating +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return Double.compare(rating, clinic.rating) == 0
                && Objects.equals(specialization, clinic.specialization);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31* result + Double.valueOf(rating).hashCode();
        return result;
    }
}

