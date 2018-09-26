class SortDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{6,5,4,8,10,3,6,7,1};
		System.out.println("原数组：");
		SortDemo.printArray(arr);
		System.out.println("====================");

		System.out.println("经过冒泡排序之后为：");
		SortDemo.bubbleSort(arr);
		SortDemo.printArray(arr);
		System.out.println("--------------------");
		
		arr = new int[]{6,5,4,8,10,3,6,7,1};
		System.out.println("经过选择排序之后为：");
		SortDemo.selectSort(arr);
		SortDemo.printArray(arr);
		System.out.println("--------------------");
	}
	/**
	冒泡排序：	1）比较相邻的元素。如果第一个比第二个大，就交换他们两个。
				2）对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
				3）针对所有的元素重复以上的步骤，除了最后一个。
				4）持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	规律：可以看出，若有N个元素，那么一共进行 N-1 轮比较，第 M 轮
	要进行 N - M 次比较.(若有6个元素，要进行6-1轮比较，第一轮比较6-1次
	第三轮比较6-3次)
	*/
	static void bubbleSort(int[] arr)
	{
		int i = 0,j = 0;
		for (i = 1;i <= (arr.length - 1) ;i ++ )//这个循环为第几轮排序
		{
			for (j = 1;j <= arr.length - i ;j ++ )//这个循环第i轮进行第几次排序
			{
				if(arr[j-1] > arr[j])
				{
					SortDemo.swap(arr,j-1,j);
				}
			}
		}
	}

	/**
	选择排序：每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，
			直到全部待排序的数据元素排完//但是下面的方法并不是真正的选择排序，简写版
	规律：	第一轮会选择出最小值，第二轮会选出第二小的值，直到最后（第一轮从arr[0]和后面的元素进行比较，
			第二轮从arr[1]和后面的元素相比较，依次类推）
		N个数要进行N-1轮。选择排序每一轮只进行一次交换，相对于冒泡排序效率更好
	*/
	static void selectSort(int[] arr)
	{
		int i = 0,j = 0;
		for (i = 1;i <= (arr.length - 1) ;i ++ )//这个循环为第几轮排序
		{
			for (j = i;j <= (arr.length - 1);j ++ )
			{
				if(arr[i-1] >= arr[j])			//i-1只是为可以取到索引为0的元素
				{
					SortDemo.swap(arr,i-1,j);
				}
			}
		}
	}
	
	//交换两个元素的值
	static void swap(int[] arr,int index1,int index2)
	{
		int temp = 0;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
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
