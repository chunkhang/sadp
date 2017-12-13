public class TemperatureDisplay implements Observer {
   private Subject weatherData;
   private float temperature;

   // Register observer during instantiation
   public TemperatureDisplay(Subject weatherData) {
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
   }

   // Action to take when state changes
   public void update(float temperature, float humidity) {
      this.temperature = temperature;
      System.out.println("Temperature: " + temperature + " degrees");
   }

}