package come.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
*DateFormat ת���ĸ�ʽ�ǹ̶��ģ���������Լ��ķ������ת����
*	�Զ����ʽ������˵��2016-04-16 15:50:48
*			     ����˵��2016/04/16 15:50:48
*SimpleDateFormate�ࣺ��DateFormat�����֧࣬���Զ����ʽģʽ
*/
public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		//�Զ�������ģʽ
		String pattern  = "yyyy.MM.dd HH:mm:ss E a";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);//����ʹ����һ��ʱ��ģʽ
		//��ʽ��
		String time = sdf.format(new java.util.Date());
		System.out.println(time);
		//����,ʹ��ʲô����ʽ���ģ�������ʲô��ʽ������ȥ
		java.util.Date date = sdf.parse(time);
		System.out.println(date);
	}

}
