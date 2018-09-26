package _01_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//��ʾHashSet
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		/*
		set.add("0");
		set.add("0");//Set�в�����Ԫ���ظ�,����ȴ������
		*/
		//System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("1");
		set2.add("2");
		set.addAll(set2);
		System.out.println(set);
		System.out.println(set.contains("2"));
		System.out.println("----------for-each-����---------");
		for (String ele : set) {
			System.out.println(ele);
		}
		System.out.println("------------Iterator-����-------------");
		Iterator<String> s1 = set.iterator();
		while(s1.hasNext()){
			System.out.println(s1.next());
		}
		System.out.println(set);
		System.out.println(set.remove("1"));
		System.out.println(set);
		set.removeAll(set2);
		System.out.println(set);
		
		
	}
}
 