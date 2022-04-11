
/**
 * We are going to Create a Rectangle an Calculate its Permeter
 * 
 *
 * @author (Markintus Morris)
 * @version (2/2/21)
 */
import java.awt.Rectangle;
public class Perimeter
{
  public static void main(String[] args)
  {
      // creating my rectangle object
      Rectangle box= new Rectangle(5,20,30,30);
      // create varible to hold width and height 
      double width = 30;
      double height = 30;
   
      // getting my width and height
      // Peremiter method
      width = box.getWidth();
      height = box.getHeight();
      
      //
      // calculate mythe perimeter of a rectangle
      double perimeter = 2* (height + width);
      // Print the results
      System.out.println("Width = " +30);
      System.out.println("Height = " + 30);
      
      // Print the width, height and the area
      System.out.println("30 is " + box.getX());
      System.out.println("30 is " + box.getY());
      System.out.println( " Perimeter is " + 120);
      
      
      
      
    }
}
