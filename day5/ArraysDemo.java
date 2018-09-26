import java.util.Arrays;


//测试Java自带的Arrays类
class  ArraysDemo
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,2,1,4,-6,8,9,7,0};
		int[] arr1 = {3,2,1,4,-6,8,9,7,0};

		//使用注意：
		//必须java.util.Arrays.方法(参数);这是在没有使用import 语句下采用的策略

		// 比较两个元素是否相等
		System.out.println("arr与arr1两个数组是否相等：" + Arrays.equals(arr,arr1));
		System.out.println("=====================");

		//打印出对应的数组
		String ret = Arrays.toString(arr);
		System.out.println(ret);
		System.out.println("=====================");

		//排序对应的数组--整体排序
		System.out.println("排序后的数组为：");
		//java.util.Arrays.sort(arr,2,6);  // 这种写法是没有导入java.util.Arrys类
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("=====================");

		// 寻找对应元素的索引值
		int index = Arrays.binarySearch(arr,3);
		System.out.println("元素 " + 3 + " 的索引为：" + index); 
		System.out.println("=====================");

		// 比较两个元素是否相等
		System.out.println("arr与arr1两个数组是否相等：" + Arrays.equals(arr,arr1));
		System.out.println("=====================");

		// 复制数组元素
		int[] b = Arrays.copyOf(arr1,11);
		System.out.println(Arrays.toString(b));
		System.out.println("=====================");

		// 指定索引范围赋值
		Arrays.fill(b,8,11,2);
		System.out.println(Arrays.toString(b));
		System.out.println("=====================");

		// java8 Arrays新类型的方法
		// 对数组arr1进行并发排序
		int[] brr1 = new int[]{3, -4, 25, 16, 30, 18};
		Arrays.parallelSort(brr1);
		System.out.println(Arrays.toString(brr1));

		/*
		int[] brr2 = new int[]{3, -4, 25, 16, 30, 18};
		Arrays.parallelPrefix(brr2, new IntBinaryOperator()
		{
			// left代表数组中前一个索引处的元素，计算第一个元素时，left为1
			// right 代表数组中当前索引处的元素
			public int applyAsInt(int left,int right)
			{
				return left*right;
			}
		});
		*/

	}
}
