//用于测试自己定义的类
class ArrayUtilDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,2,1,4,-6,8,9,7,0};
		ArrayUtil.printArray(arr);
		System.out.println("======================");
		//搜索4的索引
		//先进行排序：
		ArrayUtil.bubbleSort(arr);
		ArrayUtil.printArray(arr);
		System.out.println("----------------------");
		//搜索
		System.out.println("数组中元素为4的索引位置为："+ArrayUtil.search(arr,4));


	}
}
