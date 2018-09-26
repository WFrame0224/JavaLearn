//演示包装类：装箱和拆箱操作
public class  IntegerDemo
{
	public static void main(String[] args) 
	{
		//装箱操作：把一个基本类的值，转换为对应包装类型的对象
		//方式1
		Integer num1 = new Integer(15);
		System.out.println(num1);
		//方式2
		Integer num2 = Integer.valueOf(17);
		System.out.println(num2);
		System.out.println("----------拆箱-------------");
		//拆箱操作：把包装类的对象，转换为基本类型的变量
		System.out.println(num1.intValue());
		System.out.println(num2.intValue());
		/****************************/
		//自动装箱：可以直接把一个基本类型的值赋给对应的包装类对象
		Integer num3 = 17;
		System.out.println(num3.intValue());
		switch(num3)
		{
			case 1:break;
			case 2:break;
			case 10:break;
			default :break;
		}
		//自动拆箱：可以直接把一个包装类对象赋给对应的基本类型变量
		int num4 = num3;
		

	}
}
/**
	解释：Object obj = 17;
	1）：自动装箱 Integer i = 17;
	2）：引用的自动类型转换，把子类对象赋给父类变量 Object obj = i;
	--> Object可以接收一切类型的值
		Object数组：Object[]该数组可以装一切数据类型
		Object[] arr = {"A",12,12.34,true};
*/