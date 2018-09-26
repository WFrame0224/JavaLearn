package day19._01_File;

import java.io.File;

//批量修改文件名称案例--E:\abc
public class FileDemo5 {
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		//获取当地目录下所有的文件
		File[] fs = dir.listFiles();
		//需要被替换/被删除的文字
		String deleteText = "南通大学-电子信息学院-信122班-王非-java学习-";
		for (File file : fs) {
			if(file.getName().contains(deleteText)){
				String newFileName = file.getName().replace(deleteText, "");
				file.renameTo(new File(dir,newFileName));
			}
		}
	}
}
