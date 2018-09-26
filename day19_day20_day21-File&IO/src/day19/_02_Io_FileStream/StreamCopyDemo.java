package day19._02_Io_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopyDemo {
	public static void main(String[] args) throws Exception {
		File srcFile = new File("file/stream.txt");
		File destFile = new File("File/copy.txt");
		InputStream src = new FileInputStream(srcFile);
		OutputStream dest = new FileOutputStream(destFile);
		byte[] buffer = new byte[10];//创建一个容量为10的缓冲区（存储已经读取的字节数据）
		int len = -1;//表示已经读取了多少字节数，如果是-1，表面文件已经读取到最后了
		while((len = src.read(buffer)) != -1){ //已经读取了多少个字节
			System.out.print(new String(buffer,0,len));
			dest.write(buffer,0,len);//写出到对应的文件中
		}
		src.close();
		dest.close();
	}
}
