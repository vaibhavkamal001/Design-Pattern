import Interface.Observer.Observer;
import Weather.WantedWeatherData.CurrentConditionDisplay;
import Weather.WantedWeatherData.ForecastDisplay;
import Weather.WantedWeatherData.StatisticsDisplay;
import Weather.WeatherData.WeatherData;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.updateAppeared();
        System.out.println("----------------------------------------");
        weatherData.removeObserver(statisticsDisplay);
        weatherData.updateAppeared();

    }
}