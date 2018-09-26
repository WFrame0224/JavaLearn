/*
	需求：
		int[] num = {10,20,30,10,40,50,10,60};
		1）：获取数组元素10在数组num中第一次出现的索引(FirstIndexOf)
		2）：获取数组元素10在数组num中最后一次出现的索引(LastIndexOf)
*/
class ArrayIndexDemo
{
	//获取数组元素第一次出现的索引
	static int FirstIndexOf(int[] num,int number)
	{
		int flag = 0,index = 0;
		for(int i = 0;i < num.length;i ++)
		{
			if(num[i] == number)
			{
				flag ++;
				index = i;
				break;
			}
		}
		if(flag == 0)
		{
			return -1;
		}else
		{
			return index;
		}
	}
	//获取数组元素最后一次出现的索引，此为正序寻找法
	static int LastIndexOf(int[] num,int number)
	{
		int flag = 0,index = 0;
		for(int i =0;i < num.length;i ++)
		{
			if(num[i] == number)
			{
				flag ++;
				index = i;
			}
		}
		if (flag == 0)
		{
			return -1;
		}else
		{
			return index;
		}
	}
	//获取数组元素最后一次出现的索引，此为倒序寻找法
	static int LastIndexOf1(int[] num,int number)
	{
		int flag = 0,index = 0;
		for(int i = num.length-1;i >= 0 ;i --)
		{
			if(num[i] == number)
			{
				flag ++;
				index = i;
				break;
			}
		}
		if(flag == 0)
		{
			return -1;
		}else
		{
			return index;
		}
	}

	//主方法
	public static void main(String[] args) 
	{
		int[] num = {20,30,10,40,50,10,60,10};
		//int[] num = {20,30,11,40,50,11,60,11};
		int checkNumber = 10;
		int FirIndex = ArrayIndexDemo.FirstIndexOf(num,checkNumber);
		if(FirIndex != -1)
		{
			System.out.println("元素"+ checkNumber +"第一次出现的索引为：" + FirIndex);
			System.out.println("--------------------");
		}else
		{
			System.out.println("数组中不存在元素为" + checkNumber);
			System.out.println("--------------------");
		}

		int LastIndex = ArrayIndexDemo.LastIndexOf(num,checkNumber);
		if(LastIndex != -1)
		{
			System.out.println("元素"+ checkNumber +"第一次出现的索引为：" + LastIndex);
			System.out.println("--------------------");
		}else
		{
			System.out.println("数组中不存在元素为" + checkNumber);
			System.out.println("--------------------");
		}
		System.out.println("--------‘最后索引’方法二---------");
		LastIndex = ArrayIndexDemo.LastIndexOf1(num,checkNumber);
		if(LastIndex != -1)
		{
			System.out.println("元素"+ checkNumber +"第一次出现的索引为：" + LastIndex);
			System.out.println("--------------------");
		}else
		{
			System.out.println("数组中不存在元素为" + checkNumber);
		}
		
	}
}
