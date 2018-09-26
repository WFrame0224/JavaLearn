package day20._02_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

//使用文件字符流完成文件的拷贝（纯文本文件）
public class FileCopyDemo {
	public static void main(String[] args) throws Exception {
		//1:创建源和目标对象
		File srcFile = new File("file/ch.txt");
		File destFile = new File("file/ch_copy.txt");
		//2:创建输入流和输出流对象
		Reader in = new FileReader(srcFile);
		Writer out = new FileWriter(destFile);
		//3:读和写操作
		char[] buffer = new char[1024];
		int len = -1;//表示当前读取字符的数量
		while((len = in.read(buffer)) != -1){
			out.write(buffer,0,len);
		}
		//4:关闭流
		in.close();
		out.close();
	}
}
