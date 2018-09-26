package day20._01_review;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//案例：获取进程数据-编译和运行java代码
public class ProcessDemo {
	public static void main(String[] args) throws Exception {
		String str = "System.out.println(\"你是天边最美的云彩\")";
		
		eval(str);
	}
	//执行str参数,并在控制台打印出:你是天边最美的云彩
	private static void eval(String str) throws Exception {
		//1:使用StringBuilder拼接一个完整的HelloWorld程序
		StringBuilder sBuilder = new StringBuilder(80);
		sBuilder.append("public class Hello{");
		sBuilder.append("public static void main(String[] args){");
		sBuilder.append(str);sBuilder.append(";");
		sBuilder.append("}");
		sBuilder.append("}");
		//System.out.println(sBuilder);
		//2:保存到一个名叫Hello.java的文件中
		OutputStream out = new FileOutputStream("Hello.java");
		out.write(sBuilder.toString().getBytes());
		out.close();
		//3:调用javac进程来编译Hello.java
		Process javacProcess = Runtime.getRuntime().exec("javac Hello.java");
		//4：读取javac进程中的错误流信息
		InputStream error = javacProcess.getErrorStream();
		//读取流中的数据
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = error.read(buffer)) != -1){
			String msg = new String(buffer,0,len);
			System.out.println(msg);
		}
		error.close();
		//5:调用java进程来运行Hello.java程序
		Process javacProcess1 = Runtime.getRuntime().exec("java Hello");
		//6：读取javac进程中的输出流信息
		InputStream info = javacProcess1.getInputStream();
		while((len = info.read(buffer)) != -1){
			String msg = new String(buffer,0,len);
			System.out.println(msg);
		}
		info.close();
		//7:删除java和class文件
		new File("Hello.java").delete();
		new File("Hello.class").delete();
	}
}
