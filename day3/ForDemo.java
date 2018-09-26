class ForDemo 
{
	public static void main(String[] args) 
	{
		/*
			执行顺序：
					1）：初始化语句
					2）：boolean表达式：
								true:进入第三步；
								false:跳出循环；
					3）：执行循环体
					4）；执行循环之后的操作语句
					5）：进入第二步
					注意：初始化语句只执行一次

		*/
		
		int i = 0,sum = 0;
		for(i = 0;i < 5;i ++)
		{
			System.out.println("Hello World!");
		}
		System.out.println("====================");

		for(i = 1;i <= 100;i ++)
		{
			System.out.println(i);
		}
		System.out.println("====================");

		for(i = 1;i <= 100;i ++)
		{
			sum += i;
		}
		System.out.println("sum = "+ sum +", i = "+ i );
		System.out.println("====================");	

	}
}
