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
		System.out.println(num);//�����ӡ������ֻ��hashCodeֵ������������Ҫ��ֵ
		PrintArrayDemo.printArray(num);//�÷����н���ӡ������ÿһ��Ԫ��
		PrintArrayDemo.printArray(null);
	}
}
