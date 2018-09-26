package day20._05_memory_stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

//�ֽڵ��������ڴ���
public class ByteArrayDemo {
	public static void main(String[] args) throws Exception {
		//�ֽ�����������:����-->�ڴ�
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
		bos.write("ABDEFGH".getBytes());
		//Ҫʹ�ô洢����ʱ���ݣ��ڴ�-->����
		byte[] buffer = bos.toByteArray();
		
		//�ֽ�����������
		ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
		byte[] bys = new byte[10];
		int len = -1;
		while((len = bis.read(bys)) != -1){
			System.out.println(new String(bys,0,len));
		}
		bis.close();
		bos.close();
	}
}
