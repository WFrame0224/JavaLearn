package day20._01_review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//案例：文件拷贝案例--拷贝指定目录的指定类型文件到指定目录中去
public class CopyFileDemo {
	public static void main(String[] args) throws Exception {
		//1：找到源目录中所有的java文件
		File srcDir = new File("java");
		File destDir = new File("text");
		
		File[] fs = srcDir.listFiles(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile() && name.endsWith(".java");
			}
		});
		System.out.println(Arrays.toString(fs));
		//2:迭代出每一个文件对象，并拷贝
		for (File srcFile : fs) {
			//创建流对象
			InputStream in = new FileInputStream(srcFile);
			File destFile = new File(destDir,srcFile.getName());
			OutputStream out = new FileOutputStream(destFile);
			//读写操作
			byte[] buffer = new byte[1024];//一次性可以读取1024个字节
			int len = -1;//表示已经读取的字节数，在底层规定-1读取到末尾
			while(len != -1){
				out.write(buffer,0,len);
				len = in.read(buffer);
			}
			//关闭资源
			in.close();
			out.close();
			//修改拷贝之后文件的名称
			int index = destFile.getName().lastIndexOf(".");//找到"."索引的位置，用于保留.java前的名字
			destFile.renameTo(new File(destDir,(destFile.getName().substring(0,index) + ".txt")));
		}
	}
}
