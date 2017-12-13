public class SocketAdapter extends Socket implements Adapter {
   // Adapt the interface
   public void get120Volt() {
      System.out.println(getVolt() + "V!");
   }

   public void get12Volt() {
      System.out.println(getVolt()/10 + "V!");
   }

   public void get3Volt() {
      System.out.println(getVolt()/40 + "V!");
   }

}