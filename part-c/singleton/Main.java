public class Main {
   public static void main(String[] args) {
      Neo neo1 = Neo.getInstance();
      System.out.println(neo1.name);
      neo1.name = "Neon";
      Neo neo2 = Neo.getInstance();
      System.out.println(neo2.name);
   }
}

/*
Neo
Neon
*/