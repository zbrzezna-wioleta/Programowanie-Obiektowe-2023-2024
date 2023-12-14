package interfejsy.zad4;

public class CurrencyConverter implements Converter{
    @Override
    public double convertToEuro(double amount) {
        if (amount < 0 )
            return 0;
        return 3.2;
    }

    @Override
    public double convertToUSD(double amount) {
        return 0;
    }

    @Override
    public double getConversionRate(String currency) {
        if (currency == null)
            return 0;
        return 4.5;
    }
}
