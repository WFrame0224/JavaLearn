class SuperClass
{
	public String name = "Super.name";
	public void doWork()
	{
		System.out.println("Super.dowork");
	}
}
class SubClass extends SuperClass
{
	public String name = "Sub,name";
	public void doWork()
	{
		System.out.println("Sub.dowork");
	}
}
//�ֶβ����ڶ�̬����
public class FieldDemo
{
	public static void main(String[] args) 
	{
		SuperClass clz = new SubClass();
		clz.doWork();
		System.out.println(clz.name);
		//ͨ����������ֶΣ��ڱ���ʱ�ھ��Ѿ������˵�����һ���ڴ�ռ������
		//-->�ֶβ����ڸ��ǵĸ���ڶ�̬ʱ�������ж�̬��������������ʱ����������������
	}
}
