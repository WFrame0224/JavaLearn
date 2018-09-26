package come.date;
/**
 * �����ࣨCalendar�����ǳ����࣬��ʾ��������Date��ǿ��
 * ������������
 * Calendar c = Calendar.getInstance();
 *  int get(int field)  ���ظ��������ֶ�(�꣬�£��գ�ʱ���֣���)��ֵ 
 */
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		//������������
		Calendar c = Calendar.getInstance();
		System.out.println("�꣺" + c.get(Calendar.YEAR));
		System.out.println("�£�" + (c.get(Calendar.MONTH) + 1));
		System.out.println("�գ�" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ��" + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�" + c.get(Calendar.MINUTE));
		System.out.println("�룺" + c.get(Calendar.SECOND));
		System.out.println("-------------------------------------");
		//Calendarת��ΪDate����
		Date d = c.getTime();
		System.out.print(d);
		//public abstract void add(int field,int amount)���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ����
		c.add(Calendar.DAY_OF_MONTH, 1000);
		System.out.print(c.getTime().toLocaleString());
		
	}

}
