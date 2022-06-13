package personal.learning.useful;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArithmaticOperationsTest {

	@Test
	@DisplayName("Test case to add two integers")
	void testAdd() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.add(4, 6);
		int expected = 10;
		assertEquals(expected, actual, "Addition failed");
	}

	@Test
	@DisplayName("Test case to subtract an integer from other")
	void testSubtract() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.subtract(3, 9);
		int expected = -6;
		assertEquals(expected, actual, "Substraction failed");
	}

	@Test
	@DisplayName("Test case to multiply two integers")
	void testMultiply() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.multiply(6, 9);
		int expected = 54;
		assertEquals(expected, actual, "Multiplication failed");
	}

	@Test
	@DisplayName("Test case to divide an integers by other")
	void testDivide() {
		ArithmaticOperations arithMaticOperations = new ArithmaticOperations();
		int actual = arithMaticOperations.divide(10, 2);
		int expected = 5;
		assertEquals(expected, actual, "Division failed");
	}

}
