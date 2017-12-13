public abstract class PizzaStore {
   // Defer instantiation of pizza to subclass
   abstract Pizza order(String type);
}