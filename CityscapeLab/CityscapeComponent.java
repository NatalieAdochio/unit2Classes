import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Color inputOfUser;
    private Car theCar;
    private Car theCar2;
    private Car theCar3;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent(Color inputOfUser) {
        this.inputOfUser = inputOfUser;
        this.theCar = new Car(0,0);
        this.theCar2 = new Car(-200,60);
        this.theCar3 = new Car(250,0);
    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
 
    public void paintComponent(Graphics g)
    {
        
        
        Graphics2D g2 = (Graphics2D) g;
        //g2.fill(inputOfUser);
        this.setOpaque(true);
        this.setBackground(inputOfUser);
        super.paintComponent(g);
        Building Tower1 = new Building(40,0);
        Tower1.draw(g2);
        Building Tower2 = new Building(300,0);
        Tower2.draw(g2);
        Building Tower3 = new Building(580,0);
        Tower3.draw(g2);
        Building tower4 = new Building(420,0);
        tower4.draw(g2);
        
        AnotherBuilding anotherTower = new AnotherBuilding(165,0);
        anotherTower.draw(g2);
        AnotherBuilding anotherTower2 = new AnotherBuilding(460,0);
        anotherTower2.draw(g2);
        AnotherBuilding anotherTower3 = new AnotherBuilding(-95,0);
        anotherTower3.draw(g2);
        
        Shrub shrub1 = new Shrub(205,0);
        shrub1.draw(g2);
        
     
        Road daRoad = new Road(0,0);
        daRoad.draw(g2);
        
        Tree daTree = new Tree(100,0);
        daTree.draw(g2);
        Tree daTree3 = new Tree(345,0);
        daTree3.draw(g2);
        Tree daTree4 = new Tree(475,0);
        daTree4.draw(g2);
        
        
        theCar.draw(g2);
        theCar2.draw(g2);
        theCar3.draw(g2);
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
       
       theCar.move();
       theCar2.move();
       theCar3.move();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
