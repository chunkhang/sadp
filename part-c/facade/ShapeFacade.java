public class ShapeFacade {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   // Constructor for facade object
   public ShapeFacade() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   // Interfaces provided by facade
   public void drawCircle() {
      circle.draw();
   }
   public void drawRectangle() {
      rectangle.draw();
   }
   public void drawSquare() {
      square.draw();
   }

}