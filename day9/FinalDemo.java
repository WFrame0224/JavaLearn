//final class SuperClass
/*
		---------- ����Java ----------
	FinalDemo.java:5: ����: �޷�������SuperClass���м̳�
	class SubClass extends SuperClass
						   ^
*/
class SuperClass
{
	//public final void doWork(){}
	private final void doWork1(){}
}
class SubClass extends SuperClass
{
	//public void doWork(){}
	
	/**
	---------- ����Java ----------
	FinalDemo.java:14: ����: SubClass�е�doWork()�޷�����SuperClass�е�doWork()
	public void doWork(){}
	            ^
	�����ǵķ���Ϊfinal 1 ������
	*/
	public void doWork1(){}
	/**
		��ʱ������ʱ���ᷢ��������Ϊ�����еĸ�ͬ���������ڡ�private���������εģ�������������ʣ�
	��ˣ���ʱ����ĸ÷������������Լ�������ķ���
	 */
}
//final���η���
class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
 