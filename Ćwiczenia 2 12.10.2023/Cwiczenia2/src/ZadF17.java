public class ZadF17 {
    public static void main(String[] args) {
        int tab[] = {5, 4, 0, -8, 0};
        System.out.println("Liczba zer w tablicy: " + countZeros(tab));

    }
    public static int countZeros(int[] tab)
    {
        int ile=0;
        for (int i=1; i<tab.length; i++){
            if (tab[i] == 0 )
            {
                ile++;
            }
        }
        return ile;
    }
}
