package day17_���Ͽ��.iterator;

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
		
		/*foreach�����ߵ�����ɾ������������
		for(Object ele : list){
			System.out.println(ele);
			//ɾ���������ַ���Ϊ��B����Ԫ��
			if("B".equals(ele)){
				list.remove(ele);
			}
			
			 Exception in thread "main" java.util.ConcurrentModificationException//�����޸��쳣
				at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
				at java.util.ArrayList$Itr.next(ArrayList.java:851)
				at day17_���Ͽ��.iterator._01_IteratorDemo.ForeachDemo.main(ForeachDemo.java:13)
			 
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
