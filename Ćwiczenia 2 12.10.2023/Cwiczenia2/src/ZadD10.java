public class ZadD10 {
    public static void main(String[] args) {
        System.out.println(foo(111));

    }

    public static int foo(int n)
    {
        while (n > 0){
            int jednosci = n%10;
            if (jednosci != 1){
                return 0;
            }
            n /= 10;
        }
    return 1;
    }
}
