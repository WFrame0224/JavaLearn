package _02_Map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//属性类
public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//是Map的实现类，hashtable的子类
		Properties p = new Properties();
		//key和value都是String类型
 		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		System.out.println(p);
		//根据key获取value值
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("username11", "呀！！，找不到"));
		
		//加载资源文件（IO）
		InputStream inputStream = null;
		p.load(inputStream);
	}
}
