class Outter
{
	String name = "Outter.name";
	static String name2 = "name2";
	static class Inner//ʹ��static���ε��ڲ���
	{
		int age = 17;
		static String name = "Inner.name";//3���ھ�̬�ڲ����п��Զ��� ��̬�ڲ���Ա �� ʵ����Ա
		
		public void test()
		{
			System.out.println(name2);
			System.out.println(new Outter().name);
		}
	}
	public void accessStaticInnerInstatncefild()
	{
		System.out.println("�˴����ʵ��Ǿ�̬�ڲ����ʵ����Ա age = " + new Inner().age);
	} 
}
//��ʾ��̬�ڲ���
public class StaticInnerClassDemo
{
	public static void main(String[] args) 
	{
		//1����̬�ڲ����ʵ�������Զ������ⲿ����ض�ʵ��������, �ڴ����ڲ����ʵ��ʱ�����ش����ⲿ���ʵ��
		Outter.Inner in = new Outter.Inner();//���ﲻͬ��ʵ���ڲ����new Outter().new Inner();
		in.test();
		System.out.println(Outter.Inner.name);//4�����������ͨ������������ֱ�ӷ����ڲ���� ��̬��Ա
		new Outter().accessStaticInnerInstatncefild();
	}
}
/**
	��̬�ڲ��ࣺʹ��static���ε��ڲ���
	�ص㣺
	1����̬�ڲ����ʵ�������Զ������ⲿ����ض�ʵ��������, �ڴ����ڲ����ʵ��ʱ�����ش����ⲿ���ʵ��
	2����̬�ڲ������ֱ�ӷ����ⲿ��ľ�̬��Ա����������ⲿ���ʵ����Ա������ͨ���ⲿ���ʵ��ȥ����
	3���ھ�̬�ڲ����п��Զ��� ��̬�ڲ���Ա �� ʵ����Ա
	4�����������ͨ������������ֱ�ӷ����ڲ���ľ�̬��Ա
*/