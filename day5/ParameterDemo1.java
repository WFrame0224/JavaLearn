//方法参数的值传递机制之基本数据类型
class ParameterDemo1 
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);
		ParameterDemo1.change(x);//传递的只是基本数据类型 值的副本，而非值本身
		System.out.println(x);
	}
	static void change(int x)
	{
		System.out.println("进入change之后x的值"+x);
		x = 50;
		System.out.println("赋值之后x的值"+x);
	}
}
