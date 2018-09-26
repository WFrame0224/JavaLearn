package day21._03_normal_IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//标准的IO操作
public class StandardIODemo {
	public static void main(String[] args) throws Exception {
		//重定向标准输入流 
		System.setIn(new FileInputStream("file/bca.txt"));
		//重新定向标准输出流，将不再打印到屏幕上
		//System.setOut(new PrintStream("file/abc.txt"));
		System.out.println("begin...");
		int data = System.in.read();//接收键盘录入的一个字节
		System.out.println("ending");
		System.out.println(data);
		System.err.println("fuck");
	}
}
 