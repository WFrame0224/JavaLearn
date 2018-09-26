//测试局部内部类
class LocalInnerClassDemo
{
	static String name = "Outter.name";
	public static void main(String[] args) 
	{
		int age = 17;//局部变量

		//局部内部类
		class Inner                      //2：局部内部类只能在当前方法中使用
		{
			String info = "INFO";
			public void test()
			{
				System.out.println(info);
				System.out.println(name);//4：局部内部类和实例内部类可以访问外部类的所有成员
				//age = 18;//jdk8是自动隐式加上final，变量值不可以再修改
				System.out.println(age);
			}
		}
		new Inner().test();
	}
}
/**
	局部内部类：在方法中定义的内部类，其可见范围时：当前方法 和 局部变量是同一级别（局部内部类并没有什么卵用）
	特点：
	1：不能使用public、protected、private、static修饰
	2：局部内部类只能在当前方法中使用
	3：局部内部类和实例内部类一样，不嫩包含静态成员
	4：局部内部类和实例内部类可以访问外部类的所有成员
	5：局部内部类访问的局部变量必须使用final修饰(jdk8是自动隐式加上final 没有此限制)
*/