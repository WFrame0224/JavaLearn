package day20._02_reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//文件的字符输出流
public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
		//1:创建目标对象
		File destFile = new File("file/ch.txt");
		//2:创建字符输出流对象
		Writer out = new FileWriter(destFile,false);
		//3:写出操作
		/*
 		void write(int c) :向外写出一个字符
		void write(char[] cbuf):向外写出多个字符
		void write(char[] cbuf, int off, int len):把buffer数组中指定的字符写出去 
 		void write(String str)：直接向外写出一个字符串
		*/
		//out.write(65);
		//out.write("Fream".toCharArray());
		//out.write("hell Frame !!!".toCharArray(), 5, 5);
		out.write("Frame11");
		//4:关闭流，这里关闭前要先刷新
		//out.flush();
		out.close();
	}
}
