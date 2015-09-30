import java.util.Scanner;

/**
 * Write a description of class Rectanlge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
  public static void main (String[] args)
    {
        // put your code here
        System.out.println("Put the length of the rectangle:");
        Scanner s = new Scanner(System.in);
        double length = s.nextDouble();
        System.out.println("Put the width of the rectangle:");
        Scanner w = new Scanner(System.in);
        double width = w.nextDouble();
        double perimeter= (width+ length)+(width+ length);
        double area = width* length;
        double findingC = (length*length)+ (width*width);
        double diagonal = Math.sqrt(findingC);
        System.out.println("Perimeter is: "+perimeter);
        System.out.println("Area is:" +area);
        System.out.println("Diagonal is:" +diagonal);
    }

}
