package personal.learning.useful;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class CollectionsRelatedTest {
	
	private CollectionsRelated collectionsRelated;
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Collections: I am first");
	}
	
	@AfterAll
	public void AfterAll() {
		System.out.println("Collections: I am last");
	}

	@BeforeEach
	public void beforeRunningEachMethods() {
		collectionsRelated = new CollectionsRelated();
	}
	
	@AfterEach
	public void AfterRunningEachMethods() {
		System.out.println("Testing collections related stuffs using JUnit5");
	}

	@Test
	@DisplayName("Test case related to Array")
	void testReturnArray() {
		int[] actual = collectionsRelated.returnArray();
		int[] expected = {1, 2, 3, 4};
		assertArrayEquals(expected, actual, () -> "Arrays unequal");
	}
	
	@Test
	@DisplayName("Test case related to List")
	void testReTurnList() {
		List<String> actualList = new ArrayList<>();
		actualList = collectionsRelated.reTurnList();
		
		List<String> expectedList = new ArrayList<>();
		expectedList.add("Aman");
		expectedList.add("Alka");
		expectedList.add("Manish");
		
		assertIterableEquals(expectedList, actualList, () -> "Lists unequal");
	}
	
	@Test
	//@DisplayName("Test case related to Map")
	void testReturnMap() {
		
		Map<Integer, String> actual = collectionsRelated.returnMap();
		
		Map<Integer, String> expected = new HashMap<>();
		expected.put(1, "One");
		expected.put(2, "Two");
		expected.put(3, "Three");
		expected.put(4, "Four");
		
		assertIterableEquals(expected.entrySet(), actual.entrySet(), () -> "Map unequal");
	}

}
