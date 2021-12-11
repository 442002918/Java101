import java.lang.*;

public class Main {

   public static void main(String[] args) {

      
      double x = 45;
      double y = -180;

      
      x = Math.toDegrees(x);
      y = Math.toDegrees(y);

     
      System.out.println("Math.tanh(" + x + ")=" + Math.tanh(x));
      System.out.println("Math.tanh(" + y + ")=" + Math.tanh(y));
   }
}
