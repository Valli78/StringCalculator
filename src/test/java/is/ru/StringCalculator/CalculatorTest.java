package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
 	public void testEmptyString() {
 		assertEquals(0,Calculator.add(""));
 	}

	@Test
 	public void testOneNumber() {
 		assertEquals(1,Calculator.add("1"));
 	}

	@Test
 	public void testTwoNumbers() {
 		assertEquals(3,Calculator.add("1,2"));
 	}

	@Test
 	public void testDifferentNumbers() {
 		assertEquals(10,Calculator.add("2,2,2,2,2"));
 	}

 	@Test
 	public void testNewlineChar() {
 		assertEquals(4,Calculator.add("1,1\n1,1"));
 	}

}