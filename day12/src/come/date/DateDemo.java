package come.date;

//演示java.util.Date类
public class DateDemo {

	public static void main(String[] args) {
		//创建Date对象
		java.util.Date date = new java.util.Date();
		System.out.println(date);//Sun Jun 18 21:09:44 CST 2017
		//long-->Date对象
		date = new java.util.Date(System.currentTimeMillis());
		System.out.println(date);//Sun Jun 18 21:13:26 CST 2017
		//Date对象-->long
		System.out.println(date.getTime());
		
		System.out.println("中国人的风格：" + date.toLocaleString());
		
	}

}
  