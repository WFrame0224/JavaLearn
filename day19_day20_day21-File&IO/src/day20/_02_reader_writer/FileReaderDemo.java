package day20._02_reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//�ļ����ַ�������
public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		//1:����Դ
		File srcFile = new File("file/ch.txt");
		//2:����������
		Reader in = new FileReader(srcFile);
		//3:��ȡ����
			/*
			1�� int reader():ÿ��ֻ��ȡһ���ַ�����ȡ��ĩβ���ص�-1
			2�� int read(char[] buffer):ÿ�ζ�ȡ����ַ����Ѷ�ȡ���ַ��洢��buffer�����У���ȡ��ĩβ������-1 
			 */
		/*1��
			int ch = 0;
			while((ch = in.read()) > 0){
				System.out.print((char)ch);
			}
		*/
		char[] buffer = new char[5];//ÿ��ֻ�ܶ�ȡ5���ַ�
		int len = -1;//��ʾ��ǰ��ȡ�ַ�������
		while((len = in.read(buffer)) > 0){
			System.out.print(buffer);
		}
		//4:�ر���
		in.close();
	}
}
