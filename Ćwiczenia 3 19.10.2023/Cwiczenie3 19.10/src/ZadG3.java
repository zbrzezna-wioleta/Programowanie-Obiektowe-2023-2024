import java.util.ArrayList;
public class ZadG3 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(-5);
        lista.add(12);
        lista.add(-11);
        int najmniejszaLiczba = minimumValue(lista);
        System.out.println("Najmniejsza liczba: " + najmniejszaLiczba);

    }
    public static int minimumValue (ArrayList<Integer> lista){
        int min = lista.get(0);
        for (int i = 0; i< lista.size(); i++){
            if (lista.get(i) < min){
                min = lista.get(i);
            }
        }
        return min;
    }
}
