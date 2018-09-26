package day17_集合框架.generictype;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo2 {
	public static void main(String[] args) {
		//带有Integer类型的泛型
		List<Integer> list1 = new ArrayList<>();
		list1.add(123);
		
		//不带泛型的集合
		List list2 = null;
		list2 = list1;//2）：把带有泛型的集合赋给不带泛型的集合，此时泛型被删除(手动删除)
		list2.add("ABC");
		//System.out.println(list2);
		
		//带有String类型的泛型
		List<String> list3 = null;
		list3 = list2;
		String num = list3.get(0);//想取123，但是却造成了堆污染
		/*
		 xception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			at day17_集合框架.generictype.GenericTypeDemo2.main(GenericTypeDemo2.java:21)
		 */
		
	}
}
