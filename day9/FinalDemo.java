//final class SuperClass
/*
		---------- 编译Java ----------
	FinalDemo.java:5: 错误: 无法从最终SuperClass进行继承
	class SubClass extends SuperClass
						   ^
*/
class SuperClass
{
	//public final void doWork(){}
	private final void doWork1(){}
}
class SubClass extends SuperClass
{
	//public void doWork(){}
	
	/**
	---------- 编译Java ----------
	FinalDemo.java:14: 错误: SubClass中的doWork()无法覆盖SuperClass中的doWork()
	public void doWork(){}
	            ^
	被覆盖的方法为final 1 个错误
	*/
	public void doWork1(){}
	/**
		此时，编译时不会发生错误，因为父类中的该同名方法属于“private”类型修饰的，不允许子类访问，
	因此，此时子类的该方法是子类中自己所定义的方法
	 */
}
//final修饰符类
class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
 