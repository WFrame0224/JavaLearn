package day17_集合框架.iterator;

import java.util.Enumeration;
import java.util.Vector;

//古老的迭代器--Enumeration
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println(v);
		System.out.println("-------------古老的迭代器方法---------------");
		//古老的迭代对象
		for(Enumeration en = v.elements(); en.hasMoreElements();){
			System.out.println(en.nextElement());
		}
		
	}
}
