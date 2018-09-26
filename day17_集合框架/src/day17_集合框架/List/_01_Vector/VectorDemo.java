package day17_集合框架.List._01_Vector;

import java.util.Vector;

/**Vector类存储原理
 * 		通过源码分析，发现Vector类中有一个Object[]类型数组
 * 		protected Object[] elementData;
 * 	1):表面上把数据存储到Vector对象中，其实底层依然是把数据存储到Object数组中的；
 * 	2):我们发现该数组的元素类型是Object类型，意味着 集合中只能存储任意类型的对象
 *  3):集合类中存储的对象，存储的是对象的引用，而不是对象本身
 * ***************************************************************************

 */

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.addElement(123);
		v.addElement(Integer.valueOf(123));
		System.out.println(v);
		
		StringBuilder sb = new StringBuilder("ABC");
		v.addElement(sb);
		System.out.println(v);//[123, 123, ABC]
		sb.append("SeeMyGo");
		System.out.println(v);//[123, 123, ABCSeeMyGo]
		
		
	}

}
