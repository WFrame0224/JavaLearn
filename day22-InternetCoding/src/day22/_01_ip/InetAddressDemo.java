package day22._01_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

//��ʾIP����
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		//static InetAddress getByName(String host)  �ڸ����������������ȷ�������� IP ��ַ
		
		//DESKTOP-QBR7B10/10.13.0.240
		InetAddress ip = InetAddress.getByName("ASUS");
		System.out.println(ip.toString());
		//��ȡ��������
		System.out.println(ip.getHostName());
		//��ȡIP��ַ
		System.out.println(ip.getHostAddress());
		//static InetAddress getLocalHost() ���ر������� 
		System.out.println(InetAddress.getLocalHost().toString());
		// boolean isReachable(int timeout) �����Ƿ���Դﵽ�õ�ַ
		System.out.println(InetAddress.getLocalHost().isReachable(10000));
	}
}
