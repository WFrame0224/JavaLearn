package day20._02_reader_writer;

import java.util.Arrays;

//����ͽ���
public class EncodingDemo {
	public static void main(String[] args) throws Exception {
		String msg = "����";
		//�������:String-->byte[]
		byte[] data = msg.getBytes("GBK");
		System.out.println(Arrays.toString(data));//[-51, -11, -73, -57]
		
		//���������byte[]-->String
		String convert_msg = new String(data,"ISO-8859-1");//��ʱ����δ���ձ��뷽ʽ��
		System.out.println(convert_msg);//�������
		//����������˵�����룺??��?
		//++++++++++++++++++++++++++++++++++++++++++++++++
		//���������
		data = convert_msg.getBytes("ISO-8859-1");//�Ȼָ�Ϊbyte����
		System.out.println(Arrays.toString(data));
		convert_msg = new String(data,"GBK");//�ٽ���byte����תΪ��Ӧ�Ľ��뷽ʽ
		System.out.println(convert_msg);
		//++++++++++++++++++++++++++++++++++++++++++++++++
		
	}
}
