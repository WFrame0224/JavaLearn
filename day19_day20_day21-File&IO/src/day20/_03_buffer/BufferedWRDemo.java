package day20._03_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//字符缓冲流
public class BufferedWRDemo {
	public static void main(String[] args) throws Exception {
		//字符缓冲流输出
		BufferedWriter out = new BufferedWriter(new FileWriter("file/stream.txt"));
		out.write("明月几时有，把酒问青天，不知天上宫阙，今夕是何年？");
		out.newLine();//换一行
		out.write("我欲乘风归去，又恐琼楼玉宇，高处不胜寒。");
		out.close();
		//字符缓冲流输入
		BufferedReader in = new BufferedReader(new FileReader("file/stream.txt"));
		/*
		char[] buffer = new char[1024];
		int len = -1;
		while((len = in.read(buffer)) != -1){
			System.out.print(new String(buffer,0,len));
		}
		*/
		String line = null;//表示读取的行
		while((line = in.readLine()) != null){
			System.out.println(line);
		}
		in.close();
	}
}
