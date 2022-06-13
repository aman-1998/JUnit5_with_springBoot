package personal.learning.useful;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmaticOperationsTest {

	@Test
	void testAdd() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.add(4, 6);
		int expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	void testSubtract() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.subtract(3, 9);
		int expected = -7;
		assertEquals(expected, actual);
	}

	@Test
	void testMultiply() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.multiply(6, 9);
		int expected = 54;
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.divide(10, 2);
		int expected = 5;
		assertEquals(expected, actual);
	}

}
