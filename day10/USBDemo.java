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
//������
public class USBDemo 
{
	public static void main(String[] args) 
	{
		//����������
		MotherBoard.storePluginIn(new Mouse());

		//������ӡ������
		MotherBoard.storePluginIn(new Print());

		//��������Ĺ�����Ϊ
		MotherBoard.doWork();
	}
}
 