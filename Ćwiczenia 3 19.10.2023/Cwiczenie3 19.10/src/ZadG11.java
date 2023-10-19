import java.util.ArrayList;

public class ZadG11 {
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
        ArrayList<Integer> odwroconaLista = new ArrayList<>(lista.size());
        for (int i=lista.size()-1; i>=0; i--){
            odwroconaLista.add(lista.get(i));
        }
        return odwroconaLista;
    }
}
