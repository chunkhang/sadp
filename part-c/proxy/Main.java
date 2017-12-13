public class Main {
   public static void main(String[] args) {
      Internet realInternet = new RealInternet();
      Internet proxyInternet = new ProxyInternet();
      realInternet.access();
      proxyInternet.access();
   }
}

/*
Accessing internet!
No access!
*/