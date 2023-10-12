import java.util.Random;

public class ZadF10 {
    public static void main(String[] args) {
        int tab2[] = new int[30];
        Random random = new Random();
        for(int i=0;i<tab2.length;i++)
        {
            tab2[i] = random.nextInt(100);
//            System.out.println(tab2[]);
        }
        for(int i=tab2.length-1;i>=0;i--)
        {
            System.out.println(tab2[i]);
        }
    }
}
