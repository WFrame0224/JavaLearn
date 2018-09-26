//增强for循环--foreach
class ForeachDemo 
{
	public static void main(String[] args) 
	{
		int[] num = new int[]{10,20,30,40,50};
		//需求使用循环迭代出数组中每一个元素
		for (int index = 0;index < num.length ;index ++ )
		{
			System.out.println(num[index]);
		}
		System.out.println("==============");
		//增强型for循环
		/**
			for(数组元素类型 变量 : 数组名)
			{
				循环体
			}
         经过反编译工具查看字节码，发现foreach其实在底层依然使用 for循环+ 索引
		 来操作数组的，我们把增强for循环，称为编译器的新特性-->语法糖。
		 如果迭代数组元素，而不关心数组的索引的时候首选foreach
		*/
		for(int ele : num)
		{
			System.out.print(ele + " ");
		}
		System.out.println("============================");
		String[]  strs = new String[]{"我在这里，我等着你"};
		for ( String str : strs)
		{
			System.out.println(str);
		}
	}
}
