class ControlLoopDemo 
{
	public static void main(String[] args) 
	{
	
	//break
	/*
		//从1输出到10
		for(int i = 1;i <= 10;i ++)
		{
			//如果输出7，则终止循环
			System.out.println(i);
			if(i == 7)
			{
				break;
			}
		}
		System.out.println("ending......");
	*/
	/*
		需求：求出100以内所有3的倍数，打印输出个数
		       3 6 9 12 15 ...
	*/
	/*
		int i = 1,
			num = 0;
		for(i = 1;i <= 100;i ++)
		{
			if(i % 3 == 0)
			{
				num ++;
				System.out.print(i + "\t");
			}
			if(num ==5)
			{
				break;
			}
		}
		System.out.println("\n------------------------");
		System.out.print(num);
	*/
	//continue
	/*
		int i = 1,
		num = 0;
		for(i = 1;i <= 100;i ++)
		{
			if((i == 4) || (i == 13) || (i % 3 == 0))
			{
				num ++;
				continue;	
			}
			System.out.print(i + "\t");
		}
		System.out.println("\n------------------------");
		System.out.print(num);
	*/
	//return :结束所在的方法

		int i = 1,
		num = 0;
		for(i = 1;i <= 100;i ++)
		{
			if((i == 4) || (i == 13) || (i % 3 == 0))
			{
				num ++;
				return;	//注意次方法中的后续步骤不在执行，结束方法，不同于 break
			}
			System.out.print(i + "\t");
		}
		System.out.println("\n------------------------");
		System.out.print(num);
	}
}
