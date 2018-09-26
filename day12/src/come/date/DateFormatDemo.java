package come.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *  DateFormate������������ڵĸ�ʽ��������
 *  				��ʽ����format����Date���Ͷ���--->String���ͣ�public final String format(Date date)
 *  				��    ����parse����String����ʱ��--->Date���ͣ�Date parse(String source) 
 *---------------------------------------------------------------------------------------------------
 *DateFormat ת���ĸ�ʽ�ǹ̶��ģ���������Լ��ķ������ת����
 *	�Զ����ʽ������˵��2016-04-16 15:50:48
 *			     ����˵��2016/04/16 15:50:48
 *SimpleDateFormate�ࣺ��DateFormat�����֧࣬���Զ����ʽģʽ
 */			 
public class DateFormatDemo {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);//Sun Jun 18 21:28:57 CST 2017
		//��ʽ������ Date���Ͷ���--->String����
		DateFormat df = DateFormat.getInstance();//Ĭ��SHORT���
		String time = df.format(d);
		System.out.println(time);//2017-6-18
		df = DateFormat.getDateInstance(DateFormat.SHORT);//17-6-18
		System.out.println(df.format(d));
		df = DateFormat.getDateInstance(DateFormat.LONG);//2017��6��18��
		System.out.println(df.format(d));
		
		df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT);//2017��6��18�� ����9:43
		System.out.println(df.format(d));
		System.out.println("-----------------------------------");
		
		//����������String����ʱ��--->Date����
		df = DateFormat.getInstance();//Ĭ��SHORT���
		time = df.format(d);
		//System.out.println(df.format(d));
		
		Date d2 = df.parse(time);
		System.out.println(d2);
	}

}
