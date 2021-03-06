import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Road
     */
    public Road(int x ,int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop =y;
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
        Rectangle road = new Rectangle(xLeft+0,yTop+440,800,200);
        g2.setColor(Color.BLACK);
        g2.fill(road);
        for(int x= xLeft+0; x < xLeft+800; x+=80)
        {
        Rectangle roadSquare = new Rectangle(x, yTop+495, 60,20);
        g2.setColor(Color.YELLOW);
        g2.fill(roadSquare);
    }
    }

}
