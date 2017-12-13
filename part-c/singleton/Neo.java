public class Neo {
   public String name;
   private static Neo uniqueInstance;

   // Private constructor
   private Neo() {
      name = "Neo";
   }

   // Method to get instance
   public static Neo getInstance() {
      if (uniqueInstance == null) {
         uniqueInstance = new Neo();
      }
      return uniqueInstance;
   }
}