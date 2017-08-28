package Observer;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private int pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("Температура:%.1f градусов; Влажность: %.1f %%; Давление %d мм рт. ст.\n", temperature, humidity, pressure);
    }

}
