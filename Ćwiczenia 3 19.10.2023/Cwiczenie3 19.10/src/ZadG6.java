import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ZadG6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0; i<=10; i++){
            lista.add(i);
        }
        System.out.println(lista);
        ArrayList<Integer> odwrocona = reverseArray(lista);
        System.out.println(odwrocona);


    }
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> lista){
        ArrayList<Integer> odwroconaLista = new ArrayList<>(lista);
        Collections.reverse(odwroconaLista);
        return odwroconaLista;
    }
}
