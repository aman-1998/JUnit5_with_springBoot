package personal.learning.useful;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CollectionsRelatedTest {

	@Test
	@DisplayName("Test case related to Array")
	void testReturnArray() {
		CollectionsRelated collectionsRelated = new CollectionsRelated();
		int[] actual = collectionsRelated.returnArray();
		int[] expected = {1, 2, 3, 4};
		assertArrayEquals(expected, actual, () -> "Arrays unequal");
	}
	
	@Test
	@DisplayName("Test case related to List")
	void testReTurnList() {
		CollectionsRelated collectionsRelated = new CollectionsRelated();
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
		CollectionsRelated collectionsRelated = new CollectionsRelated();
		
		Map<Integer, String> actual = collectionsRelated.returnMap();
		
		Map<Integer, String> expected = new HashMap<>();
		expected.put(1, "One");
		expected.put(2, "Two");
		expected.put(3, "Three");
		expected.put(5, "Five");
		
		assertIterableEquals(expected.entrySet(), actual.entrySet(), () -> "Map unequal");
	}

}
