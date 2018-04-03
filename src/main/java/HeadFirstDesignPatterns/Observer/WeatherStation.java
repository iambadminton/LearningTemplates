package HeadFirstDesignPatterns.Observer;

/**
 * Created by a.shipulin on 02.04.18.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.serMeasurements(80,68,30.4f);
        weatherData.serMeasurements(82,70,29.2f);
        weatherData.serMeasurements(78,90,29.2f);

    }
}
