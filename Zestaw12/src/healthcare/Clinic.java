package healthcare;

import java.util.Objects;

public class Clinic extends Hospital{
    private String specialization;
    private int doctors;

    public Clinic(String name, String address, int patients, String specialization, int doctors) {
        super(name, address, patients);
        this.specialization = ((specialization == null || specialization.isEmpty())?"ogólna":specialization);
        this.doctors = (doctors<0?20:doctors);
    }
    public String getSpecialization() {
        return(specialization == null || specialization.isEmpty()?"ogólna":this.specialization);
    }
    public void setSpecialization(String specialization) {
        this.specialization = (specialization == null || specialization.isEmpty()?"ogólna":this.specialization);
    }
    public int getDoctors() {
        return (doctors<0?20:doctors);
    }
    public void setDoctors(int doctors) {
        this.doctors = (doctors<0?20:doctors);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    /*
    public String toString() {
        return getClass().getSimpleName()+": " +
                "Name: " + super.getName() + '.' +
                " Address: " + super.getAddress() + '.' +
                " Number of patients: " + super.getPatients() +
                ". Specialization: "+this.specialization+". Number of doctors: "+this.doctors+
                '.';
     */
    @Override
    public void admitPatient(int x) {
        super.setPatients(super.getPatients()+x);
        if(super.getPatients()>500)
            super.setPatients(500);
        this.doctors+=20;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return doctors == clinic.doctors && Objects.equals(specialization, clinic.specialization);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result=result*31+specialization.hashCode();
        result=result*31+doctors;
        return result;
    }

}
