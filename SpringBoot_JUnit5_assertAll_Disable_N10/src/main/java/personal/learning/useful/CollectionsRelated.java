package personal.learning.useful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsRelated {
	
	public int[] returnArray() {
		int[] arr = new int[] {1, 2, 3, 4};
		return arr;
	}
	
	public List<String> reTurnList() {
		List<String> list = new ArrayList<>();
		list.add("Aman");
		list.add("Alka");
		list.add("Manish");
		return list;
	}
	
	public Map<Integer, String> returnMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		return map;
	}
}
