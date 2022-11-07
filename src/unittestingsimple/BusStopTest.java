
package unittestingsimple;

/* The import below is a support class which emulates JUnit behaviour.
 *  Outside of MyJavaTutor you would need to say
 *  import org.junit.*;
 *  to import JUnit functionalities.
 */

import org.junit.*;
import static org.junit.Assert.*;
//import static unittestingsimple.Support.*;

public class BusStopTest {

    BusStop busStop; // do not initialise this variable, it will be done for you

    /*
     * Does getName return the bus stop's name?
     * Does setName change the bus stop's name?
     */
    @Test
    public void getSetNameTest() {
        // add code here
        busStop.setName("ABC");
        assertEquals("ABC", this.busStop.getName());
    }

    /*
     * Does getId return the bus stop's ID?
     * Does setId change the bus stop's ID?
     */
    @Test
    public void getSetIdTest() {
        // add code here
        busStop.setId(123);
        assertEquals(123, busStop.getId());
    }

    /*
     * Does getLatitude return the bus stop's latitude?
     * Does setLatitude change the bus stop's latitude?
     */
    @Test
    public void getSetLatitudeTest() {
        // add code here
        busStop.setLatitude(-27.485320);
        assertTrue(Math.abs(-27.485320 - busStop.getLatitude())
                < 0.001);
    }

    /*
     * Does getLongitude return the bus stop's longitude?
     * Does setLongitude change the bus stop's longitude?
     */
    @Test
    public void getSetLongitudeTest() {
        // add code here
        busStop.setLongitude(152.990570);
        assertTrue(Math.abs(152.990570 - busStop.getLongitude())
                < 0.001);
    }
}
