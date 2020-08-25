package tut4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class TestCalc {
    @Test
    public void testAddMethod(){
    	assertEquals(4, new Calc().add(2, 2));
    }
    @Test
    public void testSubtractMethod(){
    	assertEquals(0, new Calc().subtract(2, 2));
    }
}
