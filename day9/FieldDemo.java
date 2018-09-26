class SuperClass
{
	public String name = "Super.name";
	public void doWork()
	{
		System.out.println("Super.dowork");
	}
}
class SubClass extends SuperClass
{
	public String name = "Sub,name";
	public void doWork()
	{
		System.out.println("Sub.dowork");
	}
}
//字段不存在多态特性
public class FieldDemo
{
	public static void main(String[] args) 
	{
		SuperClass clz = new SubClass();
		clz.doWork();
		System.out.println(clz.name);
		//通过对象调用字段，在编译时期就已经决定了调用那一块内存空间的数据
		//-->字段不存在覆盖的概念，在多态时，不能有多态的特征（在运行时期体现子类特征）
	}
}
