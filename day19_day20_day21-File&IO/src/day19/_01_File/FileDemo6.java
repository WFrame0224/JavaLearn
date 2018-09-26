package day19._01_File;

import java.io.File;
import java.io.FilenameFilter;

//ÎÄ¼þ¹ýÂËÆ÷(FilenameFilter)
public class FileDemo6 {
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		File[] fs = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return (new File(dir, name).isFile() && name.endsWith(".java"));
			}
		});
		for (File file : fs) {
			System.out.println(file);
		}
	}
}
