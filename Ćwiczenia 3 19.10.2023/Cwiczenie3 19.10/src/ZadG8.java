import java.util.ArrayList;

public class ZadG8 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(0);
        lista.add(3);
        lista.add(0);
        lista.add(4);
        int iloscZer = countZeros(lista);
        System.out.print(lista);
        System.out.println(" Ilosc zer: " + iloscZer);

    }
    public static int countZeros(ArrayList<Integer> lista){
        int ile=0;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i) == 0){
                ile++;
            }
        }
        return ile;
    }
}
