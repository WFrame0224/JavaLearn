package day20._03_buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NodeStreamVSBufferedStreamDemo {
	public static void main(String[] args) throws Exception {
		//1������Դ��Ŀ�����
		File srcFile = new File("file/ŷ��ʷ�-01-���ְ˷�(��Ӣ��).mp4");
		File destFile = new File("target/ŷ��.mp4");
		//test1(srcFile,destFile);
		test2(srcFile, destFile);
	}
	//ʹ�û����������ڴ��ļ���ÿ�ζ�ȡ1024���ֽ�:80ms
	private static void test2(File srcFile, File destFile) throws Exception {
		long begin = System.currentTimeMillis();
		//2:���������������������
		InputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		OutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
		//3������д����
		byte[] buffer = new byte[1024];
		int len = -1;//��ʾ��ǰ��ȡ�ַ�����
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		//4:�ر���
		in.close();
		out.close();
		System.out.println(System.currentTimeMillis() - begin);
	}

	//ʹ���ֽ������Ӵ����ļ���ÿ�ζ�д1024���ֽ�:185ms
	private static void test1(File srcFile, File destFile) throws Exception {
		long begin = System.currentTimeMillis();
		//2:���������������������
		InputStream in = new FileInputStream(srcFile);
		OutputStream out = new FileOutputStream(destFile);
		//3������д����
		byte[] buffer = new byte[1024];
		int len = -1;//��ʾ��ǰ��ȡ�ַ�����
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		//4:�ر���
		in.close();
		out.close();
		System.out.println(System.currentTimeMillis() - begin);
	}
}
