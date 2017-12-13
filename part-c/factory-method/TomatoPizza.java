public class TomatoPizza extends Pizza {
   public TomatoPizza() {
      name = "Tomato Pizza";
      topping = "tomato";
   }

   public void make() {
      System.out.println("Adding " + topping + " to pizza...");
      System.out.println("Done making " + name + "!");
   }
}