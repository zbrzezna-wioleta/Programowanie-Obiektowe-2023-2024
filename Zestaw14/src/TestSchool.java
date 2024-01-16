import education.School;
import education.University;

public class TestSchool {
    public static void main(String[] args) {
        School sch1 = new School("","",-300);
        School sch2 = new School(null,"a",-300);
        University u1 = new University("bbb","ass",490,"rolniczy",20);
        University u2 = new University("bbb","assn",490,"rolniczy",20);

        System.out.println(sch1.hashCode()+" "+sch2.hashCode());
        System.out.println(sch1.equals(sch2));


        System.out.println(u1.hashCode()+" "+u2.hashCode());
        System.out.println(u1.equals(u2));


    }
}
