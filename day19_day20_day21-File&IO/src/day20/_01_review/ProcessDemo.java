package day20._01_review;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//��������ȡ��������-���������java����
public class ProcessDemo {
	public static void main(String[] args) throws Exception {
		String str = "System.out.println(\"��������������Ʋ�\")";
		
		eval(str);
	}
	//ִ��str����,���ڿ���̨��ӡ��:��������������Ʋ�
	private static void eval(String str) throws Exception {
		//1:ʹ��StringBuilderƴ��һ��������HelloWorld����
		StringBuilder sBuilder = new StringBuilder(80);
		sBuilder.append("public class Hello{");
		sBuilder.append("public static void main(String[] args){");
		sBuilder.append(str);sBuilder.append(";");
		sBuilder.append("}");
		sBuilder.append("}");
		//System.out.println(sBuilder);
		//2:���浽һ������Hello.java���ļ���
		OutputStream out = new FileOutputStream("Hello.java");
		out.write(sBuilder.toString().getBytes());
		out.close();
		//3:����javac����������Hello.java
		Process javacProcess = Runtime.getRuntime().exec("javac Hello.java");
		//4����ȡjavac�����еĴ�������Ϣ
		InputStream error = javacProcess.getErrorStream();
		//��ȡ���е�����
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = error.read(buffer)) != -1){
			String msg = new String(buffer,0,len);
			System.out.println(msg);
		}
		error.close();
		//5:����java����������Hello.java����
		Process javacProcess1 = Runtime.getRuntime().exec("java Hello");
		//6����ȡjavac�����е��������Ϣ
		InputStream info = javacProcess1.getInputStream();
		while((len = info.read(buffer)) != -1){
			String msg = new String(buffer,0,len);
			System.out.println(msg);
		}
		info.close();
		//7:ɾ��java��class�ļ�
		new File("Hello.java").delete();
		new File("Hello.class").delete();
	}
}
