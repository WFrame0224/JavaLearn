package day19._02_Io_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//正确关闭资源
public class CloseResourceDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}
	//java7提供的自动资源关闭
	private static void test2() {
		// 1:创建源和目标
		File srcFile = new File("file/stream.txt");
		File destFile = new File("File/copy1.txt");
		try(
				//@@打开资源的代码
				// 2:创建输入的管道（输入流对象）和输出管道（输出流对象）
				InputStream src = new FileInputStream(srcFile);
				OutputStream dest = new FileOutputStream(destFile);
			)
		{
			//@@可能出现异常的代码
			// 3:读取操作
			byte[] buffer = new byte[10];//创建一个容量为10的缓冲区（存储已经读取的字节数据）
			int len = -1;//表示已经读取了多少字节数，如果是-1，表面文件已经读取到最后了
			while ((len = src.read(buffer)) != -1) { //已经读取了多少个字节
				//System.out.print(new String(buffer, 0, len));
				dest.write(buffer, 0, len);//写出到对应的文件中
			}
		}catch(Exception e){
			//@@处理异常
			e.printStackTrace();
		}
	}

	private static void test1() {
		// 1:创建源和目标
		File srcFile = new File("file/stream.txt");
		File destFile = new File("File/copy1.txt");
		//声明资源对象
		InputStream src = null;
		OutputStream dest = null;
		try {
			// 2:创建输入的管道（输入流对象）和输出管道（输出流对象）
			src = new FileInputStream(srcFile);
			dest = new FileOutputStream(destFile);
			// 3:读取操作
			byte[] buffer = new byte[10];//创建一个容量为10的缓冲区（存储已经读取的字节数据）
			int len = -1;//表示已经读取了多少字节数，如果是-1，表面文件已经读取到最后了
			while ((len = src.read(buffer)) != -1) { //已经读取了多少个字节
				//System.out.print(new String(buffer, 0, len));
				dest.write(buffer, 0, len);//写出到对应的文件中
			}
		} catch (Exception e) {
			//处理异常
			e.printStackTrace();
		} finally {
			//关闭资源
			try {
				if (src != null) {
					src.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (src != null) {
					src.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
