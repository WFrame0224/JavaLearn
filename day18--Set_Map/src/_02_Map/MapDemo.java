package _02_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//���󣺼���һ���ַ����У�ÿһ���ַ����ֵĴ���
public class MapDemo {
	public static void main(String[] args) {
		String str = "bsdjakjhdnjadlkkldLDJPIDYkbbdmabdcxhioashd9qoqwu827349812";
		//���ַ���ת��Ϊchar���飨�ַ������ʾ���char[]��
		char[] arr = str.toCharArray();
		//key--�洢�ַ���value���洢���ֵĴ���
		Map<Character, Integer> map = new LinkedHashMap<>();
		//ѭ���õ�ÿһ���ַ�
		for (char c : arr) {
			//�жϵ�ǰ���ַ��Ƿ���Map��key����
			//1����������ڣ��򽫸��ַ�����key����������Ӧ��value
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {//2��������ڣ��������Ӧ��value,�ٴ�Ž�ȥ
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
