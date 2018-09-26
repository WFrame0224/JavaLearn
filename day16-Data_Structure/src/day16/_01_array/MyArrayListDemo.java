package day16._01_array;

public class MyArrayListDemo {

	public static void main(String[] args) {
		//创建数组列表对象
		MyArrayList list = new MyArrayList(5);
		System.out.println(list.isEmpty());
		list.add("A");
		list.add("B");
		list.add(10);
		list.add(11.0);
		list.add(true);
		list.add('a');
		System.out.println(list.isEmpty());
		//打印集合对象：打印集合中存储的数据
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
	}
}
