import java.util.ArrayList;

public class ZadG2 {
    public static void main(String[] args) {
        ArrayList<Double> lt = new ArrayList<>();
        lt.add(0.7);
        lt.add(-0.003);
        lt.add(0.4);
        lt.add(0.5347);
        lt.add(1.3457);
        lt.add(2.357);
        lt.add(0.0423);
        lt.add(-0.432);
        lt.add(7.7);
        lt.add(-2.0437);
        double suma=0.0;
        for (int i=0; i< lt.size(); i++){
            System.out.println(lt.get(i));
            suma+=lt.get(i);
        }
        System.out.println("Suma: " + suma);
    }
}
