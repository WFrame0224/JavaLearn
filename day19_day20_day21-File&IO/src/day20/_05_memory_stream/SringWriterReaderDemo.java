package day20._05_memory_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

//字符串流 /字符串的内存流
public class SringWriterReaderDemo {
	public static void main(String[] args) throws Exception {
		//字符串的输出流
		StringWriter sWriter = new StringWriter();
		sWriter.write("这箱牛奶保质期多久啊?");
		sWriter.write("保质期是明天");
		System.out.println(sWriter.toString());
		
		//字符串的输入流
		StringReader sReader = new StringReader(sWriter.toString());
		char[] buffer = new char[1024];
		int len = -1;
		while((len = sReader.read(buffer)) != -1){
			System.out.println(new String(buffer,0,len));
		}
		sReader.close();
		sWriter.close();
	}
}
