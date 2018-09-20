import java.util.Observable;
import java.util.Observer;

public class WeatherStation {

    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.0f);
        weatherData.setMeasurements(85, 47, 33.7f);
        weatherData.setMeasurements(62, 89, 34.0f);
    }
}
