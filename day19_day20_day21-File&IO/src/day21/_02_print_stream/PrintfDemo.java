package day21._02_print_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

//java�ĸ�ʽ�����
public class PrintfDemo {
	public static void main(String[] args) throws Exception {
		//��ӡһ�仰��Ч�����������will,���䣺17
		String name = "��17";
		int age = 17;
		
		//====================================
		//��ͳ������
		String str = "������" + name+ ",���䣺" + age;
		System.out.println(str);
		//=====================================
		//��ʽ�����
		String format = "������%s,���䣺%s";
		Object[] data = {name,age};
		System.out.printf(format, data);
		System.out.println();
		System.out.printf("������%s,���䣺%s", "will",17);
		//============���ö����ӡ���ķ�ʽ================
		PrintStream ps = new PrintStream(new File("file/out.txt"));
		ps.printf("������%s,���䣺%s", "will",17);
	}
}
