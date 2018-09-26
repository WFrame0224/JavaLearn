package day17_集合框架.iterator;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ForeachDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		/*foreach方法边迭代边删除操作的问题
		for(Object ele : list){
			System.out.println(ele);
			//删除集合中字符串为“B”的元素
			if("B".equals(ele)){
				list.remove(ele);
			}
			
			 Exception in thread "main" java.util.ConcurrentModificationException//并发修改异常
				at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
				at java.util.ArrayList$Itr.next(ArrayList.java:851)
				at day17_集合框架.iterator._01_IteratorDemo.ForeachDemo.main(ForeachDemo.java:13)
			 
		}
		*/
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object ele = it.next();
			if("B".equals(ele)){
				it.remove();
			}
		}
		System.out.println(list);
	}
}
