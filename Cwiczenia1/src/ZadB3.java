import java.util.Scanner;

public class ZadB3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę (od 1 do 7), a powiem jaki to dzień tygodnia:");
        int liczba = input.nextInt();
        if (liczba > 1 && liczba<7)
        {
            if (liczba == 1)
            {
                System.out.println("Poniedziałek");
            } else if (liczba == 2)
            {
                System.out.println("Wtorek");
            } else if (liczba == 3)
            {
                System.out.println("Środa");
            } else if (liczba == 2)
            {
            }
        }
        else
        {
            System.out.println("Podana liczba nie jest z przedziału od 1 do 7");
        }
    }
}

