import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Tree
     */
    public Tree( int x, int y)
    {
        // initialise instance variables
        xLeft= x;
        yTop= y;
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
        Rectangle trunk = new Rectangle(xLeft+30,yTop+300,30,140);
        Color treeColor= new Color(139,69,19);
        g2.setColor(treeColor);
        g2.fill(trunk);
        Ellipse2D.Double leafy1 = new Ellipse2D.Double(xLeft + 0, yTop + 280, 55,55);
        Ellipse2D.Double leafy2 = new Ellipse2D.Double(xLeft +40, yTop + 280, 55,55);
        Ellipse2D.Double leafy3 = new Ellipse2D.Double(xLeft + 0, yTop + 265, 55,55);
        Ellipse2D.Double leafy4 = new Ellipse2D.Double(xLeft +30, yTop + 250, 55,55);
        Ellipse2D.Double leafy5 = new Ellipse2D.Double(xLeft + 0, yTop + 320, 55,55);
        Ellipse2D.Double leafy6 = new Ellipse2D.Double(xLeft +40, yTop + 264, 55,55);
        Ellipse2D.Double leafy7 = new Ellipse2D.Double(xLeft + 30, yTop + 320, 55,55);
        Ellipse2D.Double leafy8 = new Ellipse2D.Double(xLeft +40, yTop + 315, 55,55);
        Ellipse2D.Double leafy9 = new Ellipse2D.Double(xLeft + 0, yTop + 275, 55,55);
        Ellipse2D.Double leafy10 = new Ellipse2D.Double(xLeft +40, yTop + 275, 55,55);
        g2.setColor(Color.GREEN);
        g2.fill(leafy1);
        g2.fill(leafy2);
        g2.fill(leafy3);
        g2.fill(leafy4);
        g2.fill(leafy5);
        g2.fill(leafy6);
        g2.fill(leafy7);
        g2.fill(leafy8);
        g2.fill(leafy9);
        g2.fill(leafy10);
    }

}
