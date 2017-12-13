public class ProxyInternet implements Internet {
   private Internet internet;
   // Boolean to control proxy internet access
   private boolean deny = true;

   // Constructor to instantiate real internet
   public ProxyInternet() {
      this.internet = new RealInternet();
   }

   // Protection proxy that checks whether access is denied
   public void access() {
      if (deny) {
         System.out.println("No access!");
      } else {
         internet.access();
      }
   }
}