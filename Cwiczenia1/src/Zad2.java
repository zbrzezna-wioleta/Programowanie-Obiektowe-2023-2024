import java.util.Scanner;
public class Zad2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę, a sprawdzę czy jest ona parzysta:");
        int liczba = input.nextInt();
        if(liczba%2==0)
        {
            System.out.println("Podana przez ciebie liczba jest parzysta!");
        } else{
            System.out.println("Podana przez ciebie liczba jest nieparzysta!");
        }
    }
}