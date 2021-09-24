import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MileageTrackerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MileageTrackerTest
{
    /**
     * Default constructor for test class MileageTrackerTest
     */
    public MileageTrackerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testIncrementMilesDriven()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementMilesDriven(10);
        double amount = testTracker.getMilesDriven();
        
        /*
         * The assertEquals method verifies that the expected value is
         *      equal to the actual (returned) value. If not, the test fails.
         *      
         *  Specify the expected value first and actual value second.
         *  For values of type double (only for doubles), specify a
         *      third value which is the epsilon (i.e., how close is
         *      close enough to be equal).
         */
        assertEquals(10, amount, 1e-6 /* 1 x 10^-6 */);
        
        testTracker.incrementMilesDriven(5);
        amount = testTracker.getMilesDriven();
        assertEquals(15, amount, 1e-6);
    }
    
    @Test
    public void testGetMileage()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementMilesDriven(100);
        testTracker.incrementFuelConsumed(4);
        double mileage = testTracker.getMileage();
        assertEquals(25.0, mileage, 1e-6);
    }
    
    @Test
    public void testSetVIN()
    {
        MileageTracker testTracker = new MileageTracker();
        String testVIN = new String("V176342FGB45B323A");
        testTracker.setVIN(testVIN);
        String returnedVIN = testTracker.getVIN();
        assertEquals(testVIN, returnedVIN);
    }
}
