//���Ծֲ��ڲ���
class LocalInnerClassDemo
{
	static String name = "Outter.name";
	public static void main(String[] args) 
	{
		int age = 17;//�ֲ�����

		//�ֲ��ڲ���
		class Inner                      //2���ֲ��ڲ���ֻ���ڵ�ǰ������ʹ��
		{
			String info = "INFO";
			public void test()
			{
				System.out.println(info);
				System.out.println(name);//4���ֲ��ڲ����ʵ���ڲ�����Է����ⲿ������г�Ա
				//age = 18;//jdk8���Զ���ʽ����final������ֵ���������޸�
				System.out.println(age);
			}
		}
		new Inner().test();
	}
}
/**
	�ֲ��ڲ��ࣺ�ڷ����ж�����ڲ��࣬��ɼ���Χʱ����ǰ���� �� �ֲ�������ͬһ���𣨾ֲ��ڲ��ಢû��ʲô���ã�
	�ص㣺
	1������ʹ��public��protected��private��static����
	2���ֲ��ڲ���ֻ���ڵ�ǰ������ʹ��
	3���ֲ��ڲ����ʵ���ڲ���һ�������۰�����̬��Ա
	4���ֲ��ڲ����ʵ���ڲ�����Է����ⲿ������г�Ա
	5���ֲ��ڲ�����ʵľֲ���������ʹ��final����(jdk8���Զ���ʽ����final û�д�����)
*/