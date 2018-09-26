package day20._05_memory_stream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

//�ַ��ڴ���/�ַ�������
public class CharArrayDemo {
	public static void main(String[] args) throws Exception{
		//�ַ��ڴ������
		CharArrayWriter writer = new CharArrayWriter();
		writer.write("������");
		char[] data = writer.toCharArray();
		
		//�ַ��ڴ�������
		CharArrayReader reader = new CharArrayReader(data);
		char[] buffer = new char[5];
		int len = -1;
		while((len = reader.read(buffer)) != -1){
			System.out.println(new String(buffer,0,len));
		}
	}
}
