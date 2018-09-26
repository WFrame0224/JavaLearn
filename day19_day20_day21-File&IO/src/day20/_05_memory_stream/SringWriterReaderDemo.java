package day20._05_memory_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

//�ַ����� /�ַ������ڴ���
public class SringWriterReaderDemo {
	public static void main(String[] args) throws Exception {
		//�ַ����������
		StringWriter sWriter = new StringWriter();
		sWriter.write("����ţ�̱����ڶ�ð�?");
		sWriter.write("������������");
		System.out.println(sWriter.toString());
		
		//�ַ�����������
		StringReader sReader = new StringReader(sWriter.toString());
		char[] buffer = new char[1024];
		int len = -1;
		while((len = sReader.read(buffer)) != -1){
			System.out.println(new String(buffer,0,len));
		}
		sReader.close();
		sWriter.close();
	}
}
