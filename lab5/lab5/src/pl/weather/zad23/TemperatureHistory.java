package pl.weather.zad23;

import java.util.ArrayList;

class TemperatureHistory {
    private ArrayList<Double> temperatures;

    public TemperatureHistory(){

    }

    public ArrayList<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void addTemperature(double temperature){
        this.temperatures.add(temperature);
    }

    public void removeTemperature(int index){
        this.temperatures.remove(index);
    }

    public double averageTemperature(){
        double avgTemp = 0;
        int count = this.temperatures.size();
        for (int i=0; i<count; i++){
            avgTemp = avgTemp + this.temperatures.get(i);
        }
        avgTemp = avgTemp / count;
        return avgTemp;
    }
}




