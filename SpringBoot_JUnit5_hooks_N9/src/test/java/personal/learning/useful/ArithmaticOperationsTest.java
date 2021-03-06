package personal.learning.useful;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)  // Lifecycle.PER_METHOD => default implementation
class ArithmaticOperationsTest {
	
	private ArithmaticOperations arithMaticOperations;
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Arithmatic: I am first");
	}
	
	@AfterAll
	public void AfterAll() {
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
	void testDivide() {
		int actual = arithMaticOperations.divide(10, 2);
		int expected = 5;
		assertEquals(expected, actual, () -> "Division failed");
		assertThrows(Exception.class, () -> arithMaticOperations.divide(4, 0));
	}

}
