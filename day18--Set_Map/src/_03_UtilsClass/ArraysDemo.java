package _03_UtilsClass;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		//������ת��ΪList����
		List<String> list = Arrays.asList("A","B","C","D","E");
		System.out.println(list);
		//ɾ����һ��Ԫ��
		list.remove(0);
		//��ʱ���� java.lang.UnsupportedOperationException
//====================================================================
		//�����Զ�װ�䣬�� 1 ������Integer����
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		//��ʱ������Integer���͵�����
		int[] arr = {1,2,3,4,5};
		//ֱ�Ӱ����鵱���˶���
		List<int[]> list2 = Arrays.asList(arr);
		System.out.println(list2);
		//List<Date> list2 = Arrays.asList(new Date(),new Date());
		
	}
}
