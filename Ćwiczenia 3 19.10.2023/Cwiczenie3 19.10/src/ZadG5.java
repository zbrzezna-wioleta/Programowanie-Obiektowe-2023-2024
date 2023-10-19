import java.util.ArrayList;

public class ZadG5 {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(0.7);
        lista.add(-0.003);
        lista.add(0.4);
        lista.add(0.5347);
        lista.add(1.3457);
        lista.add(2.357);
        lista.add(0.0423);
        lista.add(-0.432);
        lista.add(7.7);
        lista.add(-2.0437);
        double srednia = average(lista);
        System.out.println("Średnia arytmetyczna: " + srednia);

    }
    public static double average (ArrayList<Double> lista){
        double suma=0.0;
        for(int i=0; i< lista.size(); i++){
            suma+=lista.get(i);
        }
        return suma/ lista.size();
    }
}
