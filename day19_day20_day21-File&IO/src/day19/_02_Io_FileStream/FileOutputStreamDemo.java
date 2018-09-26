package day19._02_Io_FileStream;

import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;

//��ʾ�ļ��ֽ������
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		 // 1:����Ŀ�����(��ʾ�����ݱ��浽��һ���ļ�)
		File target = new File("file/stream.txt");
		 // 2:�����ļ��ֽ����������ˮ�ܣ���������Դ��
		OutputStream out = new FileOutputStream(target,false);
		// 3:������������������д������
		/*
	 		void write(int b) :��һ���ֽ�д�����ļ���(��ʾΪ��Ӧ��ASCII���ַ�)
			void write(byte[] b) ����b���������е��ֽڶ�д���ļ���
	 		void write(byte[] b, int off, int len) :������b�еĴ�off������ʼ��len���ֽ�д�����ļ���ȥ
		*/
		//out.write(65); //д��A
		//out.write("ABCDE".getBytes());
		out.write("ABCDE\nabcd".getBytes(),0,"ABCDE\nabcd".length());
		 // 4:�ر���Դ����
		out.close();
	}
}
