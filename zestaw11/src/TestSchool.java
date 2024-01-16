import education.School;
import education.University;

public class TestSchool {
    public static void main(String[] args) {
        School sch1 = new School("Szkola","Wiejska 2",20);
        University u1 = new University("Szkola","Wiejska2",20,"rolniczy",2);
        School sch2 = new School("szkola2","Kwadratowa 4",-2100);
        School sch3 = new School("szkola2","Kwadratowa 4",-200);

        University u2= new University("uni1","eldo2",20,"rolniczy",2);
        University u3 = new University("uni2","esa4", 800,"politechnika",-4);


        System.out.println(sch2.toString());
        System.out.println(sch1.hashCode()+" "+sch2.hashCode());
        System.out.println(sch1.equals(sch2));
        sch3.recruitment(4000);
        System.out.println(sch3.getStudents());
        System.out.println(u1.hashCode()+" "+u2.hashCode());
        System.out.println(u1.equals(u2));
        u3.recruitment(43);
        System.out.println(u3.toString());
    }
}
