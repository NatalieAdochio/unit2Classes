import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        System.out.println("Would you like it to be night or day?");
        Scanner looking = new Scanner(System.in);
        String answer = looking.next();
        int numberOfAnswer = answer.indexOf("night");
        Color inputOfUser;
        if (numberOfAnswer == -1){
            inputOfUser= new Color(198,226,255);
        } else {
            inputOfUser = new Color(0,0,238);
        }
        
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(inputOfUser);/*constructor make*/
        frame.add(component);
        frame.getContentPane().setBackground(inputOfUser);
        
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 1000 );
        }
        
    }

}
