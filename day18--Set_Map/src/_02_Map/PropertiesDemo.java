package _02_Map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//������
public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//��Map��ʵ���࣬hashtable������
		Properties p = new Properties();
		//key��value����String����
 		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		System.out.println(p);
		//����key��ȡvalueֵ
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("username11", "ѽ�������Ҳ���"));
		
		//������Դ�ļ���IO��
		InputStream inputStream = null;
		p.load(inputStream);
	}
}
