public class Main {
   public static void main(String[] args) {
      Stall stall = new FruitStall();
      System.out.println(stall.getFruit("apple").name);
      System.out.println(stall.getFruit("orange").name); 
      stall = new VegetableStall();
      System.out.println(stall.getVegetable("spinach").name);
      System.out.println(stall.getVegetable("carrot").name); 
   }
}

/*
Apple
Orange
Spinach
Carrot
*/