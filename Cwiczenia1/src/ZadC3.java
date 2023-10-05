public class ZadC3 {
    public static void main(String[] args)
    {
        int prev =0; //poprzednik
        int curr =1; //nastepnik
        System.out.println(prev);
        System.out.println(curr);
        for( int i=1; i<8; i++)
        {
            curr = prev+(prev=curr);
            System.out.println(curr);
        }
    }
}
