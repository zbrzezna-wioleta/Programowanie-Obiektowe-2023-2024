package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1=new Hospital("aa","Wojak 111",40);
        Hospital h2=new Hospital("bb","Pepsi 222",890);
        Clinic c1 = new Clinic("aa","Cola 111",40, "specka1",400);
        Clinic c2 = new Clinic("cc","Rogal 333",940, "specka2",-40);

        System.out.println(h1.equals(c1));
        System.out.println(c2.getDoctors());
        c2.admitPatient(30);
        System.out.println(c2.getPatients());
        Clinic.checkCapacity(c2);
        System.out.println(h1.hashCode());
        System.out.println(h2.getAddress());
        System.out.println(h2.getAddress());
        System.out.println(c2.hashCode());
        System.out.println(c2.getSpecialization());
        System.out.println(c2.toString());
        System.out.println(h2.toString());
    }
}
