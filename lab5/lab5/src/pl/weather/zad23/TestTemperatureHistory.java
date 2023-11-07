package pl.weather.zad23;

import java.util.ArrayList;

public class TestTemperatureHistory {
    public static void main(String[] args) {
        ArrayList<Double> temp = new ArrayList<>();
        temp.add(1.0);
        temp.add(15.0);
        temp.add(23.0);
        temp.add(10.0);
        temp.add(-8.0);
        temp.add(18.0);
        temp.add(21.0);
        temp.add(20.0);
        temp.add(19.0);
        temp.add(-15.0);
        TemperatureHistory temph = new TemperatureHistory();
        temph.setTemperatures(temp);
        System.out.println(temph.averageTemperature());
    }

}
