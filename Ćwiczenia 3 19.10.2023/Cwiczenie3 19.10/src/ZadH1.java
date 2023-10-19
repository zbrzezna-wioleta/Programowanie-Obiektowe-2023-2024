public class ZadH1 {
    public static void main(String[] args) {
        System.out.println(reverse("Olsztyn"));
        System.out.println(reverse(""));
        System.out.println(reverse(null));
    }
    public static String reverse(String arg){
        if ( arg == null){
            return null;
        }
        StringBuilder temp = new StringBuilder(arg);
        temp.reverse();
        return temp.toString();
    }
}
