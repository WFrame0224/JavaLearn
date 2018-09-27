class Outter
{
	String name = "Outter.name";
	static String name2 = "name2";
	static class Inner//使用static修饰的内部类
	{
		int age = 17;
		static String name = "Inner.name";//3：在静态内部类中可以定义 静态内部成员 和 实例成员
		
		public void test()
		{
			System.out.println(name2);
			System.out.println(new Outter().name);
		}
	}
	public void accessStaticInnerInstatncefild()
	{
		System.out.println("此处访问的是静态内部类的实例成员 age = " + new Inner().age);
	} 
}
//演示静态内部类
public class StaticInnerClassDemo
{
	public static void main(String[] args) 
	{
		//1：静态内部类的实例不会自动持有外部类的特定实例的引用, 在创建内部类的实例时，不必创建外部类的实例
		Outter.Inner in = new Outter.Inner();//这里不同于实例内部类的new Outter().new Inner();
		in.test();
		System.out.println(Outter.Inner.name);//4：测试类可以通过完整的类名直接访问内部类的 静态成员
		new Outter().accessStaticInnerInstatncefild();
	}
}
/**
	静态内部类：使用static修饰的内部类
	特点：
	1：静态内部类的实例不会自动持有外部类的特定实例的引用, 在创建内部类的实例时，不必创建外部类的实例
	2：静态内部类可以直接访问外部类的静态成员，如果访问外部类的实例成员，必须通过外部类的实例去访问
	3：在静态内部类中可以定义 静态内部成员 和 实例成员
	4：测试类可以通过完整的类名直接访问内部类的静态成员
*/