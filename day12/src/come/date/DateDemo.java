package come.date;

//��ʾjava.util.Date��
public class DateDemo {

	public static void main(String[] args) {
		//����Date����
		java.util.Date date = new java.util.Date();
		System.out.println(date);//Sun Jun 18 21:09:44 CST 2017
		//long-->Date����
		date = new java.util.Date(System.currentTimeMillis());
		System.out.println(date);//Sun Jun 18 21:13:26 CST 2017
		//Date����-->long
		System.out.println(date.getTime());
		
		System.out.println("�й��˵ķ��" + date.toLocaleString());
		
	}

}
  