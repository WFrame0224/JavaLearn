//import java.util.Arrays;
import java.util.*;//使用了通配符代替导入所有需要的类

class ImportDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,-2,3,4,-5,6,7,-8,9,-10};
		//打印
		//String ret = java.util.Arrays.toString(arr);
		String ret = Arrays.toString(arr);//使用了import语句，直接可以采用 类名.方法名
		/**
			没有使用import之前，操作不在同一个包中的类，得使用 全限定名 来操作
			解决方案：使用impotr语句，直接把某个包下的类导入当前文件夹中去
			语法格式：import 需要导入类的-全限定名
		*/
		System.out.println(ret);
		//排序
		java.util.Arrays.sort(arr);
		//ret = java.util.Arrays.toString(arr);
		ret = Arrays.toString(arr);//此处同上
		System.out.println(ret);

	}
}
