package day20._05_memory_stream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

//字符内存流/字符数组流
public class CharArrayDemo {
	public static void main(String[] args) throws Exception{
		//字符内存输出流
		CharArrayWriter writer = new CharArrayWriter();
		writer.write("棒棒的");
		char[] data = writer.toCharArray();
		
		//字符内存输入流
		CharArrayReader reader = new CharArrayReader(data);
		char[] buffer = new char[5];
		int len = -1;
		while((len = reader.read(buffer)) != -1){
			System.out.println(new String(buffer,0,len));
		}
	}
}
