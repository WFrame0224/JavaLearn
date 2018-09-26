package day20._03_buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//字节缓冲流
public class BufferedStreamDemo {
	public static void main(String[] args) throws Exception {
		//字节缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file/stream.txt",true));//包装流对象
		bos.write("hello world".getBytes());
		bos.close();
		//字节缓冲输入流
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("file/stream.txt"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = bin.read(buffer)) != -1){
			System.out.print(new String(buffer,0,len));
		}
		bin.close(); 
	}
}
 