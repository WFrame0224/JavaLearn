abstract class Device
{
	private String name;
	public abstract double getPrice();
	public Device(){}
	public Device(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void accessPartFildes(){}
}
public class AnonymousInnerClassDemo1
{
	// 创建类成员
	static int age = 20;
	int age1 = 20;
	// 传入一个Deive类型的变量
	public void test(Device d)
	{
		System.out.println("购买了一个" + d.getName() + ", 花掉了" + d.getPrice());
	}
	public static void main(String[] args) 
	{
		String var = "-----局部变量------";
		// 创建一个实例
		AnonymousInnerClassDemo1 ai = new AnonymousInnerClassDemo1();
		// 调用有参数的构造器创建Device匿名实现类的对象
		ai.test(new Device("电子示波器")
		{
			// 实现Device 的抽象方法
			public double getPrice()
			{
				return 67.8;
			}
		});
		// 调用无参数的构造器创建Device匿名实现类的对象
		Device d = new Device(){
			// 初始化块
			{
				System.out.println("匿名内部类的初始化块");
			}
			// 实现方法
			public double getPrice()
			{
				return 56.2;
			}
			// 重写父类的实例方法
			public String getName()
			{
				return "键盘";
			}
			public void accessPartFildes()
			{
				// 从java8 以前，下面的语句将出错，var 必须使用final 修饰，
				// 从java8 开始，匿名内部类允许访问非final修饰的内部变量，java8更加智能
				System.out.println(var);
				// 经过上一句话，匿名内部类访问了局部变量，该局部变量自动使用了final 修饰，因此初始化之后无法修改
				//var = "更改你";
				/**
					AnonymousInnerClassDemo1.java:56: 错误: 从内部类引用的本地变量必须是最终变量或实际上的最终变量
						var = "更改你";
						^	
					1 个错误
				 */

				System.out.println("访问的是外部类的静态成员变量" + age);
				//System.out.println("访问的是外部类的非静态成员变量" + age1);//编译错误,这是因为作用域是static 修饰的main方法，说明匿名内部类的作用域和此方法是一样的
				/**
					AnonymousInnerClassDemo1.java:71: 错误: 无法从静态上下文中引用非静态 变量 age1
								System.out.println("访问的是外部类的非静态成员变量" + age1);//编译错误
				                                       ^
										1 个错误
				 */
			}
		};
		d.accessPartFildes();
		ai.test(d);
	}
} 

