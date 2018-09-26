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
		byte[] buffer = new byte[10];//����һ������Ϊ10�Ļ��������洢�Ѿ���ȡ���ֽ����ݣ�
		int len = -1;//��ʾ�Ѿ���ȡ�˶����ֽ����������-1�������ļ��Ѿ���ȡ�������
		while((len = src.read(buffer)) != -1){ //�Ѿ���ȡ�˶��ٸ��ֽ�
			System.out.print(new String(buffer,0,len));
			dest.write(buffer,0,len);//д������Ӧ���ļ���
		}
		src.close();
		dest.close();
	}
}
