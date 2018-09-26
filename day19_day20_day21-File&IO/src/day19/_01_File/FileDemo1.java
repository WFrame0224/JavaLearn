package day19._01_File;

import java.io.File;

//系统平台的分隔符
public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * 因为我们不知道以后运行的系统平台是什么，就不知道该如何编写分隔符的问题，因此File类中提供了两类常量，分别表示路径分隔符和属性分隔符
		 * static String pathSeparator 		:与系统有关的名称分隔符，为了方便，它被表示为一个字符串。 
			static char pathSeparatorChar 	:与系统有关的名称分隔符 
			static String separator 			:与系统有关的默认路径分隔符，为了方便，它被表示为一个字符串 
			static char separatorChar 		:与系统有关的默认路径分隔符
		 */
		//获取名称分隔符
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		System.out.println(pathSeparator +"--"+ pathSeparatorChar );
		//获取路径分隔符
		String separator = File.separator;
		char separatorChar = File.separatorChar;
		System.out.println(separator +"--"+ separatorChar );
		//表示一个文件的路径,方式1,2,3
		String path1 = "c:\\will\\123.txt";//一个 \ 表示转义字符，再加一个 \ 表示路径
		String path2 = "c:/will/123.txt";//推荐使用2
		String path3 = "c:" + separator + "will" + separator + "123.txt";//官方建议采用第三种
		
	}
}
