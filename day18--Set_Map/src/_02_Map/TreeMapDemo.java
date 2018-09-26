package _02_Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String,Object> map1 = new TreeMap<>();
		map1.put("C", "cValue");
		map1.put("A", "aValue");
		map1.put("D", "dValue");
		map1.put("E", "eValue");
		map1.put("b", "bValue");
		map1.put("2", "2Value");
		map1.put("1", "1Value");
		System.out.println(map1);
	}
}
