public class ZadF15 {
    public static void main(String[] args) {
        int tab[] = {4, 8, 5, -5, -9, 20, 0};
        System.out.println(reverseArray(tab));
    }
    public static int reverseArray(int[] tab)
    {
        int temp = tab[0];
        for (int i=tab.length-1; i>=0; i--) {
            temp = tab[i];
        }
        return temp;
    }
}
