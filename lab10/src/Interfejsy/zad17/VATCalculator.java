package Interfejsy.zad17;

public interface VATCalculator {
    double vatRate = 0.23;
    public static double calculateWithVAT(double price){
        return  price*(1+vatRate);
    }
}
