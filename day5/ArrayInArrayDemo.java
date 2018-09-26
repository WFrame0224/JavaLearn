class  ArrayInArrayDemo
{
	public static void main(String[] args) 
	{
		int[][] arr = new int[][]{
			{1,2,3},
			{4,5},
			{6}
		};
		//��C++/C�����𣬳���
		System.out.println(arr.length);//3������Ϊ��������һά����
		System.out.println(arr[2].length);//1������Ϊ������һλ����ĳ���
		System.out.println("------------------------");
		int[][] num = new int[3][5];
		System.out.println(num.length);//3
		System.out.println(num[2].length);//5
		System.out.println("========================");
		ArrayInArrayDemo.printArrays(arr);
		
	}
	//��ӡ����ά����
	static void printArrays(int[][] arr)
	{
		System.out.println("{");
		for (int i = 0;i < arr.length;i ++)
		{
			System.out.print("  {");
			for (int j = 0;j < arr[i].length;j++)
			{
				if (j != arr[i].length-1)
				{
					System.out.print(arr[i][j]+", ");
				}
				System.out.print(arr[i][j]);
			}
			System.out.print("}");
			System.out.println();
		}
		System.out.println("}");
	}		
}
