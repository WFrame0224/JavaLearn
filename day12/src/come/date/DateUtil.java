package come.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//���ڵĹ�����
public class DateUtil {
	public static final String DEFAULT_PATTERN ="yyyy.MM.dd HH:mm:ss";//
	private DateUtil(){}
	//��ʽ����������Date����-->String����
	 public static String date2string(Date date){
		 return date2string(new Date(), null);
	 }
	 public static String date2string(Date date,String pattern){
		 SimpleDateFormat sdf = new SimpleDateFormat();
		 if(pattern == null){
			 pattern = DEFAULT_PATTERN;
		 }
		 sdf.applyPattern(pattern);
		 return sdf.format(date);
	 }
	//������������String����-->Date����
	 public static Date string2date(String time) throws ParseException{
		 return string2date(time,null);
	 }
	 public static Date string2date(String time,String pattern) throws ParseException{
		 SimpleDateFormat sdf = new SimpleDateFormat();
		 if(pattern == null){
			 pattern = DEFAULT_PATTERN;
		 }
		 return  sdf.parse(time);
	 }
	 public static void main(String[] args){
		 System.out.println(date2string(new Date(), "yyyy.MM.dd HH:mm:ss"));
		 System.out.println(date2string(new Date(), "yyyy-MM-dd HH:mm:ss"));
		 System.out.println(date2string(new Date(), "yyyy/MM/dd"));
		 System.out.println(date2string(new Date(), null));
		 System.out.println(date2string(new Date()));
	 }
}
