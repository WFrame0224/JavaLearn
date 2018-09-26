package _02_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value3");
		map.put("key5", "value5");
		
		System.out.println(map);
		/*
			map.clear();
			System.out.println(map);
		*/
		System.out.println(map.containsKey("key4"));
		System.out.println(map.containsValue("value1"));
		Object val = map.get("key2");
		System.out.println(val);
		System.out.println(map.size());
		map.remove("key5");
		System.out.println(map);
//********************************************************************
		//Can only iterate over an array or an instance of java.lang.Iterable
		/*
			for (String string : map) {
				
			}
		 */
		//获取Map中所有的key所组成的集合（key是不能重复的，类似于Set）
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "-->" + map.get(key));
		}
		System.out.println("-----------------------------------");
		//获取Map中所有value所组成的集合（value可以重复）
		Collection<Object> values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}
		//获取Map中所有的Entry(key-value)
		Set<Map.Entry<String, Object>> entrys = map.entrySet();
		for (Map.Entry<String, Object> entry : entrys) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "<->" + value);
		}
	}
}
