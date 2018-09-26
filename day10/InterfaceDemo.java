//定义一个爬行动物接口 
interface IWalkable
{
	//IWalkable(){}//接口中没有构造器

	// 接口中的成员变量只能是静态变量 默认已经是  public static final 
	// 因而下面的语句等同于：public static final String abc = "abc";
	String abc = "abc";
	/**
		接口中定义的方法只能是：抽象方法、类方法（static修饰）、和默认方法
		因此，如果不是定义默认方法，系统将自动为普通方法增加abstract修饰符，即接口中定义普通方法时，会自动使用public abstract修饰符，因而普通方法不能有方法体
	 */
	void walk();

	//内部类
	interface ABC	//反编译工具可见，接口中定义的内部类都是公共的静态内部类，即public static interface ABC{}
	{
	}
	// 在接口中定义默认方法需要使用default修饰
	default void DEF()
	{
		System.out.println("------------hello I am default method-------------");
	}
}
//定义一个水生动物接口 
interface ISwimable
{
	// 此时等于 public abstract void swim()
	void swim();
	public static void ISCharacter()
	{
		System.out.println("--------hello I am a static method-----------");
	}
}
//定义一个两栖动物接口 
interface IAnimal extends IWalkable,ISwimable//Java中接口可以实现多继承，但是类不可以
{

}
//猫
class Cat extends Object implements IWalkable // 继承顺便实现
{
	public  void walk()//注意：接口中的方法是抽象的，所以实现类必须覆盖接口中的方法，且必须使用public修饰
	{
		System.out.println("hello Catty!!!");
	}
}
//鱼
class Fish extends Object implements ISwimable
{
	public void swim()
	{
		System.out.println("hello Fish!!!");
	}
}
//青蛙
class Frog extends Object implements IWalkable,ISwimable
{
	public  void walk()//注意：接口中的方法是抽象的，所以实现类必须覆盖接口中的方法，且必须使用public修饰
	{
		System.out.println("Wow Frog!!!");
	}
	public void swim()
	{
		System.out.println("Wow Frog!!!");
	}
}

//鳄鱼
class Crocodile extends Object implements IAnimal
{
	public  void walk()//注意：接口中的方法是抽象的，所以实现类必须覆盖接口中的方法，且必须使用public修饰
	{
		System.out.println("Watch out,Crocodile!!!");
	}
	public void swim()
	{
		System.out.println("Watch out,Crocodile!!!");
	}
}

//演示接口
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		//new IWalkable();// 错误: IWalkable是抽象的; 无法实例化
		IWalkable c = new Cat();//面向接口编程，更能体现多态特征
		//Cat c = new Cat();//此方法 应该舍弃
		c.walk();//更能体现多态特征,调用实现类中的方法
		c.DEF();
		//c.abc = "def";
		/**
			InterfaceDemo.java:77: 错误: 无法为最终变量abc分配值
				c.abc = "def";
					  ^
		 */
		ISwimable.ISCharacter();
		ISwimable f = new Fish();
		f.swim();
		
		Frog ff = new Frog();//面向接口编程时，出现问题---用什么方法，就用对应接口，两个全用，直接定义类对象的引用
		ff.walk();
		ff.swim();

		IAnimal cr = new Crocodile();//不同于上面，这里采用面向接口编程
		cr.walk();
		cr.swim();
	}
}
