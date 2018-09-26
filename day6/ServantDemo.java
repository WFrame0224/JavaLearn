//它描述了菲佣类型/描述了菲佣对象{状态+行为}
class Servant
{
	String name;//名字
	int age;//年龄

	void shoping()
	{
		System.out.println("买菜。。。");
	}
	void cook()
	{
		System.out.println("做饭。。。");
	}
	void washing()
	{
		System.out.println("洗碗。。。");
	}
}
//程序员
class Coder
{
	void coding()
	{
		System.out.println("疯狂的写代码");
	}
}
//Servant类的测试
public class ServantDemo
{
	public static void main(String[] args) 
	{
		//创建一个菲佣对象
		Servant s1 = new Servant();
		//给菲佣s1起名字和设置年龄
		s1.name = "小丽";
		s1.age = 18;

		System.out.println(s1.name+"，"+s1.age);
		//指挥小丽干活
		s1.shoping();
		s1.cook();
		s1.washing();
		//创建一个程序员对象
		Coder c1 = new Coder();
		//指挥程序员写代码 
		c1.coding();
		
		//直接打印对象操作
		System.out.println("-------------");
		System.out.println(s1);
		System.out.println(c1);
		
		Servant s2 = new Servant();
		//s2 = s1;
		/*
			==号：
					1)对于基本数据类型来说，比较的是值
					2)对于引用数据类型来说，比较的是内存中的地址值
				每次new关键字，都表示在堆值中开辟了一块新的内存空间
				不同的内存空间，地址值不同
		*/
		System.out.println(s1 == s2);
		new Servant();//这是匿名对象，只开辟了内存，并未把空间地址值付给任何变量，因为没有名称，匿名对象只能使用一次
	}
} 
   
