package _03_UtilsClass;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		//把数组转换为List对象
		List<String> list = Arrays.asList("A","B","C","D","E");
		System.out.println(list);
		//删除第一个元素
		list.remove(0);
		//此时报错： java.lang.UnsupportedOperationException
//====================================================================
		//可以自动装箱，把 1 看成是Integer对象
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		//此时定义了Integer类型的数组
		int[] arr = {1,2,3,4,5};
		//直接把数组当成了对象
		List<int[]> list2 = Arrays.asList(arr);
		System.out.println(list2);
		//List<Date> list2 = Arrays.asList(new Date(),new Date());
		
	}
}
