import java.util.Random;

public class ZadE1 {
    public static void main(String[] args) {
        System.out.println(generateRandomInt());
    }

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}
