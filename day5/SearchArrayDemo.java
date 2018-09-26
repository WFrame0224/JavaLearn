//数组的搜索算法：从指定数组中去搜索某一个元素的索引是多少
/**
	方式1：线性搜索（从头搜索到尾/从尾搜索到头），对于元素过多的数组，性能极低，循环次数=(N+1)/2
	方式2：二分搜索法/二分查找法，但是前提是必须是有序的数组
*/
class SearchArrayDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		int number = 7;
		int index = SearchArrayDemo.search(arr,number);
		if(index != -1)
		{
			System.out.println("陛下所查找元素 "+number+" 的位置为："+index);
		}else
		{
			System.out.println("陛下所定义的数组中没有元素"+number);
		}
	}
	static int search(int[] arr,int number)
	{
		int low = 0,high = arr.length;
		int mid = (low + high) >> 1;//右移一位 == /2
		while(low <= high)
		{
			//System.out.println(low+"----"+high);//用于查看查找过程
			if(arr[mid] > number)
			{
				high = mid-1;
				mid = (low + high) >> 1;
			}else if(arr[mid] < number)
			{
				low = mid+1;
				mid = (low + high) >> 1;
			}else
			{ 
				return mid;
			}
		}
		return -1;
	}
}
