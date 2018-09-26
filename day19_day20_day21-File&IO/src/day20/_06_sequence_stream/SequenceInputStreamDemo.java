package day20._06_sequence_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//´´½¨Ë³ÐòÁ÷
		InputStream in = new SequenceInputStream(new FileInputStream("file/stream.txt"),
													new FileInputStream("file/stream2.txt"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = in.read(buffer)) != -1){
			System.out.println(new String(buffer,0,len));
		}
	}
}
