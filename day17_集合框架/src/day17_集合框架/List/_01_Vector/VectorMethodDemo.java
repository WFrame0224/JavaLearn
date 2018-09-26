package day17_集合框架.List._01_Vector;

import java.util.Vector;

/**
 * Vector类的操作方法--常用方法：
 * 	1）：增加
 * 			boolean add(Object e) 将指定元素添加到此向量的末尾
 * 				== addElement(Object e)
 * 			void add(int index,Object element) 在此向量的指定位置插入指定的元素
 * 			boolean addAll(Collection c) 把c集合中的元素添加到当前的集合对象中
 * 	2）：删除
 * 			Object remove(int index) 删除指定索引位置的元素，并返回删除之后的元素
 * 			boolean remove(Object o):删除指定的元素
 * 			boolean removeAll(Collection c)：从此集合中移除包含在指定集合c中的所有元素
 * 			boolean retainAll(Collection c) 在此集合中仅保留包含在指定集合 c中的元素
 * 	3）：修改
 * 			Object set(int index,Object element):修改当前集合中指定索引位置的元素，返回被替换的旧的元素
 * 	4）：查询
 * 			int size() 返回当前集合中存储的元素的个数
 * 			boolean isEmpty() 判断当前集合中元素的个数是否为0
 * 			Object get(int index) 查询指定索引位置的元素
 * 			Object[] toArray() 把集合对象转换为Object数组
 *
 */
public class VectorMethodDemo {
	public static void main(String[] args) {
		//testAdd();
		//testRemove();
		testSet();
	}
	//****************修改测试****************
	private static void testSet() {
		Vector v1 = new Vector();
		v1.add("1");
		v1.add("2");
		v1.add("3");
		v1.add("4");
		v1.add("5");
		System.out.println("v1-->" + v1);
		System.out.println("------------修改指定位置的元素-----------------------");
		Object remove = v1.set(3, "Frame");
		System.out.println("被删除的元素是：" + remove);
		System.out.println("v1-->" + v1);
	}
	//****************删除测试****************
	private static void testRemove() {
		Vector v1 = new Vector();
		v1.add("1");
		v1.add("2");
		v1.add("3");
		v1.add("4");
		v1.add("5");
		System.out.println("v1-->" + v1);
		System.out.println("------------删除操作1-----------------------");
		v1.remove(0);
		System.out.println("v1-->" + v1);
		v1.remove("4");
		System.out.println("v1-->" + v1);
		System.out.println("-----------------------------------");
		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		//v2.add(v1);//[1, 2, 3, [A, B, C]]
		v2.addAll(v1);//[1, 2, 3, A, B, C]
		System.out.println("V2-->" + v2);
		System.out.println("------------删除操作2-----------------------");
		//v2.removeAll(v1);
		v2.retainAll(v1);
		System.out.println("V2-->" + v2);
		
	}
	//****************增加测试****************
	public static void testAdd(){
		Vector v1 = new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		System.out.println("v1-->" + v1);
/*		v1.add(0, "Frame");
		System.out.println(v1);*/
		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		//v2.add(v1);//[1, 2, 3, [A, B, C]]
		v2.addAll(v1);//[1, 2, 3, A, B, C]
		System.out.println("V2-->" + v2);
	}
}
