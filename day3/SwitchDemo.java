public class SwitchDemo 
{
	public static void main(String[] args) 
	{
		int weekDay = 3;
		switch(weekDay)
		{
			case 1:System.out.println("周 1");break;
			case 2:System.out.println("周 2");break;
			case 3:System.out.println("周 3");break;
			case 4:System.out.println("周 4");break;
			case 5:System.out.println("周 5");break;
			case 6:System.out.println("周 6");break;
			case 7:System.out.println("周 7");break;
			default:System.out.println("Error!!!");break;
		}
		switch("hell")//switch 支持字符串类型的数据
		{
			case "hello":System.out.println("hello");break;
			default:System.out.println("world");break;
		}
		long a = 10;
		switch((int)a)
		{}
		/*
		boolean b = false;
		switch(b)
		{}
		*/
		
	}
}
