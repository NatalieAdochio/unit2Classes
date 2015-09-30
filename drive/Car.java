

/**
 * A car  has a certain fule efficiency and a certain amount 
 * of fuel in the gas tank. The car can be driven a certain
 * distance.
 * 
 * @author Natalie 
 * @version 10 september 2015
 */
public class Car
{
    /** Fuel efficiency of the car in miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fuel left in the car's tank in gallons*/
    private double fuelInTank;
    

    /**
     * construtor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double Efficiency)
    {
        // initialise instance variables
        fuelEfficiency = Efficiency;
        fuelInTank= 0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amount of fuel in the
     * tank.
     *
     * @pre       specified distance cannot result in the comsumption of more gas
     * than is availabile
   
     * @param    distance    distance that the car drives in miles
     *
     */
    public void drive( double distance)
    {
        // put your code here
        fuelInTank -= distance / fuelEfficiency;
    }
    

    /**
     *returns amount of gas in the tank in units of gallons
     *
     * 
     * @return  returns amount of gas in the tank in units of gallons
     */
    public double getGasTank()
    {
        // put your code here
        return fuelInTank;
    }
    

    /**
     * Increments the fuel in the car's tank by the amount in gallons
     *
     * @pre     gallonsOfGas must be a postive number
     * 
     * @param   galloneOfGas   amount of gas to add to the car's tank in gallons
     *
     */
    public void addGas(double gallonsOfGas)
    {
        // put your code here
        fuelInTank += gallonsOfGas;
    }



}
