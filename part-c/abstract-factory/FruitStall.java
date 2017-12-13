public class FruitStall extends Stall {
   public Fruit getFruit(String type) {
      if (type == "apple") {
         return new Apple();
      } else if (type == "orange") {
         return new Orange();
      } else {
         return null;
      }
   }
   public Vegetable getVegetable(String type) {
      return null;
   }
}