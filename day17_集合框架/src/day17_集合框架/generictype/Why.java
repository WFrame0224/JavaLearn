package day17_���Ͽ��.generictype;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Why {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);//Integer����
		
		//������Ҫ����Integer��ķ���
		Object ele = list.get(0);
		Integer num = (Integer)ele;
		System.out.println(num);
		//---------------------------------
		TreeSet set = new TreeSet();
		set.add(123);
		set.add("ABC");
	}
}
