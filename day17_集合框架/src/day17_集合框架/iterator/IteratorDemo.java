package day17_集合框架.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//集合元素的迭代/遍历操作
public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		System.out.println("--------------方式一------------------");
		//方式一：for循环操作
		for(int index = 0;index < list.size();index ++){
			Object ele = list.get(index);//取出指定索引位置的元素
			System.out.println(ele);
		}
		System.out.println("--------------方式二------------------");
		//方式二：for-each增强for循环
		/*
		 * for(类型 变量 : 数组名/Iterable实现类对象){}
		 */
		for(Object ele:list){
			System.out.println(ele);
		}
		System.out.println("--------------方式三------------------");
		//方式三：使用迭代器 Iterator()
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("--------------方式四------------------");
		//方式四：使用for循环来操作Iterator
		for(Iterator it1 = list.iterator();it1.hasNext();){
			System.out.println(it1.next());
		}
	}
}
