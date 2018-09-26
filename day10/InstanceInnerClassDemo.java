class Outter
{
	String name = "Outter.name";
	public void tryAccesInner()
	{
		System.out.println(new Inner().age);//3：外部类成员不能直接访问内部类的成员，必须通过内部类的实例访问；
	}
	//实例内部类
	class Inner
	{
		//4：实例内部类不能定义静态成员，只能定义实例成员,非static的
		 int age = 17;
		String name = "Inner.name";
		 public void test()
		{
			String name = "Local.name";
			System.out.println(name);//访问方法内的局部成员变量
			System.out.println(this.name);//访问内部类的同名成员变量
			System.out.println(Outter.this.name);//访问外部类的同名成员变量的方法
		 }
	}
}
//实例内部类的演示
class InstanceInnerClassDemo
{
	public static void main(String[] args) 
	{
		//1：创建实例内部类之前，必须存在外部类对象，通过外部类对象创建内部类对象（当存在内部类对象时一定存在外部类对象）
		//创建Inner的对象
		 Outter out = new Outter();
		 Outter.Inner in = out.new Inner();//也可以写为：Outter.Inner in = new Outter().new Inner();
		 System.out.println(in);
		 in.test();
	}
}
/**
	特点：
		1：创建实例内部类之前，必须存在外部类对象，通过外部类对象创建内部类对象（当存在内部类对象时一定存在外部类对象）
		2：实例内部类的实例自动持有外部类实例的引用，内部类成员可以直接访问外部类成员；
		3：外部类成员不能直接访问内部类的成员，必须通过内部类的实例访问；
		4：实例内部类不能定义静态成员，只能定义实例成员
		5：如果实例内部类和外部类存在同名的字段或方法abc，那么内部类中：
											this.abc：表示访问内部类成员
											外部类.this.abc：表示访问外部类成员
*/