package come.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo2 {
	public static void main(String[] args) {
		//���󣺲�ѯ���һ��........����Ϣ����α�ʾ�����һ��
		Date current = new java.util.Date();		
		
		Calendar c = Calendar.getInstance();
		c.setTime(current);
		//��������һ�죬�ٰ�ʱ��������Ϊ0
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);//��ʱ����Ϊ0
		c.set(Calendar.MINUTE, 0);//�ѷ�����Ϊ0
		c.set(Calendar.SECOND, 0);//��������Ϊ0
		Date endtime = c.getTime();////2017-6-19 00:00:00
		c.add(Calendar.DAY_OF_MONTH, -7);
		current = c.getTime();
		System.out.println("��ʼʱ��="+current.toLocaleString());
		System.out.println("����ʱ��="+endtime.toLocaleString()); 
	}
}
