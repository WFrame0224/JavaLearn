package come.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
*DateFormat 转换的格式是固定的，我想根据自己的风格来做转换。
*	自定义格式：比如说：2016-04-16 15:50:48
*			     比如说：2016/04/16 15:50:48
*SimpleDateFormate类：是DateFormat的子类，支持自定义格式模式
*/
public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		//自定义日期模式
		String pattern  = "yyyy.MM.dd HH:mm:ss E a";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);//申请使用哪一种时间模式
		//格式化
		String time = sdf.format(new java.util.Date());
		System.out.println(time);
		//解析,使用什么风格格式化的，必须用什么格式解析回去
		java.util.Date date = sdf.parse(time);
		System.out.println(date);
	}

}
