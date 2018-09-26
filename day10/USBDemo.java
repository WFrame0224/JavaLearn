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
//测试类
public class USBDemo 
{
	public static void main(String[] args) 
	{
		//创建鼠标对象
		MotherBoard.storePluginIn(new Mouse());

		//创建打印机对象
		MotherBoard.storePluginIn(new Print());

		//调用主板的工作行为
		MotherBoard.doWork();
	}
}
 