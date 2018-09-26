package come.date;
/**
 * 日历类（Calendar）：是抽象类，表示日历，比Date更强大
 * 创建日历对象：
 * Calendar c = Calendar.getInstance();
 *  int get(int field)  返回给定日历字段(年，月，日，时，分，秒)的值 
 */
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		//创建日历对象
		Calendar c = Calendar.getInstance();
		System.out.println("年：" + c.get(Calendar.YEAR));
		System.out.println("月：" + (c.get(Calendar.MONTH) + 1));
		System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("时：" + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("分：" + c.get(Calendar.MINUTE));
		System.out.println("秒：" + c.get(Calendar.SECOND));
		System.out.println("-------------------------------------");
		//Calendar转换为Date类型
		Date d = c.getTime();
		System.out.print(d);
		//public abstract void add(int field,int amount)根据日历的规则，为给定的日历字段添加或减去指定的时间量
		c.add(Calendar.DAY_OF_MONTH, 1000);
		System.out.print(c.getTime().toLocaleString());
		
	}

}
