package day21._05_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

//加载properties文件
public class LoadResourceDemo {
	public static void main(String[] args) throws Exception {
		//创建properties对象
		Properties p = new Properties();
		InputStream inStream = new FileInputStream("H:/Learn/JavaLearn/workspace/day19_day20_day21-File&IO/src/db.properties");
		//加载输入流中的数据,加载之后，数据都在对象中去
		p.load(inStream);
		System.out.println(p);
		System.out.println("账号："+ p.getProperty("username"));
		System.out.println("密码："+ p.getProperty("password"));
	}
}
