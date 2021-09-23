/**
 * This class models a mileage tracker for a car.
 *
 * @author mrcallaghan
 * @version 23sept2021
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables (store the object's attributes):
     *      specify the visibility (e.g., private)
     *          public: accessible by any code in any class
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specify the name (e.g., milesDriven)
     *      
     *  Instance variables differ from local variables in the following ways:
     *      scoped to the class (accessible in all methods of the class;
     *          lifetime is the same as the object)
     *      automatically initialized to a default value (0, false, null)
     *      best practice is not to immediately initialize instance variables
     */
    
    private double milesDriven;  // in units of miles
  
    /*
     * 3. Define the constructor(s):
     *      responsible for initializing newly created objects
     *      invoked automatically via the new operator
     *      name of the constructor must match the name of the class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     */
    
    
    
    
    
    
    
    
    /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public)
     *      the return type (e.g., void)
     *      the method name (e.g., incrementMilesDriven)
     *      the parameters and their types (e.g., miles of type double)
     */
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(double gallons)
    {
        //this.fuelConsumed += gallons;
        return;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public double getFuelConsumed()
    {
        //return this.fuelConsumed;
        return 0.0;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public double getMileage()
    {
        //double mileage = this.fuelConsumed / this.milesDriven;
        //return mileage;
        return 0.0;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        //return this.vin;
        return "None";
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param vin    the vehicle identification (VIN) of this car
     */
    public void setVIN(String vin)
    {
        //vin = vin;
    }
}






