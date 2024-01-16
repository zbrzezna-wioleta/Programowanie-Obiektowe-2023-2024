package arrayutils;

public class ElemLeft {
    public static <T> void shiftElementsLeft(T[] tab){
        if(tab.length != 0){
            T temp = tab[0];
            for(int i=0; i<=tab.length-2; i++){
                tab[i] = tab[i+1];
            }
            tab[tab.length - 1] = temp;
        }
    }
}
