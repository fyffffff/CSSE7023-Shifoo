package unittestingadvanced;

/* The import below is a support class which emulates JUnit behaviour.
 *  Outside of MyJavaTutor you would need to say
 *  import org.junit.*;
 *  to import JUnit functionalities. */
//import static unittestingadvanced.Support.*;
import static org.junit.Assert.*;
import org.junit.*;

public class NameValidatorTest {
    NameValidator validator; // do not initialise this variable, it will be done for you

    @Test
    public void validNameTest() {
        // add code here
        String name = "Jack Foo";
        assertTrue(validator.validateName(name));
    }

    @Test
    public void handlesBlankTest() {
        // add code here
        String name = " ";
        assertFalse(validator.validateName(name));
    }

    @Test
    public void checksForSpaceTest() {
        // add code here
        String name = "JackFoo";
        assertFalse(validator.validateName(name));
    }

    @Test
    public void handlesNullTest() {
        // add code here
        String name = null;
        boolean thrown = false;
        try {
            validator.validateName(name);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}