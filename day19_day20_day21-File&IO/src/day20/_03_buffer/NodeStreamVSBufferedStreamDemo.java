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
		//1：创建源和目标对象
		File srcFile = new File("file/欧体笔法-01-永字八法(田英章).mp4");
		File destFile = new File("target/欧体.mp4");
		//test1(srcFile,destFile);
		test2(srcFile, destFile);
	}
	//使用缓冲流，从内存文件中每次读取1024个字节:80ms
	private static void test2(File srcFile, File destFile) throws Exception {
		long begin = System.currentTimeMillis();
		//2:创建输入流和输出流对象
		InputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		OutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
		//3：读和写操作
		byte[] buffer = new byte[1024];
		int len = -1;//表示当前读取字符数量
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		//4:关闭流
		in.close();
		out.close();
		System.out.println(System.currentTimeMillis() - begin);
	}

	//使用字节流，从磁盘文件中每次读写1024个字节:185ms
	private static void test1(File srcFile, File destFile) throws Exception {
		long begin = System.currentTimeMillis();
		//2:创建输入流和输出流对象
		InputStream in = new FileInputStream(srcFile);
		OutputStream out = new FileOutputStream(destFile);
		//3：读和写操作
		byte[] buffer = new byte[1024];
		int len = -1;//表示当前读取字符数量
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		//4:关闭流
		in.close();
		out.close();
		System.out.println(System.currentTimeMillis() - begin);
	}
}
