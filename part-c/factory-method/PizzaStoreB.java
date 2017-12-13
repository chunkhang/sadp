public class PizzaStoreB extends PizzaStore {
   // Subclass provides implementation on how pizzas are instantiated
   public Pizza order(String type) {
      // Always return cheese pizza
      return new CheesePizza();
   }
}