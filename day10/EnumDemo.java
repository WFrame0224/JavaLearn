/**
	枚举：是一个特殊的类，他就是固定的多个常量的集合
	定义格式：
			[修饰符] enum 类名
			{
				常量A,常量B，常量C;
			}
	注意：我们自定义的枚举类型，在编译前（底层）都是直接继承于java.lang.Enum
*/
enum Weekday
{
	MONDAY,TUESDAY,WEDNESDAY,THUSEDAY,FRIDAY,SATURDAY,SUNDAY;
}
/*
//定义一个星期几的常量类
class Weekday
{
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THUSEDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 7;
	
}//上述数据类型int不安全，可以采用下面的方法
*/
/*
class Weekday
{
	private Weekday(){}//使得数据变安全，外界只能使用下面7个对象
	public static final Weekday MONDAY = new Weekday();
	public static final Weekday TUESDAY = new Weekday();
	public static final Weekday WEDNESDAY = new Weekday();
	public static final Weekday THUSEDAY = new Weekday();
	public static final Weekday FRIDAY = new Weekday();
	public static final Weekday SATURDAY = new Weekday();
	public static final Weekday SUNDAY = new Weekday();
	
}
*/
class Employee
{
	private Weekday restday;//一周的哪一天休息

	public Weekday getRestday()
	{
		return this.restday;
	}
	public void setRestday(Weekday restday)
	{
		this.restday = restday;
	}
}
/*
class Employee
{
	private int restday;//一周的哪一天休息

	public int getRestday()
	{
		return this.restday;
	}
	public void setRestday(int restday)
	{
		this.restday = restday;
	}
}
*/
//枚举的引入 
class EnumDemo 
{
	public static void main(String[] args) 
	{
		//创建一个员工对象，并设置他哪一天休息
		Employee e = new Employee();
		e.setRestday(Weekday.WEDNESDAY);
		//-------------------------
		Weekday restday = e.getRestday();
		if(restday == Weekday.SATURDAY || restday == Weekday.SUNDAY)
		{
			System.out.println("他周末休息");
		}else
		{
			System.out.println("他工作日休息"); 
		}
		System.out.println(Weekday.SUNDAY);
		System.out.println(Weekday.SUNDAY.name());
		System.out.println(Weekday.SUNDAY.ordinal());

	}
}
