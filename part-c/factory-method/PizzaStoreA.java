public class PizzaStoreA extends PizzaStore {
   // Subclass provides implementation on how pizzas are instantiated
   public Pizza order(String type) {
      // Return cheese pizza, tomato pizza or nothing
      if (type == "cheese") {
         return new CheesePizza();
      } else if (type == "tomato") {
         return new TomatoPizza();
      } else {
         return null;
      }
   }
}