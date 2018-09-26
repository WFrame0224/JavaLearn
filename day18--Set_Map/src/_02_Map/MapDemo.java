package _02_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//需求：计算一个字符串中，每一个字符出现的次数
public class MapDemo {
	public static void main(String[] args) {
		String str = "bsdjakjhdnjadlkkldLDJPIDYkbbdmabdcxhioashd9qoqwu827349812";
		//把字符串转换为char数组（字符串本质就是char[]）
		char[] arr = str.toCharArray();
		//key--存储字符，value：存储出现的次数
		Map<Character, Integer> map = new LinkedHashMap<>();
		//循环得到每一个字符
		for (char c : arr) {
			//判断当前的字符是否在Map中key存在
			//1：如果不存在，则将该字符赋给key，并保存相应的value
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {//2：如果存在，则更改相应的value,再存放进去
				Integer oldValue = map.get(c);
				map.put(c, oldValue + 1);
			}
		}
		System.out.println(map);
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			System.out.println(key + "-->" + map.get(key));
		}
	}
}
