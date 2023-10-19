import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 7};
        System.out.println("Tablica: " + Arrays.toString(tab));
        System.out.println("Ilosc liczb nieparzystych: " + Wariant325(tab));
    }
    public static int Wariant325(int[] tab){
//        Sprawdza najpierw if czy tablica nie jest pusta
        if (tab.length == 0){
            return 0;
        }
        int ilenieparzystych=0;
        for(int i=0; i<tab.length; i++){
            if (tab[i]%2 != 0){
                ilenieparzystych++;
            }
        }
        return ilenieparzystych;
    }
}