package day21._03_normal_IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//��׼��IO����
public class StandardIODemo {
	public static void main(String[] args) throws Exception {
		//�ض����׼������ 
		System.setIn(new FileInputStream("file/bca.txt"));
		//���¶����׼������������ٴ�ӡ����Ļ��
		//System.setOut(new PrintStream("file/abc.txt"));
		System.out.println("begin...");
		int data = System.in.read();//���ռ���¼���һ���ֽ�
		System.out.println("ending");
		System.out.println(data);
		System.err.println("fuck");
	}
}
 