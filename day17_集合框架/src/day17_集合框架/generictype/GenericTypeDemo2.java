package day17_���Ͽ��.generictype;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo2 {
	public static void main(String[] args) {
		//����Integer���͵ķ���
		List<Integer> list1 = new ArrayList<>();
		list1.add(123);
		
		//�������͵ļ���
		List list2 = null;
		list2 = list1;//2�����Ѵ��з��͵ļ��ϸ����������͵ļ��ϣ���ʱ���ͱ�ɾ��(�ֶ�ɾ��)
		list2.add("ABC");
		//System.out.println(list2);
		
		//����String���͵ķ���
		List<String> list3 = null;
		list3 = list2;
		String num = list3.get(0);//��ȡ123������ȴ����˶���Ⱦ
		/*
		 xception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			at day17_���Ͽ��.generictype.GenericTypeDemo2.main(GenericTypeDemo2.java:21)
		 */
		
	}
}
