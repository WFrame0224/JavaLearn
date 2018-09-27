// 外部类只是享有三种修饰符 public final abstract 
class Outter
{
	String name = "Outter.name";
	// 外部类的私有成员
	private String var = "private outter var";
	public void tryAccesInner()
	{
		System.out.println(new Inner().age);//3：外部类成员不能直接访问内部类的成员，必须通过内部类的实例访问；
		//System.out.println(age);
		/**
			错误
			InstanceInnerClassDemo.java:10: 错误: 找不到符号
			System.out.println(age);
							   ^
		*/
	}
	//实例内部类，可以具有类成员相同的修饰符
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
			System.out.println(var);// 直接访问外部类的私有成员，但是为了程序的可读性，建议 外部类.this.abc
			System.out.println(Outter.this.var);
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
		 // 调用包含内部类的方法
		 out.tryAccesInner();
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