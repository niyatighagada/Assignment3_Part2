package testing;

import static org.junit.Assert.*;
import org.junit.Test;

public class divideTest {

	@Test
	public void testPositiveDivide() {
	    JunitTesting test = new JunitTesting();
	    double output = test.divide(10, 2);
	    double expectedOutput = 5.0;
	    double delta = 0.001; // tolerance for double comparison
	    assertEquals(expectedOutput, output, delta);
	}
	@Test
	public void testNegativeDivide() {
	    JunitTesting test = new JunitTesting();
	    try {
	        test.divide(10, 0);
	        fail("Expected ArithmeticException");
	    } catch (ArithmeticException e) {
	        // Expected exception
	    }
	}

	}
