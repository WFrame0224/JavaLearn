package day20._03_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//�ַ�������
public class BufferedWRDemo {
	public static void main(String[] args) throws Exception {
		//�ַ����������
		BufferedWriter out = new BufferedWriter(new FileWriter("file/stream.txt"));
		out.write("���¼�ʱ�У��Ѿ������죬��֪���Ϲ��ڣ���Ϧ�Ǻ��ꣿ");
		out.newLine();//��һ��
		out.write("�����˷��ȥ���ֿ���¥����ߴ���ʤ����");
		out.close();
		//�ַ�����������
		BufferedReader in = new BufferedReader(new FileReader("file/stream.txt"));
		/*
		char[] buffer = new char[1024];
		int len = -1;
		while((len = in.read(buffer)) != -1){
			System.out.print(new String(buffer,0,len));
		}
		*/
		String line = null;//��ʾ��ȡ����
		while((line = in.readLine()) != null){
			System.out.println(line);
		}
		in.close();
	}
}
