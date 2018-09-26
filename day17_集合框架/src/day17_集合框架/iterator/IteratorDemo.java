package day17_���Ͽ��.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//����Ԫ�صĵ���/��������
public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		System.out.println("--------------��ʽһ------------------");
		//��ʽһ��forѭ������
		for(int index = 0;index < list.size();index ++){
			Object ele = list.get(index);//ȡ��ָ������λ�õ�Ԫ��
			System.out.println(ele);
		}
		System.out.println("--------------��ʽ��------------------");
		//��ʽ����for-each��ǿforѭ��
		/*
		 * for(���� ���� : ������/Iterableʵ�������){}
		 */
		for(Object ele:list){
			System.out.println(ele);
		}
		System.out.println("--------------��ʽ��------------------");
		//��ʽ����ʹ�õ����� Iterator()
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("--------------��ʽ��------------------");
		//��ʽ�ģ�ʹ��forѭ��������Iterator
		for(Iterator it1 = list.iterator();it1.hasNext();){
			System.out.println(it1.next());
		}
	}
}
