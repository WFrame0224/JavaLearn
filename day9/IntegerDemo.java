//��ʾ��װ�ࣺװ��Ͳ������
public class  IntegerDemo
{
	public static void main(String[] args) 
	{
		//װ���������һ���������ֵ��ת��Ϊ��Ӧ��װ���͵Ķ���
		//��ʽ1
		Integer num1 = new Integer(15);
		System.out.println(num1);
		//��ʽ2
		Integer num2 = Integer.valueOf(17);
		System.out.println(num2);
		System.out.println("----------����-------------");
		//����������Ѱ�װ��Ķ���ת��Ϊ�������͵ı���
		System.out.println(num1.intValue());
		System.out.println(num2.intValue());
		/****************************/
		//�Զ�װ�䣺����ֱ�Ӱ�һ���������͵�ֵ������Ӧ�İ�װ�����
		Integer num3 = 17;
		System.out.println(num3.intValue());
		switch(num3)
		{
			case 1:break;
			case 2:break;
			case 10:break;
			default :break;
		}
		//�Զ����䣺����ֱ�Ӱ�һ����װ����󸳸���Ӧ�Ļ������ͱ���
		int num4 = num3;
		

	}
}
/**
	���ͣ�Object obj = 17;
	1�����Զ�װ�� Integer i = 17;
	2�������õ��Զ�����ת������������󸳸�������� Object obj = i;
	--> Object���Խ���һ�����͵�ֵ
		Object���飺Object[]���������װһ����������
		Object[] arr = {"A",12,12.34,true};
*/