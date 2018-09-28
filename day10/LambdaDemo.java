interface Command
{
	// 接口里定义的process方法用于封装“处理行为”
	void process(int[] target);
} 
class ProcessArray
{
	public void process(int[] target, Command cmd)
	{
		cmd.process(target);
	}
}
public class LambdaDemo
{
	public static void main(String[] args) 
	{
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4,6,4};
		// 采用匿名内部类的形式实现
		pa.process(array, new Command()
		{
			public void process(int[] target)// 因为接口中的默认方法实际全部是用public abstract 修饰的，因此方法实现也必须采用public修饰
			{
				int sum = 0;
				for(int temp : target)
				{
					sum += temp;
				}
				System.out.println("-------此处调用的方法采用匿名内部类实现------\r\n数组元素的总和是：" + sum);
			}
		});
		// 采用lambda表达式实现
		pa.process(array,(int[] target)->{
			int sum = 0;
			for(int temp : target)
			{
				sum += temp;
			}
			System.out.println("-------此处调用的方法采用Lambda表达式实现------\r\n数组元素的总和是：" + sum);
		});
		/**
			从上面的表达式可以看出：
				当使用lambda表达式代替匿名内部类创建对象时，Lambda表达式的代码块将会代替实现抽象方法的方法体，Lambda表达式就相当于一个匿名方法
				综述：Lambda表达式由三个部分组成
					1、形参列表。形参列表允许省略形参类型。如果形参列表中只有一个参数，甚至连形参列表的圆括号都可以省略
					2、箭头（->）。必须通过英文中划线号和大于符号组成
					3、代码块。如果Lambda代码块中仅有一条省略return的语句，Lambda表达式会自动返回这条语句的值
		 */
	}
}

