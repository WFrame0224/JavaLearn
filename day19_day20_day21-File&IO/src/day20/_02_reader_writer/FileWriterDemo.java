package day20._02_reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//�ļ����ַ������
public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
		//1:����Ŀ�����
		File destFile = new File("file/ch.txt");
		//2:�����ַ����������
		Writer out = new FileWriter(destFile,false);
		//3:д������
		/*
 		void write(int c) :����д��һ���ַ�
		void write(char[] cbuf):����д������ַ�
		void write(char[] cbuf, int off, int len):��buffer������ָ�����ַ�д��ȥ 
 		void write(String str)��ֱ������д��һ���ַ���
		*/
		//out.write(65);
		//out.write("Fream".toCharArray());
		//out.write("hell Frame !!!".toCharArray(), 5, 5);
		out.write("Frame11");
		//4:�ر���������ر�ǰҪ��ˢ��
		//out.flush();
		out.close();
	}
}
