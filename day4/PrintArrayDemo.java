class PrintArrayDemo 
{
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
	public static void main(String[] args) 
	{
		int[] num = new int[]{15,-9,-2,60,4,5,13,28,7,0};
		System.out.println(num);//这里打印出来的只是hashCode值，而非我们想要的值
		PrintArrayDemo.printArray(num);//该方法中将打印数组中每一个元素
		PrintArrayDemo.printArray(null);
	}
}
