package day21._02_print_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

//java的格式化输出
public class PrintfDemo {
	public static void main(String[] args) throws Exception {
		//打印一句话，效果风格：姓名：will,年龄：17
		String name = "龙17";
		int age = 17;
		
		//====================================
		//传统的做法
		String str = "姓名：" + name+ ",年龄：" + age;
		System.out.println(str);
		//=====================================
		//格式化输出
		String format = "姓名：%s,年龄：%s";
		Object[] data = {name,age};
		System.out.printf(format, data);
		System.out.println();
		System.out.printf("姓名：%s,年龄：%s", "will",17);
		//============采用对象打印流的方式================
		PrintStream ps = new PrintStream(new File("file/out.txt"));
		ps.printf("姓名：%s,年龄：%s", "will",17);
	}
}
