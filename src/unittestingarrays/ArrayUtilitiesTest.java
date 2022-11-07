package unittestingarrays;

/* The import below is a support class which emulates JUnit behaviour.
 *  Outside of MyJavaTutor you would need to say
 *  import org.junit.*;
 *  to import JUnit functionalities. */
//import static unittestingarrays.Support.*;
import org.junit.*;
import static org.junit.Assert.*;
public class ArrayUtilitiesTest {

    ArrayUtilities arrayUtilities; // do not initialise this variable, it will be done for you

    /* Does the findMiddle method correctly return the middle value? */
    @Test
    public void findMiddleFindsMiddleTest() {
        // add code here
        int[] values = {1, 2, 3};
        assertEquals(2, arrayUtilities.findMiddle(values));
    }

    /*
     * Does the findMiddle method return the correct value when the array has
     * an even number of elements?
     */
    @Test
    public void findMiddleFindsMiddleEvenTest() {
        // add code here
        int[] values = {1, 2, 3, 4};
        assertEquals(3, arrayUtilities.findMiddle(values));
    }

    /* Does the findMiddle method handle a null array correctly? */
    @Test
    public void findMiddleAllowsNullTest() {
        // add code here
        int[] values = null;
        assertEquals(-1, arrayUtilities.findMiddle(values));
    }

    /* Does the findMiddle method handle an empty array correctly? */
    @Test
    public void findMiddleAllowsEmptyTest() {
        // add code here
        int[] values = {};
        assertEquals(-1, arrayUtilities.findMiddle(values));
    }

    /* Does the sum method handle summing even values correctly? */
    @Test
    public void sumEvenTest() {
        // add code here
        int[] values = {1, 2, 3, 4, 5, 6};
        assertEquals(12, arrayUtilities.sum(values, true));
    }

    /* Does the sum method handle summing odd values correctly? */
    @Test
    public void sumOddTest() {
        // add code here
        int[] values = {1, 2, 3, 4, 5, 6};
        assertEquals(9, arrayUtilities.sum(values, false));
    }
}
