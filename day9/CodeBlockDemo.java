class CodeBlockDemo 
{
	{
		System.out.println("初始化代码块");
	}
	/**
		以上为初始化代码块，每次创建对象时都会执行初始化代码块:
			每次创建对象都会调用构造器，在调用构造器之前，会执行本类中的初始化代码块
		通过反编译工具，初始化代码块也作为构造器的最初语句
		-->一般初始化代码块没有什么卵用
	*/
	CodeBlockDemo()
	{
		System.out.println("构造器。。。");
	}

	static
	{
		System.out.println("静态代码块...\r\n");
	}
	/**结果表明，在主方法执行之前执行静态代码块，而且只执行一次
		因为：静态成员随着字节码的加载也加进JVM，此时Main方法还未执行，
		因方法需要JVM调用，先把字节码加载进JVM，而后JVM再调用main方法
		一般的，我们用来做初始化操作，加载资源，加载配置文件等 
	*/

	public static void main(String[] args) 
	{
		/**
		{ 
			//局部代码块
			int age = 27;
			System.out.println(age);
		}
		//System.out.println(age);//词语局访问不到局部代码块，age
		*/
		
		System.out.println("进入main方法");
		//创建三个CodeBlockDemo对象
		new CodeBlockDemo();
		new CodeBlockDemo();
		new CodeBlockDemo();
	}

}
