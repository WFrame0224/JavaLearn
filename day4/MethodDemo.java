public class  MethodDemo
{
	//无参无返回
	static void dowork()
	{
		System.out.println("hello");
	}
	//无参有返回
    static String dowork1()
	{
		return "age is 17";
	}
	//有参无返回
	static void dowork(String val)
	{
		System.out.println(val);
	}
	//有参有返回
    static String dowork2(String val)
	{
		System.out.println(val);
		return "age is 17";
	}

	public static void main(String[] args) 
	{
		String lable;

		System.out.println("A-----------------");
		MethodDemo.dowork();

		System.out.println("B-----------------");
		MethodDemo.dowork("I am B");

		System.out.println("C-----------------");
		lable = MethodDemo.dowork1();
		System.out.println(lable);
		
		System.out.println("D-----------------");
		lable = MethodDemo.dowork2("I am D");
		System.out.println(lable);
	}
}
