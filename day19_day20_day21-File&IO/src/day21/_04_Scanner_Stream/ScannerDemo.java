package day21._04_Scanner_Stream;

import java.io.File;
import java.util.Scanner;

//扫描器类
public class ScannerDemo {
	public static void main(String[] args) throws Exception {
		//扫描文件中的数据
		//Scanner sc = new Scanner(new File("file/stream.txt"),"GBK");
		//扫描一个字符串中的数据
		Scanner sc = new Scanner("哇，你好帅啊");
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		//扫描键盘输入的数据
		Scanner keyin = new Scanner(System.in);
		while(keyin.hasNextLine()){
			String a = keyin.nextLine();
			System.out.println("ECHO:" + a);
		}
		keyin.close();
	}
}
