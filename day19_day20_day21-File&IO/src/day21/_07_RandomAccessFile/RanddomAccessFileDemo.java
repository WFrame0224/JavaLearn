package day21._07_RandomAccessFile;

import java.io.File;
import java.io.RandomAccessFile;

//读写文件的任意位置
public class RanddomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/raf.txt");
		write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		RandomAccessFile out = new RandomAccessFile(f,"r");
		System.out.println("文件指针位置：" + out.getFilePointer());
		System.out.println(out.readByte());
		System.out.println("文件指针位置：" + out.getFilePointer());
		System.out.println(out.readUTF());
		System.out.println("文件指针位置：" + out.getFilePointer());
		out.seek(0);//设置文件指针为0
		System.out.println("文件指针位置：" + out.getFilePointer());
		out.skipBytes(10);//设置文件指针跳过12个字节
		System.out.println(out.read());
		System.out.println("文件指针位置：" + out.getFilePointer());


		out.close();
	}

	private static void write(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		raf.writeByte(65);;
		raf.writeUTF("龙哥");//修改后的UTF-8编码,会多两个字节
		raf.write(17);
		raf.close();
	}
}
