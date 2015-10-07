import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    /**
     * Default constructor for objects of class Car
     */
    public Car(int x, int y)
    {
        // initialise instance variables
        xLeft=x;
        yTop=y;
   
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle carbod = new Rectangle(xLeft+550, yTop + 450, 200,30);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft+570,yTop+480,30,30);
        Ellipse2D.Double backTire = new Ellipse2D.Double(xLeft+710,yTop+480,30,30);
        Rectangle hoodOfCar = new Rectangle(xLeft+580, yTop+420, 140,30);
        g2.setColor(Color.RED);
        g2.fill(carbod);
        g2.fill(hoodOfCar);
        g2.setColor(Color.GRAY);
        g2.fill(frontTire);
        g2.fill(backTire);
        
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void move()
    {
        // put your code here
        xLeft-=40;
    }

}
