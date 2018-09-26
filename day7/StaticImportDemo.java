//静态导入--实际开发中我们不使用静态导入，因为如此，分不清静态方法或字段源于那一个类

import java.util.Arrays;
import static java.util.Arrays.*;

class StaticImportDemo
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,-2,3,4,-5,6,7,-8,9,-10};

		String ret = Arrays.toString(arr);
		System.out.println(ret);
		
		//排序
		sort(arr);//采用了静态导入的方法，可以省略类名
		ret = Arrays.toString(arr);//此处同上
		System.out.println(ret);
	}
}
