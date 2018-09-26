package day17_集合框架.generictype;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Why {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);//Integer类型
		
		//现在需要调用Integer类的方法
		Object ele = list.get(0);
		Integer num = (Integer)ele;
		System.out.println(num);
		//---------------------------------
		TreeSet set = new TreeSet();
		set.add(123);
		set.add("ABC");
	}
}
