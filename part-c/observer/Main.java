public class Main {
   public static void main(String[] args) {
      WeatherData weatherData = new WeatherData();

      TemperatureDisplay temperatureDisplay = 
         new TemperatureDisplay(weatherData);
      HumidityDisplay humidityDisplay = 
         new HumidityDisplay(weatherData);

      weatherData.setMeasurements(80, 65);
      weatherData.setMeasurements(82, 70);
      weatherData.setMeasurements(78, 90);
   }
}

/*
Temperature: 80.0 degrees
Humidity: 65.0%
Temperature: 82.0 degrees
Humidity: 70.0%
Temperature: 78.0 degrees
Humidity: 90.0%
*/