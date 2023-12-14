package zlozonePolaWKlasie.zad8;

import java.util.Objects;

public class Processor {
    private double frequency;
    private int cores;
    private String manufacturer;

    public Processor(double frequency, int cores, String manufacturer) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Processor processor = (Processor) o;

        if (Double.compare(frequency, processor.frequency) != 0) return false;
        if (cores != processor.cores) return false;
        return Objects.equals(manufacturer, processor.manufacturer);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(frequency);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + cores;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }
}
