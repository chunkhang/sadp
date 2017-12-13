public class HumidityDisplay implements Observer {
   private Subject weatherData;
   private float humidity;

   // Register observer during instantiation
   public HumidityDisplay(Subject weatherData) {
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
   }

   // Action to take when state changes
   public void update(float temperature, float humidity) {
      this.humidity = humidity;
      System.out.println("Humidity: " + humidity + "%");
   }

}