package day21._04_Scanner_Stream;

import java.io.File;
import java.util.Scanner;

//ɨ������
public class ScannerDemo {
	public static void main(String[] args) throws Exception {
		//ɨ���ļ��е�����
		//Scanner sc = new Scanner(new File("file/stream.txt"),"GBK");
		//ɨ��һ���ַ����е�����
		Scanner sc = new Scanner("�ۣ����˧��");
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		//ɨ��������������
		Scanner keyin = new Scanner(System.in);
		while(keyin.hasNextLine()){
			String a = keyin.nextLine();
			System.out.println("ECHO:" + a);
		}
		keyin.close();
	}
}
