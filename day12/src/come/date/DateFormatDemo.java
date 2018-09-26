package come.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *  DateFormate：可以完成日期的格式化操作：
 *  				格式化（format）：Date类型对象--->String类型：public final String format(Date date)
 *  				解    析（parse）：String类型时间--->Date类型：Date parse(String source) 
 *---------------------------------------------------------------------------------------------------
 *DateFormat 转换的格式是固定的，我想根据自己的风格来做转换。
 *	自定义格式：比如说：2016-04-16 15:50:48
 *			     比如说：2016/04/16 15:50:48
 *SimpleDateFormate类：是DateFormat的子类，支持自定义格式模式
 */			 
public class DateFormatDemo {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);//Sun Jun 18 21:28:57 CST 2017
		//格式化操作 Date类型对象--->String类型
		DateFormat df = DateFormat.getInstance();//默认SHORT风格
		String time = df.format(d);
		System.out.println(time);//2017-6-18
		df = DateFormat.getDateInstance(DateFormat.SHORT);//17-6-18
		System.out.println(df.format(d));
		df = DateFormat.getDateInstance(DateFormat.LONG);//2017年6月18日
		System.out.println(df.format(d));
		
		df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT);//2017年6月18日 下午9:43
		System.out.println(df.format(d));
		System.out.println("-----------------------------------");
		
		//解析操作：String类型时间--->Date类型
		df = DateFormat.getInstance();//默认SHORT风格
		time = df.format(d);
		//System.out.println(df.format(d));
		
		Date d2 = df.parse(time);
		System.out.println(d2);
	}

}
