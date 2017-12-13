public class Main {
   public static void main(String[] args) {
      PizzaStore storeA = new PizzaStoreA();
      PizzaStore storeB = new PizzaStoreB();
      storeA.order("cheese").make();
      storeA.order("tomato").make();
      storeB.order("cheese").make();
      storeB.order("tomato").make();
   }
}

/*
Adding cheese to pizza...
Done making Cheese Pizza!
Adding tomato to pizza...
Done making Tomato Pizza!
Adding cheese to pizza...
Done making Cheese Pizza!
Adding cheese to pizza...
Done making Cheese Pizza!
*/