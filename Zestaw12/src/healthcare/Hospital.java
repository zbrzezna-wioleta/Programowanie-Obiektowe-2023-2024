package healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private String address;
    private int patients;

    public Hospital(String name, String address, int patients) {
        this.name=(name.isEmpty()||name==null)?"Centralny Szpital Kliniczny":name;
        this.address = (address.isEmpty() || address==null)?"ul. Zdrowia 100, 00-001 Warszawa":address;
        this.patients=(patients<0?200:patients);
    }

    public String getName() {
        return (name.isEmpty()|| name==null)?"Centralny Szpital Kliniczny":name;
    }

    public void setName(String name) {
        this.name = (name.isEmpty()|| name==null)?"Centralny Szpital Kliniczny":name;
    }

    public String getAddress() {
        return (address.isEmpty() || address==null)?"ul. Zdrowia 100, 00-001 Warszawa":address;
    }

    public void setAddress(String address) {
        this.address=(address==null||address.isEmpty())?"ul. Zdrowia 100, 00-001 Warszawa":address;
    }

    public int getPatients() {
        return(patients < 0?200:patients);
    }
    public void setPatients(int patients) {
        this.patients = patients < 0?200:patients;
    }
    public void admitPatient(int x)
    {
        this.patients+=x;
        if(this.patients>1000)
            this.patients=1000;
    }
    static void checkCapacity(Hospital h)
    {
        System.out.println("Aktualna ilosc pacjentow: "+h.patients
                +". Do limitu zostalo: "+(1000-h.patients));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": Name: " + name + '.' +
                " Address: " + address + '.' +
                " Number of patients: " + patients +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return patients == hospital.patients && Objects.equals(name, hospital.name) && Objects.equals(address, hospital.address);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result=31*result+address.hashCode();
        result=31*result+ patients;
        return result;
    }
}



