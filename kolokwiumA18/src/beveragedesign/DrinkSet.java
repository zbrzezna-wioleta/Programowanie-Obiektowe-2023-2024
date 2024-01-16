package beveragedesign;

public class DrinkSet implements Cloneable{
    private String name;
    private double volume;

    public DrinkSet(String name, double volume){
        if(name == null){
            this.name = "";
        } else {
            this.name = name;
        }
        if(volume <= 0){
            this.volume = 1.0;
        } else {
            this.volume = volume;
        }
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "DrinkSet{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
