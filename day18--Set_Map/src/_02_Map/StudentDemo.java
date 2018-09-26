package _02_Map;

//List,Set,Map的综合运用

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDemo {
	public static void main(String[] args) {
		//使用Set集合存储一个班级学生的名称
		Set<String> names1 = new HashSet<>();
		names1.add("王龙");
		names1.add("项羽");
		names1.add("李顶");
		names1.add("张正");
		
		Set<String> names2 = new HashSet<>();
		names2.add("王龙飞");
		names2.add("项羽翔");
		names2.add("李丁凯");
		names2.add("张启蒙");
		
		//使用Map存储多个班级的学生
		//学院A
		Map<String,Set<String>> classMap1 = new HashMap<>(); 
		classMap1.put("学前班", names1);
		classMap1.put("大神班", names2);
		System.out.println(classMap1);
		//学院B
		Map<String,Set<String>> classMap2 = new HashMap<>(); 
		classMap2.put("学前班", names1);
		classMap2.put("大神班", names2);
		System.out.println(classMap2);
		
		//使用List来存储所有学院的学生姓名
		List<Map<String,Set<String>>> school = new ArrayList<>();
		school.add(classMap1);
		school.add(classMap2);
		System.out.println(school);
		//List<map<String,Object>> list = new ArrayList<>() 比较常用
	}
}
