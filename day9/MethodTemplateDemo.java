//采用模板的设计方法
abstract class OperateTimeTemplate
{
	final public long getTotalTime()//子类只能调用，不可以修改，采用final 关键字修饰
	{
		long begin = System.currentTimeMillis();//开始时间
		
		//具体操作（留给子类完成）
		this.SetNum();//实际调用的是子类覆写的方法

		long end = System.currentTimeMillis();//结束时间 
		return end - begin;//时间差
	}
	//具体操作，子类必须覆盖，定义为抽象类
	abstract public void SetNum();
}
class StringOperate extends OperateTimeTemplate
{
	public void SetNum()
	{
		String str = "";
		for (int i = 0;i < 10000;i ++)
		{
			str += i;
		}
	}
}
//统计int相加10000次的时间差
class IntOperate extends OperateTimeTemplate
{
	public void SetNum()
	{
		double sum = 0;
		for (int i = 0;i < 1000000;i ++)
		{
			sum += i;
		}
	}
}
/*
//统计String连接10000次时间差
class StringOperate
{
	public long doWork()
	{
		long begin = System.currentTimeMillis();//开始时间
		String str = "";
		for (int i = 0;i < 10000;i ++)
		{
			str += i;
		}
		long end = System.currentTimeMillis();//结束时间

		return end - begin;//时间差
	}
}
//统计int相加10000次的时间差
class IntOperate
{
	public long doWork()
	{
		long begin = System.currentTimeMillis();//开始时间
		double sum = 0;
		for (int i = 0;i < 1000000;i ++)
		{
			sum += i;
		}
		long end = System.currentTimeMillis();//结束时间

		return end - begin;//时间差
	}
}
*/
class MethodTemplateDemo 
{
	public static void main(String[] args) 
	{
		//统计String连接10000次和int相加10000次的时间差
		//System.out.println("统计String连接10000次时间："+new StringOperate().doWork());
		//System.out.println("统计String连接10000次时间："+new IntOperate().doWork());
		
		System.out.println("统计String连接10000次时间："+new StringOperate().getTotalTime());
		System.out.println("统计String连接10000次时间："+new IntOperate().getTotalTime());
	}
}
/**
	模板方法设计模式：在父类中的一个方法中定义了一个总体算法的骨架（模板方法），而将某些
	步骤延迟到子类中，因为不同的子类实现细节不同。模板方法使得子类可以在不改变算法结构的情况下
	重新定义算法中的某些步骤
	-----------------------------------------------------------------------------------------------
	抽象父类负责定义操作中的业务骨架，而把一些具体的实现步骤延迟到子类中去实现。
	抽象父类至少提供的方法：
		模板方法：一种通用的处理方式，即模板（总体的算法骨架）；
		抽象方法：一种具有的业务功能实现，由子类完成；
		注意：抽象父类提供的模板方法只是定义了一个通用算法，其实现必须依赖子类的辅助
		模板方法作为模板样式不准子类覆写
*/