public class Main {
   public static void main(String[] args) {
      Adapter adapter = new SocketAdapter();
      adapter.get120Volt();
      adapter.get12Volt();
      adapter.get3Volt();
   }
}

/*
120V!
12V!
3V!
*/