import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Making the building.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
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
        // making the standard building
        Rectangle tallestTower = new Rectangle(xLeft+100, yTop+40, 105,400);
        Rectangle window1 = new Rectangle(xLeft+105, yTop+45, 15,15);
        Rectangle window2 = new Rectangle(xLeft+125, yTop+45, 15, 15);
        Rectangle window3 = new Rectangle(xLeft+145, yTop+45, 15,15);
        Rectangle window4 = new Rectangle(xLeft+165, yTop+45, 15, 15);
        Rectangle window5 = new Rectangle(xLeft+185, yTop+45, 15, 15);
        g2.setColor(Color.BLACK);
        g2.fill(tallestTower);
        g2.setColor(Color.YELLOW);
        g2.fill(window1);
        g2.setColor(Color.YELLOW);
        g2.fill(window2);
        g2.setColor(Color.YELLOW);
        g2.fill(window3);
        g2.setColor(Color.YELLOW);
        g2.fill(window4);
        g2.setColor(Color.YELLOW);
        g2.fill(window5);
    }

}
