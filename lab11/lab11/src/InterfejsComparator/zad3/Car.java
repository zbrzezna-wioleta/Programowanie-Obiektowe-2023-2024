package InterfejsComparator.zad3;

public class Car {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Car(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka +
                ", rokProdukcji=" + rokProdukcji +
                ", cena=" + cena;
    }
}
