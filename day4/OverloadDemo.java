//方法重载设计
class  OverloadDemo
{
	//求两个整数之和
	static int getSum(int a,int b)
	{
		return a+b;
	}
	//求两个小数之和
	static double getSum(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(OverloadDemo.getSum(1,3));

		System.out.println(OverloadDemo.getSum(1.0,3.0));
	}
}
