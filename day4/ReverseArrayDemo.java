class  ReverseArrayDemo
{
	//ð��������������
	static int[] reverse(int[] num)
	{
		int i = 0, j = 0;
		int temp = 0;
		for (i = 0; i < (num.length - 1);i ++)
		{
			for (j = 0;j < (num.length - 1 - i);j ++)
			{
				if(num[j] > num[j+1])
				{
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		return num;
	}
	//��ӡ��������
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
		int[] num = new int[]{9,3,2,4,8,6,7,5,1};
		System.out.print("ԭ����Ϊ��");
		ReverseArrayDemo.printArray(num);
		System.out.println("-----------------");
		num = ReverseArrayDemo.reverse(num);
		System.out.print("����������Ϊ��");
		ReverseArrayDemo.printArray(num);
		System.out.println("-----------------");
	}
}
