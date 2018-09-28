/**
	此程序示范了Lambda表达式的几种简化写法
 */
 @FunctionalInterface
interface Eatable
{
	void taste();
}
@FunctionalInterface
interface Flyable
{
	void fly(String weather);
}
@FunctionalInterface
interface Addable
{
	int add(int a,int b);
}
public class LambdaDemo1 
{
	// 调用该方法需要Eatable对象
	public void eat(Eatable e)//表面上看调用该方法需要一个Eatable类型的参数，但下面的程序实际传入的却是一个Lambda表达式
	{
		System.out.println(e);
		e.taste();
	}
	// 调用该方法需要Flyable对象
	public void drive(Flyable f)//表面上看调用该方法需要一个Flyable类型的参数，但下面的程序实际传入的却是一个Lambda表达式
	{
		System.out.println("我正在驾驶：" + f);
		f.fly("碧空如洗的晴日");
	}
	// 调用该方法需要Addable对象
	public void test(Addable add)//表面上看调用该方法需要一个Addable类型的参数，但下面的程序实际传入的却是一个Lambda表达式，其实际上会被当成一个“任意类型的对象
	{
		System.out.println("5与3的和为：" + add.add(5,3));
	}
	public static void main(String[] args) 
	{
		LambdaDemo1 ld1 = new LambdaDemo1();
		// Lambda表达式的代码块只有一条语句，可以省略花括号
		ld1.eat(()->System.out.println("苹果的味道不错！"));
		// Lambda表达式的形参列表只有一个形参，可以省略圆括号
		ld1.drive(weather->{
			System.out.println("今天的天气是：" + weather);
			System.out.println("直升机飞行平稳");
		});
		// Lambda表达式中的代码块只有一条语句，可以省略花括号
		// 代码块中只有一条语句，即使该表达式需要返回值，也可以省略return 关键字
		ld1.test((int a, int b)->a + b);
	}
}
/**
	Lambda表达式的类型是一种“目标类型”，Lambda表达式的目标类型 必须是 “函数式接口”，其代表包含一个抽象方法的接口。
	函数式接口可以包含多个默认方法、类方法但是只能声明一个抽象方法
	即Lambda表达式有如下两个限制：
		1，Lambda表达式的目标类型必须是明确的函数式接口；
		2，Lambda表达式只能为函数式接口创建对象。Lambda表达式只能实现一个方法，因此它只能为只有一个抽象方法的接口（函数式接口）创建对象

	为了保证Lambda表达式的目标类型是一个明确的函数式接口，可以采用如下常见的三种方式：
		1）将Lambda表达式赋值给函数式接口类型的变量
		2）将Lambda表达式作为函数式接口类型的参数传递给某方法
		3）使用函数式接口对Lambda表达式进行强制类型转换

 */
