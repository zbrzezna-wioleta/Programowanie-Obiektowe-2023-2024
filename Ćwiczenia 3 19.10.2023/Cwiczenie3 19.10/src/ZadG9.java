import java.util.ArrayList;

public class ZadG9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(7);
        lista.add(1);
        lista.add(2);
        lista.add(6);
        lista.add(3);
        lista.add(19);
        lista.add(4);
        int sumaNieparzystych = oddElementsSum(lista);
        System.out.print(lista);
        System.out.println(" Suma nieparzystych: " + sumaNieparzystych);
    }
    public static int oddElementsSum(ArrayList<Integer> lista){
        int suma=0;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i) % 2 != 0){
                suma+=lista.get(i);
            }
        }
        return suma;
    }
}
