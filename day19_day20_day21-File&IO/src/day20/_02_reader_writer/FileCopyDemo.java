package day20._02_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

//ʹ���ļ��ַ�������ļ��Ŀ��������ı��ļ���
public class FileCopyDemo {
	public static void main(String[] args) throws Exception {
		//1:����Դ��Ŀ�����
		File srcFile = new File("file/ch.txt");
		File destFile = new File("file/ch_copy.txt");
		//2:���������������������
		Reader in = new FileReader(srcFile);
		Writer out = new FileWriter(destFile);
		//3:����д����
		char[] buffer = new char[1024];
		int len = -1;//��ʾ��ǰ��ȡ�ַ�������
		while((len = in.read(buffer)) != -1){
			out.write(buffer,0,len);
		}
		//4:�ر���
		in.close();
		out.close();
	}
}
