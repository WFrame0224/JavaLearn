package day20._02_reader_writer;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

//文件的字符输入流
public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		//1:创建源
		File srcFile = new File("file/ch.txt");
		//2:创建流对象
		Reader in = new FileReader(srcFile);
		//3:读取操作
			/*
			1、 int reader():每次只读取一个字符，读取到末尾返回到-1
			2、 int read(char[] buffer):每次读取多个字符，把读取的字符存储到buffer数组中，读取到末尾，返回-1 
			 */
		/*1、
			int ch = 0;
			while((ch = in.read()) > 0){
				System.out.print((char)ch);
			}
		*/
		char[] buffer = new char[5];//每次只能读取5个字符
		int len = -1;//表示当前读取字符的数量
		while((len = in.read(buffer)) > 0){
			System.out.print(buffer);
		}
		//4:关闭流
		in.close();
	}
}
