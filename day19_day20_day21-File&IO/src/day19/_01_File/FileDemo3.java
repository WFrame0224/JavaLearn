package day19._01_File;

import java.io.File;

//需求：列出指定目录中所有的文件，包括子文件夹中的所有文件（采用递归算法）
public class FileDemo3 {
	//E:\abc\xxx\sd\123\456\789
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		listAllFile(dir);
	}

	//列出所有的文件，递归算法操作 
	private static void listAllFile(File f) {
		File[] fs = f.listFiles();
		for (File file : fs) {
			//如果子文件就是文件则直接打印
			System.out.println(file);
			//如果子文件是目录则继续递归
			if(file.isDirectory()){
				listAllFile(file);
			}
		}
	}

}
