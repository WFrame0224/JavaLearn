package day20._04_revert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class RevertDemo {
	public static void main(String[] args) throws Exception {
		File srcFile = new File("file/stream.txt");
		File destFile = new File("target/stream.txt");
		
		Reader in = new InputStreamReader(new FileInputStream(srcFile),"GBK");
		Writer out = new OutputStreamWriter(new FileOutputStream(destFile),"GBK");
		
		//���������ǲ����ַ���
		char[] buffer = new char[10];
		int len = -1;
		while ((len = in.read(buffer)) != -1) { 
			System.out.print(new String(buffer, 0, len));
			out.write(buffer, 0, len);//д������Ӧ���ļ���
		}
		in.close();
		out.close();
	}
}
