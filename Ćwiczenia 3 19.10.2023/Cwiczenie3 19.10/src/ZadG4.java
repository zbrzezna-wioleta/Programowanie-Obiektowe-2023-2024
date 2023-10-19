import java.util.ArrayList;
public class ZadG4 {
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
        double najmniejszaLiczba = minimumValue(lista);
        System.out.println("Najmniejsza liczba: " + najmniejszaLiczba);

    }
    public static double minimumValue (ArrayList<Double> lista){
        double min = lista.get(0);
        for (int i = 0; i< lista.size(); i++){
            if (lista.get(i) < min){
                min = lista.get(i);
            }
        }
        return min;
    }
}
