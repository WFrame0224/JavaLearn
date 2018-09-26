class GetArrayMaxOrMinDemo 
{
	//求数组的最大值，并且返回该值
	static int arrayMax(int[] num)
	{
		int Max = num[0];
		for(int i = 1;i < num.length;i++)
		{
			if(Max < num[i])
			{
				Max = num[i];
			}
		}
		return Max;
	}
	//求数组的最小值，并且返回该值
	static int arrayMin(int[] num)
	{
		int Min = num[0];
		for(int i = 1;i < num.length;i++)
		{
			if(Min > num[i])
			{
				Min = num[i];
			}
		}
		return Min;
	}
	public static void main(String[] args) 
	{
		int[] num = new int[]{1,-9,-2,6,4,5,3,8,7,0};
		int retMax = GetArrayMaxOrMinDemo.arrayMax(num);
		System.out.println("数组的最大值为：" + retMax);
		int retMin = GetArrayMaxOrMinDemo.arrayMin(num);
		System.out.println("数组的最小值为：" + retMin);

	}
}
