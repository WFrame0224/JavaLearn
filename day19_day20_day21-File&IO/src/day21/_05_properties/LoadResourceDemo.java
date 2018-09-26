package day21._05_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

//����properties�ļ�
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception {
		//����properties����
		Properties p = new Properties();
		InputStream inStream = new FileInputStream("H:/Learn/JavaLearn/workspace/day19_day20_day21-File&IO/src/db.properties");
		//�����������е�����,����֮�����ݶ��ڶ�����ȥ
		p.load(inStream);
		System.out.println(p);
		System.out.println("�˺ţ�"+ p.getProperty("username"));
		System.out.println("���룺"+ p.getProperty("password"));
	}
}
