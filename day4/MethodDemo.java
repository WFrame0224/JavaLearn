public class  MethodDemo
{
	//�޲��޷���
	static void dowork()
	{
		System.out.println("hello");
	}
	//�޲��з���
    static String dowork1()
	{
		return "age is 17";
	}
	//�в��޷���
	static void dowork(String val)
	{
		System.out.println(val);
	}
	//�в��з���
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
