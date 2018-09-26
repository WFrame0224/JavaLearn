//�ƶ�USB�淶
interface IUSB
{
	void swapData();
}
//USB�汾���
class Mouse implements IUSB
{
	public void swapData()
	{
		System.out.println("������ƶ�");
	}
}
//USB�汾��ӡ��
class Print implements IUSB
{
	public void swapData()
	{
		System.out.println("��ӡ����ཡ�����");
	}
}
/**
//USB�汾����
class KeyBoard implements IUSB
{
	public void swapData()
	{
		System.out.println("���������롣����");
	}
}
*/
//����/ĸ��
class MotherBoard
{
	private static IUSB[] usbs = new IUSB[6];
	private static int index = 0;//��ʾ���뵽�ڼ���λ��
	//���豸���뵽�����еĹ���,����IUSB���͵Ķ���
	public static void storePluginIn(IUSB usb)
	{
		if(index == usbs.length)
		{
			System.out.println("USB����Ѿ�����");
			return;
		}
		System.out.println("��װUSB�豸");
		usbs[index] = usb;
		index ++;
	}
	public static void doWork()
	{
		for (IUSB usb : usbs)
		{
			if(usb != null)
			{
				usb.swapData();
			}		
		}
	}

}
//�����ڲ������
class AnonymousInnerClassDemo 
{
	public static void main(String[] args) 
	{
		//����������
		MotherBoard.storePluginIn(new Mouse());

		//������ӡ������
		MotherBoard.storePluginIn(new Print());

		//�������̶���
		//����һ��IUSB������ʵ������� 
		MotherBoard.storePluginIn(new IUSB()
			{
				//�����ڲ�������岿��
				public void swapData()
				{
					System.out.println("����������");
				}
			}
		);

		//��������Ĺ�����Ϊ
		MotherBoard.doWork();

	}
}
/**
	�����ڲ��ࣺһ��û�����Ƶ��ڲ��࣬�ʺ�ֻʹ��һ�ε���
		�ڿ����У��������������ֻ࣬�趨��һ�Σ�ʹ��һ�ξͿ��Զ����ˣ���ʱ����Ӧ�ðװ׶�����һ���ļ���
		��javaSE/Android ���¼������У���ͬ�İ�ť���֮��Ӧ���в�ͬ����Ӧ����������ʹ�������ڲ���
	�ص㣺
	1�������ڲ��౾��û�й����������ǻ���ø��๹����
	2�������ڲ��ྡ��û�й����������ǿ��������������ṩһ��ʵ����ʼ������飬JVM�ڵ��ø��๹�����󣬻�ִ�иô���
	3���ڲ�����˿���ʹ�ü̳���֮�⣬������ʵ�ֽӿڣ�
						��ʽ��new ���๹����([ʵ���б�]) �� �ӿ�()
							  {
								  //�����ڲ�������岿��
							  }
						ע�⣺�����ڲ������̳�һ���������ʵ��һ���ӿڣ��������ֻ��ʵ��һ���������ʵ��һ���ӿ�
*/