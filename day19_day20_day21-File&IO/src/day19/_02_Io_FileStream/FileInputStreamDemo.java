package day19._02_Io_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

//��ʾ�ļ��ֽ�������
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		// 1:����Դ
		File f = new File("file/stream.txt");
		// 2:�����ļ��ֽ����������󣬲�����Դ��
		InputStream input = new FileInputStream(f);
		// 3:����Ķ�ȡ����
		/*
		 *  ע�⣺�����ȡ�����û�����ݵ�ʱ�򣬾ͷ���-1
		 	int read()	:��ȡһ���ֽ�,���ض�ȡ���ֽ� 
			int read(byte[] b):�洢����ֽڣ����洢��B�����У�������b������Ϊ0��λ�ÿ�ʼ��,���ض�ȡ�˼����ֽ�
			int read(byte[] b,int off,int len):�洢����ֽڣ����洢��B������,�������off����λ�ÿ�ʼ����ȡlen���ֽ�
		 */
		/*1
		for(int i = 0; i < 9;i ++){
			System.out.println(input.read());
		}
		*/
		/*2
		byte[] buffer = new byte[10];
		System.out.println(Arrays.toString(buffer));
		int len = input.read(buffer);
		System.out.println(Arrays.toString(buffer));
		String str = new String(buffer,0,len);
		System.out.println(str);
		*/
		/*
		byte[] buffer = new byte[10];
		System.out.println(Arrays.toString(buffer));
		int len = input.read(buffer, 0, 6);
		System.out.println(Arrays.toString(buffer));
		String str = new String(buffer,0,len);
		System.out.println(str);
		*/
		byte[] buffer = new byte[10];
		int len = -1;//��ʾ��ǰ��ȡ���ֽ����������Ϊ-1����ʾ��ȡ��ĩβ��
		while(((len = input.read(buffer)) != -1)){//ȫ����ȡ�ļ��е�����
			String str = new String(buffer,0,len);
			System.out.print(str);
		}
		// 4:�ر���Դ
		input.close();
	}
}
