import healtcare.Clinic;
import healtcare.Hospital;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("aaa", "Oln", 980.00);
        Hospital h2 = new Hospital(new String("aaa"), "Oln", 980.00);
        Hospital h3 = new Hospital("bbb", "Wwa", -40);
        Hospital h4=new Hospital("ccc","Pzn",400.0);
        System.out.println(h1.equals(h1)); //true
        System.out.println(h1.hashCode()+" "+h2.hashCode());
        System.out.println(h1.equals(h2)); //true
        System.out.println(h3.equals(h2)); //false

        Clinic c1=new Clinic("ccc","Pzn",400.0,"inf",6.0);
        Clinic c2 = null;
        Clinic c3=new Clinic("ccc","Pzn",400.0,"inf",6.0);
        System.out.println(c1.toString());
        System.out.println(c1.equals(h4)); //false
        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.hashCode()+" "+c3.hashCode());
        System.out.println(c1.equals(c3)); //false

    }
}
