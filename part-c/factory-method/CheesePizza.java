public class CheesePizza extends Pizza {
   public CheesePizza() {
      name = "Cheese Pizza";
      topping = "cheese";
   }

   public void make() {
      System.out.println("Adding " + topping + " to pizza...");
      System.out.println("Done making " + name + "!");
   }
}