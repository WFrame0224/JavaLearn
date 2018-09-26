package day21._01_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//ʹ�ö�������ʵ�����л��ͷ����л�
public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception{
		File f = new File("file/obj.txt");
		//writeObject(f);
		readObject(f);
	}
	//�����л�����
	private static void readObject(File f) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		User user = (User)in.readObject();
		System.out.println(user);
		in.close();
	}
	//���л�����
	private static void writeObject(File f) throws Exception{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(new User("will","1234",17));
		out.close();
	}
}
