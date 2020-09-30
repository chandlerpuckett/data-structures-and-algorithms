package challenges;

import challenges.utilities.MultiBracketValidation;
import org.junit.Test;
import static org.junit.Assert.*;

public class BracketTest {

    @Test
    public void testValidation() {
        String test1 = "{}{Code}[Fellows](())";     // T
        String test2 = "[({}]";                     // F
        String test3 = "()[[Extra Characters]]";    // T
        String test4 = "{}[]()(PARTY TIME)";        // T
        String test5 = "{{{{{((())]]{}{}";          // F

        assertEquals("this string is true", true, MultiBracketValidation.isValid(test1));
        assertEquals("this string is false", false, MultiBracketValidation.isValid(test2));
        assertEquals("this string is true", true, MultiBracketValidation.isValid(test3));
        assertEquals("this string is true", true, MultiBracketValidation.isValid(test4));
        assertEquals("this string is false", false, MultiBracketValidation.isValid(test5));
    }
}
