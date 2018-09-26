package day21._07_RandomAccessFile;

import java.io.File;
import java.io.RandomAccessFile;

//��д�ļ�������λ��
public class RanddomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/raf.txt");
		write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		RandomAccessFile out = new RandomAccessFile(f,"r");
		System.out.println("�ļ�ָ��λ�ã�" + out.getFilePointer());
		System.out.println(out.readByte());
		System.out.println("�ļ�ָ��λ�ã�" + out.getFilePointer());
		System.out.println(out.readUTF());
		System.out.println("�ļ�ָ��λ�ã�" + out.getFilePointer());
		out.seek(0);//�����ļ�ָ��Ϊ0
		System.out.println("�ļ�ָ��λ�ã�" + out.getFilePointer());
		out.skipBytes(10);//�����ļ�ָ������12���ֽ�
		System.out.println(out.read());
		System.out.println("�ļ�ָ��λ�ã�" + out.getFilePointer());


		out.close();
	}

	private static void write(File f) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(f,"rw");
		raf.writeByte(65);;
		raf.writeUTF("����");//�޸ĺ��UTF-8����,��������ֽ�
		raf.write(17);
		raf.close();
	}
}
