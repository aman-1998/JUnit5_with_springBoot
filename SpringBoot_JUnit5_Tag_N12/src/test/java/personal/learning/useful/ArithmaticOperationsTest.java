package personal.learning.useful;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

class ArithmaticOperationsTest {
	
	private ArithmaticOperations arithMaticOperations;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Arithmatic: I am first");
	}
	
	@AfterAll
	public static void AfterAll() {
		System.out.println("Arithmatic: I am last");
	}

	@BeforeEach
	public void beforeRunningEachMethods() {
		arithMaticOperations = new ArithmaticOperations();
	}
	
	@AfterEach
	public void AfterRunningEachMethods() {
		System.out.println("Testing arithmatic operations using JUnit5");
	}
	
	@Test
	@DisplayName("Test case to add two integers")
	void testAdd() {
		int actual = arithMaticOperations.add(4, 6);
		int expected = 10;
		assertEquals(expected, actual, () -> "Addition failed");
	}

	@Test
	@DisplayName("Test case to subtract an integer from other")
	void testSubtract() {
		int actual = arithMaticOperations.subtract(3, 9);
		int expected = -6;
		assertEquals(expected, actual, () -> "Substraction failed");
	}

	@Test
	@DisplayName("Test case to multiply two integers")
	void testMultiply() {
		int actual = arithMaticOperations.multiply(6, 9);
		int expected = 54;
		assertEquals(expected, actual, () -> "Multiplication failed");
	}

	@Test
	@DisplayName("Test case to divide an integers by other")
	@Tag("runIt")
	void testDivide() {
		assertEquals(5, arithMaticOperations.divide(10, 2), () -> "Division failed");
		assertEquals(0, arithMaticOperations.divide(10, 15), () -> "Division failed");
		
		int denominator = 0;
		assumeTrue(denominator == 0);
		System.out.println("Testing divide by zero");
		assertThrows(Exception.class, () -> arithMaticOperations.divide(4, denominator));
	}

}
