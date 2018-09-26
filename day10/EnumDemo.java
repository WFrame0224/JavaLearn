/**
	ö�٣���һ��������࣬�����ǹ̶��Ķ�������ļ���
	�����ʽ��
			[���η�] enum ����
			{
				����A,����B������C;
			}
	ע�⣺�����Զ����ö�����ͣ��ڱ���ǰ���ײ㣩����ֱ�Ӽ̳���java.lang.Enum
*/
enum Weekday
{
	MONDAY,TUESDAY,WEDNESDAY,THUSEDAY,FRIDAY,SATURDAY,SUNDAY;
}
/*
//����һ�����ڼ��ĳ�����
class Weekday
{
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THUSEDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 7;
	
}//������������int����ȫ�����Բ�������ķ���
*/
/*
class Weekday
{
	private Weekday(){}//ʹ�����ݱ䰲ȫ�����ֻ��ʹ������7������
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
	private Weekday restday;//һ�ܵ���һ����Ϣ

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
	private int restday;//һ�ܵ���һ����Ϣ

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
//ö�ٵ����� 
class EnumDemo 
{
	public static void main(String[] args) 
	{
		//����һ��Ա�����󣬲���������һ����Ϣ
		Employee e = new Employee();
		e.setRestday(Weekday.WEDNESDAY);
		//-------------------------
		Weekday restday = e.getRestday();
		if(restday == Weekday.SATURDAY || restday == Weekday.SUNDAY)
		{
			System.out.println("����ĩ��Ϣ");
		}else
		{
			System.out.println("����������Ϣ"); 
		}
		System.out.println(Weekday.SUNDAY);
		System.out.println(Weekday.SUNDAY.name());
		System.out.println(Weekday.SUNDAY.ordinal());

	}
}
