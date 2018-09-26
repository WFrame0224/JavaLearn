package come.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
	public static void main(String[] args) {
		//需求：查询最近一周........的信息，如何表示最近这一周
		Date current = new java.util.Date();		
		
		Calendar c = Calendar.getInstance();
		c.setTime(current);
		//把日增加一天，再把时分秒设置为0
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);//把时设置为0
		c.set(Calendar.MINUTE, 0);//把分设置为0
		c.set(Calendar.SECOND, 0);//把秒设置为0
		Date endtime = c.getTime();////2017-6-19 00:00:00
		c.add(Calendar.DAY_OF_MONTH, -7);
		current = c.getTime();
		System.out.println("开始时间="+current.toLocaleString());
		System.out.println("结束时间="+endtime.toLocaleString()); 
	}
}
