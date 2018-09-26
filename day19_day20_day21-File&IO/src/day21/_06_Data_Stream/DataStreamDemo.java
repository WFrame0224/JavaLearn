package day21._06_Data_Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//数据流
public class DataStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/out.txt");
		//write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		System.out.println(in.readByte());
		System.out.println(in.readUTF());
		System.out.println(in.readBoolean());
		in.close();
	}

	private static void write(File f) throws Exception {
		DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		out.writeByte(65);
		out.writeUTF("飞哥教育");
		out.writeBoolean(false);
		out.close();
	}
}
