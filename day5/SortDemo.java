class SortDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{6,5,4,8,10,3,6,7,1};
		System.out.println("ԭ���飺");
		SortDemo.printArray(arr);
		System.out.println("====================");

		System.out.println("����ð������֮��Ϊ��");
		SortDemo.bubbleSort(arr);
		SortDemo.printArray(arr);
		System.out.println("--------------------");
		
		arr = new int[]{6,5,4,8,10,3,6,7,1};
		System.out.println("����ѡ������֮��Ϊ��");
		SortDemo.selectSort(arr);
		SortDemo.printArray(arr);
		System.out.println("--------------------");
	}
	/**
	ð������	1���Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
				2����ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
				3��������е�Ԫ���ظ����ϵĲ��裬�������һ����
				4������ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
	���ɣ����Կ���������N��Ԫ�أ���ôһ������ N-1 �ֱȽϣ��� M ��
	Ҫ���� N - M �αȽ�.(����6��Ԫ�أ�Ҫ����6-1�ֱȽϣ���һ�ֱȽ�6-1��
	�����ֱȽ�6-3��)
	*/
	static void bubbleSort(int[] arr)
	{
		int i = 0,j = 0;
		for (i = 1;i <= (arr.length - 1) ;i ++ )//���ѭ��Ϊ�ڼ�������
		{
			for (j = 1;j <= arr.length - i ;j ++ )//���ѭ����i�ֽ��еڼ�������
			{
				if(arr[j-1] > arr[j])
				{
					SortDemo.swap(arr,j-1,j);
				}
			}
		}
	}

	/**
	ѡ������ÿһ�δӴ����������Ԫ����ѡ����С������󣩵�һ��Ԫ�أ���������е���ʼλ�ã�
			ֱ��ȫ�������������Ԫ������//��������ķ���������������ѡ�����򣬼�д��
	���ɣ�	��һ�ֻ�ѡ�����Сֵ���ڶ��ֻ�ѡ���ڶ�С��ֵ��ֱ����󣨵�һ�ִ�arr[0]�ͺ����Ԫ�ؽ��бȽϣ�
			�ڶ��ִ�arr[1]�ͺ����Ԫ����Ƚϣ��������ƣ�
		N����Ҫ����N-1�֡�ѡ������ÿһ��ֻ����һ�ν����������ð������Ч�ʸ���
	*/
	static void selectSort(int[] arr)
	{
		int i = 0,j = 0;
		for (i = 1;i <= (arr.length - 1) ;i ++ )//���ѭ��Ϊ�ڼ�������
		{
			for (j = i;j <= (arr.length - 1);j ++ )
			{
				if(arr[i-1] >= arr[j])			//i-1ֻ��Ϊ����ȡ������Ϊ0��Ԫ��
				{
					SortDemo.swap(arr,i-1,j);
				}
			}
		}
	}
	
	//��������Ԫ�ص�ֵ
	static void swap(int[] arr,int index1,int index2)
	{
		int temp = 0;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	//��ӡ������
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
