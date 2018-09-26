//����ģ�����Ʒ���
abstract class OperateTimeTemplate
{
	final public long getTotalTime()//����ֻ�ܵ��ã��������޸ģ�����final �ؼ�������
	{
		long begin = System.currentTimeMillis();//��ʼʱ��
		
		//�������������������ɣ�
		this.SetNum();//ʵ�ʵ��õ������าд�ķ���

		long end = System.currentTimeMillis();//����ʱ�� 
		return end - begin;//ʱ���
	}
	//���������������븲�ǣ�����Ϊ������
	abstract public void SetNum();
}
class StringOperate extends OperateTimeTemplate
{
	public void SetNum()
	{
		String str = "";
		for (int i = 0;i < 10000;i ++)
		{
			str += i;
		}
	}
}
//ͳ��int���10000�ε�ʱ���
class IntOperate extends OperateTimeTemplate
{
	public void SetNum()
	{
		double sum = 0;
		for (int i = 0;i < 1000000;i ++)
		{
			sum += i;
		}
	}
}
/*
//ͳ��String����10000��ʱ���
class StringOperate
{
	public long doWork()
	{
		long begin = System.currentTimeMillis();//��ʼʱ��
		String str = "";
		for (int i = 0;i < 10000;i ++)
		{
			str += i;
		}
		long end = System.currentTimeMillis();//����ʱ��

		return end - begin;//ʱ���
	}
}
//ͳ��int���10000�ε�ʱ���
class IntOperate
{
	public long doWork()
	{
		long begin = System.currentTimeMillis();//��ʼʱ��
		double sum = 0;
		for (int i = 0;i < 1000000;i ++)
		{
			sum += i;
		}
		long end = System.currentTimeMillis();//����ʱ��

		return end - begin;//ʱ���
	}
}
*/
class MethodTemplateDemo 
{
	public static void main(String[] args) 
	{
		//ͳ��String����10000�κ�int���10000�ε�ʱ���
		//System.out.println("ͳ��String����10000��ʱ�䣺"+new StringOperate().doWork());
		//System.out.println("ͳ��String����10000��ʱ�䣺"+new IntOperate().doWork());
		
		System.out.println("ͳ��String����10000��ʱ�䣺"+new StringOperate().getTotalTime());
		System.out.println("ͳ��String����10000��ʱ�䣺"+new IntOperate().getTotalTime());
	}
}
/**
	ģ�巽�����ģʽ���ڸ����е�һ�������ж�����һ�������㷨�ĹǼܣ�ģ�巽����������ĳЩ
	�����ӳٵ������У���Ϊ��ͬ������ʵ��ϸ�ڲ�ͬ��ģ�巽��ʹ����������ڲ��ı��㷨�ṹ�������
	���¶����㷨�е�ĳЩ����
	-----------------------------------------------------------------------------------------------
	�����ฺ��������е�ҵ��Ǽܣ�����һЩ�����ʵ�ֲ����ӳٵ�������ȥʵ�֡�
	�����������ṩ�ķ�����
		ģ�巽����һ��ͨ�õĴ���ʽ����ģ�壨������㷨�Ǽܣ���
		���󷽷���һ�־��е�ҵ����ʵ�֣���������ɣ�
		ע�⣺�������ṩ��ģ�巽��ֻ�Ƕ�����һ��ͨ���㷨����ʵ�ֱ�����������ĸ���
		ģ�巽����Ϊģ����ʽ��׼���าд
*/