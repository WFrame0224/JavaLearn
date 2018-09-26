//方法参数的值传递机制之引用数据类型
class ParameterDemo2  
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{10,99,55};
		ParameterDemo2.printArray(arr);
		ParameterDemo2.swap(arr,0,arr.length-1);//交换第一个和最后一个元素的值
		ParameterDemo2.printArray(arr);
	}
	/*
		注意，调用swap方法时，在栈空间中开辟了一块新的属于swap方法的栈帧
		，其把main方法中的arr所引用的地址值：0x****，复制一份，把复制之后的副本
		传递给swap方法的arr变量，其实际都是对原数组的同一块 堆 区域进行操作，自然
		会改变数组（不同于值传递基本数据类型，基本数据类型只是开辟 栈空间，而非 堆空间
		并不能够改变原变量的值）
	*/
	//交换第i个和第j个元素的值
	static void swap(int[] arr,int i,int j)
	{
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	//打印出数组
	static void printArray(int[] num)
	{
		if(num == null)
		{
			System.out.println("Error------");
			return;
		}
		System.out.print("[");
		for (int i = 0;i < num.length;i ++ )
		{
			if(i != num.length-1)
			{
				System.out.print(num[i]+",");
			}else
			{
				System.out.print(num[num.length-1]);
			}
		}
		System.out.print("]\n");
	}
}
