//制定USB规范
interface IUSB
{
	void swapData();
}
//USB版本鼠标
class Mouse implements IUSB
{
	public void swapData()
	{
		System.out.println("鼠标在移动");
	}
}
//USB版本打印机
class Print implements IUSB
{
	public void swapData()
	{
		System.out.println("打印，嘟嘟嘟。。。");
	}
}
/**
//USB版本键盘
class KeyBoard implements IUSB
{
	public void swapData()
	{
		System.out.println("键盘在输入。。。");
	}
}
*/
//主板/母板
class MotherBoard
{
	private static IUSB[] usbs = new IUSB[6];
	private static int index = 0;//表示插入到第几个位置
	//把设备插入到主板中的功能,接收IUSB类型的对象
	public static void storePluginIn(IUSB usb)
	{
		if(index == usbs.length)
		{
			System.out.println("USB插槽已经满了");
			return;
		}
		System.out.println("安装USB设备");
		usbs[index] = usb;
		index ++;
	}
	public static void doWork()
	{
		for (IUSB usb : usbs)
		{
			if(usb != null)
			{
				usb.swapData();
			}		
		}
	}

}
//匿名内部类测试
class AnonymousInnerClassDemo 
{
	public static void main(String[] args) 
	{
		//创建鼠标对象
		MotherBoard.storePluginIn(new Mouse());

		//创建打印机对象
		MotherBoard.storePluginIn(new Print());

		//创建键盘对象
		//创建一个IUSB的匿名实现类对象 
		MotherBoard.storePluginIn(new IUSB()
			{
				//匿名内部类的类体部分
				public void swapData()
				{
					System.out.println("键盘在输入");
				}
			}
		);

		//调用主板的工作行为
		MotherBoard.doWork();

	}
}
/**
	匿名内部类：一个没有名称的内部类，适合只使用一次的类
		在开发中，经常有这样的类，只需定义一次，使用一次就可以丢弃了，此时：不应该白白定义在一个文件中
		在javaSE/Android 的事件处理中：不同的按钮点击之后应该有不同的响应操作，首先使用匿名内部类
	特点：
	1：匿名内部类本身没有构造器，但是会调用父类构造器
	2：匿名内部类尽管没有构造器，但是可以在匿名类中提供一段实例初始化代码块，JVM在调用父类构造器后，会执行该代码
	3：内部类除了可以使用继承类之外，还可以实现接口：
						格式：new 父类构造器([实参列表]) 或 接口()
							  {
								  //匿名内部类的类体部分
							  }
						注意：匿名内部类必须继承一个父类或者实现一个接口，但是最多只能实现一个父类或是实现一个接口
*/