package _02_Map;

//List,Set,Map���ۺ�����

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDemo {
	public static void main(String[] args) {
		//ʹ��Set���ϴ洢һ���༶ѧ��������
		Set<String> names1 = new HashSet<>();
		names1.add("����");
		names1.add("����");
		names1.add("�");
		names1.add("����");
		
		Set<String> names2 = new HashSet<>();
		names2.add("������");
		names2.add("������");
		names2.add("���");
		names2.add("������");
		
		//ʹ��Map�洢����༶��ѧ��
		//ѧԺA
		Map<String,Set<String>> classMap1 = new HashMap<>(); 
		classMap1.put("ѧǰ��", names1);
		classMap1.put("�����", names2);
		System.out.println(classMap1);
		//ѧԺB
		Map<String,Set<String>> classMap2 = new HashMap<>(); 
		classMap2.put("ѧǰ��", names1);
		classMap2.put("�����", names2);
		System.out.println(classMap2);
		
		//ʹ��List���洢����ѧԺ��ѧ������
		List<Map<String,Set<String>>> school = new ArrayList<>();
		school.add(classMap1);
		school.add(classMap2);
		System.out.println(school);
		//List<map<String,Object>> list = new ArrayList<>() �Ƚϳ���
	}
}
