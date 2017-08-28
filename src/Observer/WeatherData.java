package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class WeatherData implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private int pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

}
