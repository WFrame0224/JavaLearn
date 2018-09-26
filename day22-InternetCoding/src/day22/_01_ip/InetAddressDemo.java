package day22._01_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

//演示IP操作
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		//static InetAddress getByName(String host)  在给定主机名的情况下确定主机的 IP 地址
		
		//DESKTOP-QBR7B10/10.13.0.240
		InetAddress ip = InetAddress.getByName("ASUS");
		System.out.println(ip.toString());
		//获取主机名称
		System.out.println(ip.getHostName());
		//获取IP地址
		System.out.println(ip.getHostAddress());
		//static InetAddress getLocalHost() 返回本地主机 
		System.out.println(InetAddress.getLocalHost().toString());
		// boolean isReachable(int timeout) 测试是否可以达到该地址
		System.out.println(InetAddress.getLocalHost().isReachable(10000));
	}
}
