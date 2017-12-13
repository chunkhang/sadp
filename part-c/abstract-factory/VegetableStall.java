public class VegetableStall extends Stall {
   public Fruit getFruit(String type) {
      return null;
   }
   public Vegetable getVegetable(String type) {
      if (type == "spinach") {
         return new Spinach();
      } else if (type == "carrot") {
         return new Carrot();
      } else {
         return null;
      }
   }
}