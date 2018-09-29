/**
	本程序实现Lambda表达式中对应的方法引用和构造器引用
	共计四种类型如下所示：
		   种类			    示例								说明										对应的Lambda表达式
		=======================================================================================================================
		引用类方法		类名::类方法		   函数式接口中被实现的方法的全部参数传给该类方法作为参数		(a,b,...)->类名.类方法(a,b,...)
		=======================================================================================================================
		引用特定对象     特定对象::实例方法  函数式接口中被实现的方法的全部参数传给该方法作为参数		(a,b,...)->特定对象.实例方法(a,b,...)
		的实例方法
		=======================================================================================================================
		引用某类对象     类名::实例方法      函数式接口中被实现方法的第一个参数作为调用者，后面的        (a,b,...)->a.实例方法(b,...)
		的实例方法                           参数全部传给该方法作为参数
		=======================================================================================================================
		引用构造器       类名::new          函数式接口中被实现的方法的全部参数传递给该构造器作为参数     (a,b,...)->new 类名(a,b,...)
		=======================================================================================================================
 */
//先创建函数式接口，只是包含一个抽象类方法
import javax.swing.JFrame;

@FunctionalInterface
interface Conveter
{
	// 将字符串转换为Integer的抽象方法
	Integer convert(String from);
}
@FunctionalInterface
interface Mytest
{
	// 该方法负责根据String、int、int三个参数生成一个String返回值
	String test(String a, int b, int c);
}
@FunctionalInterface
interface YourTest
{
	JFrame win(String title);
}
public class LambdaUseDemo
{
	public void FirstUse(String from, Conveter conv)
	{
		System.out.println(conv.convert(from));
	}
	public void ThirdUse(String a, int b, int c,Mytest mt)
	{
		System.out.println(mt.test(a,b,c));
	}
	public void FourthUse(String title,YourTest yt)
	{
		System.out.println(yt.win(title));
	}
	public static void main(String[] args) 
	{
		// 下面代码使用Lambda表达式创建Conveter对象
		LambdaUseDemo lamd1 = new LambdaUseDemo();
		System.out.println("采用常规的Lambda表达式方法");
		// 采用Lambda表达式创建一个Conveter对象,并没有采用“引用类方法”的模式
		Conveter converter1 = from->Integer.valueOf(from);
		lamd1.FirstUse("99",converter1);

		// 采用“引用类方法”的模式
		System.out.println("采用第一种形式：引用类方法实现");
		//引用类方法	类名::类方法	
		//函数式接口中被实现的方法的全部参数传给该类方法作为参数  隐式调用
		Conveter converter2 = Integer::valueOf;
		lamd1.FirstUse("100",converter2);

		// 采用 引用特定对象的实例方法
		System.out.println("采用第二种形式：引用特定对象的实例方法");
		//引用特定对象的实例方法     特定对象::实例方法
		//函数式接口中被实现的方法的全部参数传给该方法作为参数
		//Conveter converter3 = from ->"0123456789".indexOf(from);//Lambda表达式
		Conveter converter3 = "0123456789"::indexOf;//特定对象::实例方法
		lamd1.FirstUse("1",converter3);

		// 采用某类对象的实例方法
		//引用某类对象的实例方法     类名::实例方法
		//函数式接口中被实现方法的第一个参数作为调用者，后面的参数全部传给该方法作为参数
		System.out.println("采用第三种形式：引用某类对象的实例方法");
		//Mytest mt = (a,b,c)->a.substring(b,c);//Lambda表达式
		Mytest mt = String::substring;
		lamd1.ThirdUse("hello,I am a hero",4,10,mt);//类名::实例方法
		
		// 采用引用构造器的方法
		// 类名::new
		// 函数式接口中被实现的方法的全部参数传递给该构造器作为参数
		System.out.println("采用第四种形式：引用构造器");
		//YourTest yt = title->new JFrame(title);
		YourTest yt = JFrame::new;
		lamd1.FourthUse("hello",yt);
		
	}
}
