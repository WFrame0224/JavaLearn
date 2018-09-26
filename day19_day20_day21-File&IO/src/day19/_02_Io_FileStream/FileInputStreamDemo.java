package day19._02_Io_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

//演示文件字节输入流
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		// 1:创建源
		File f = new File("file/stream.txt");
		// 2:创建文件字节输入流对象，并接在源上
		InputStream input = new FileInputStream(f);
		// 3:具体的读取操作
		/*
		 *  注意：如果读取到最后没有数据的时候，就返回-1
		 	int read()	:读取一个字节,返回读取的字节 
			int read(byte[] b):存储多个字节，并存储到B数组中，从数组b的索引为0的位置开始存,返回读取了几个字节
			int read(byte[] b,int off,int len):存储多个字节，并存储到B数组中,从数组的off索引位置开始，读取len个字节
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
		int len = -1;//表示当前读取的字节总数，如果为-1，表示读取到末尾了
		while(((len = input.read(buffer)) != -1)){//全部读取文件中的数据
			String str = new String(buffer,0,len);
			System.out.print(str);
		}
		// 4:关闭资源
		input.close();
	}
}
