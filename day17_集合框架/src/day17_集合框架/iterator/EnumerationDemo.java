package day17_���Ͽ��.iterator;

import java.util.Enumeration;
import java.util.Vector;

//���ϵĵ�����--Enumeration
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println(v);
		System.out.println("-------------���ϵĵ���������---------------");
		//���ϵĵ�������
		for(Enumeration en = v.elements(); en.hasMoreElements();){
			System.out.println(en.nextElement());
		}
		
	}
}
