import java.util.ArrayList;

public class WeatherData implements Subject {
   // List of observers
   private ArrayList<Observer> observers;
   private float temperature;
   private float humidity;

   public WeatherData() {
      observers = new ArrayList<Observer>();
   }

   // Methods to manage observers
   public void registerObserver(Observer o) {
      observers.add(o);
   }
   public void removeObserver(Observer o) {
      int i = observers.indexOf(o);
      if (i >= 0) {
         observers.remove(i);
      }
   }
   public void notifyObservers() {
      for (Observer observer : observers) {
         observer.update(temperature, humidity);
      }
   }

   // Notify observers when measurements are changed
   public void measurementsChanged() {
      notifyObservers();
   }
   public void setMeasurements(float temperature, float humidity) {
      this.temperature = temperature;
      this.humidity = humidity;
      measurementsChanged();
   }

}