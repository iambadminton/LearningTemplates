package HeadFirstDesignPatterns.Observer;

import java.util.ArrayList;

/**
 * Created by a.shipulin on 02.04.18.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0 ) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void serMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }


}
