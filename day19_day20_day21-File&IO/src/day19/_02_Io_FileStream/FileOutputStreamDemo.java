package day19._02_Io_FileStream;

import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;

//演示文件字节输出流
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		 // 1:创建目标对象(表示把数据保存到哪一个文件)
		File target = new File("file/stream.txt");
		 // 2:创建文件字节输出流对象（水管），并接在源上
		OutputStream out = new FileOutputStream(target,false);
		// 3:具体的输出操作（往外写操作）
		/*
	 		void write(int b) :把一个字节写出到文件中(显示为相应的ASCII码字符)
			void write(byte[] b) ：把b数组中所有的字节都写到文件中
	 		void write(byte[] b, int off, int len) :把数组b中的从off索引开始的len个字节写出到文件中去
		*/
		//out.write(65); //写出A
		//out.write("ABCDE".getBytes());
		out.write("ABCDE\nabcd".getBytes(),0,"ABCDE\nabcd".length());
		 // 4:关闭资源对象
		out.close();
	}
}
