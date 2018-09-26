package day19._01_File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws Exception {

      /*
		*创建File对象，方式1,2,3,
		*File f1 = new File("E:/abc/xxx/123.txt");
		*File f2 = new File("E:/abc/xxx","123.txt");
		*File dir = new File("E:/abc/xxx");
		*File f3 = new File(dir,"123.txt");
		*System.out.println(f1);
		*System.out.println(f2);
		*System.out.println(f3);
		*/
		System.out.println("----------test1--------------");
		test1();
		System.out.println("----------test2--------------");
		test2();
		System.out.println("----------test3--------------");
		test3();
		System.out.println("----------test4--------------");
		test4();

	}

	/*
	 * File类中的方法-目录操作
	 * boolean isDirectory()			:判断是否是目录
	 * boolean mkdir()				:创建当前目录
	 * boolean mkdirs()				:创建当前目录和上级目录
	 * String[] list()				:列出所有的文件名
	 * File[] listFiles()			:列出所有的文件对象
	 * static File[] listRoots()	:列出系统盘符
	 * boolean renameTo(File dest)	:重新修改名称
	 * boolean delete()				:删除文件
	 */
	private static void test4() throws IOException {
		File dir = new File("E:/abc/xxx/sd/123/456/789");
		//File dir = new File("E:/abc/xxx/sd");
		File f1 = new File(dir, "123.java");
		System.out.println(dir.isDirectory());//true
		System.out.println(f1.isDirectory()); //false
		System.out.println(dir.exists());
		//dir.createNewFile();//其创建的只能是文件
		System.out.println(dir.mkdir());//只能创建一级目录
		System.out.println((new File("E:/abc/xxx/sd/123/456/789")).mkdirs());//可以创建多级目录
		System.out.println("---------------------------------------------");
		String[] names = dir.list();
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("---------------------------------------------");
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
		System.out.println("---------------------------------------------");
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
		System.out.println();
	}

	/*
	 * File类中方法-文件操作
	 * boolean isFile()				:是否是文件
	 * boolean createNewFile()		:创建新的文件
	 * boolean createTempFile(String prefix,String suffix):创建临时文件
	 * boolean delete()				:删除文件
	 * void deleteOnExit()			:在JVM停止时删除文件			
	 * boolean exists()				:判断文件是否存在
	 * boolean renameTo(File dest)	:重新修改名称
	 */
	private static void test3() throws Exception {
		File dir = new File("E:/abc/xxx");
		File f1 = new File(dir, "123.java");
		System.out.println(f1.isFile());
		System.out.println(f1.exists());
		//如果E:/abc/xxx/123.java不存在，则新建该文件
		if (!f1.exists()) {
			f1.createNewFile();
		} else {//如果存在则给改名/删除
					//f1.renameTo(new File(dir,"456.java"));
			f1.delete();
		}
		//创建临时使用的文件
		//File f2 = File.createTempFile("我是谁_", ".txt",new File("E:/abc/xxx/"));
		//System.out.println(f2);
	}

	/*
	 * 操作File路径和名称------------->
	 * File getAbsoluteFile()		：获取绝对路径
	 * String getAbsolutePath()		：获取绝对路径
	 * String getPath()				：获取文件路径
	 * String getName()				：获取文件名称
	 * File getParentFile()			：获取上级目录文件
	 * String getParent()			：获取上级目录路径
	 */
	private static void test1() {
		//创建一个File对象
		File f1 = new File("E:/abc/xxx/123.txt");
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getAbsoluteFile());

		System.out.println(f1.getPath());
		System.out.println(f1.getName());

		System.out.println(f1.getParent());
		System.out.println(f1.getParentFile());
	}

	/*
	 * 检测File状态的方法：
	 * boolean canExecute()			:判判断是否为可执行文件
	 * boolean canRead()				:判断该文件是否可读
	 * boolean canWrite()			:判断该文件是否可写
	 * boolean isHidden()			:判断文件是否是隐藏文件
	 * boolean lastModified			:判断该文件的最后修改时间
	 * long length()					:获取该文件的长度大小（单位，字节）
	 * 	
	 */
	private static void test2() {
		//创建一个File对象
		File f1 = new File("E:/abc/xxx/123.txt");
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.isHidden());
		System.out.println(f1.lastModified());
		System.out.println(new java.util.Date(f1.lastModified()).toLocaleString());
		System.out.println(f1.length());

	}
}
