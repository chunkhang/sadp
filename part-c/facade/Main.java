public class Main {
   public static void main(String[] args) {
      // Instantiate facade object
      ShapeFacade facade = new ShapeFacade();
      // Invoke facade interfaces
      facade.drawCircle();
      facade.drawRectangle();
      facade.drawSquare();
   }
}

/*
Circle!
Rectangle!
Square!
*/