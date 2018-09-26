package day19._01_File;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//File类案例--列出文件的分层结构
public class FileDemo4 {
	public static void main(String[] args) {
		//期望效果：abc->xxx->sd->123->456->789,思路：逐级向上查询其父目录
		final String file = "E:/abc/xxx/sd/123/456/789/b.java";
		File f = new File(file);
		System.out.println("---------采用递归方法解决----------");
		
		showLayer(f);//采用递归方法解决
		
		System.out.println();
		System.out.println("---------采用集合方法解决----------");
		//采用集合方法解决
		List<String> parentNames = new ArrayList<>();
		
		listAllParent(parentNames,f);
		
		System.out.println(parentNames);
		Collections.reverse(parentNames);
		System.out.println(parentNames);
		
		StringBuilder sb = new StringBuilder(40);
		for (String parentName : parentNames) {
			sb.append(parentName).append(">");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
	//集合填充递归法
	private static void listAllParent(List<String> parentNames, File f) {
		File fileTemp = f.getParentFile();
		if(!"".equals(fileTemp.getName())){
			parentNames.add(fileTemp.getName());
		}
		if(fileTemp.getParentFile() != null){
			listAllParent(parentNames,fileTemp);
		}
	}
	//采用递归方法解决
	private static void showLayer(File f) {
		File fileTemp = f.getParentFile();
		int length = fileTemp.getName().length();
		if(!"".equals(fileTemp.getName())){//判断一个字符串是否为空的方法，谨记
			showLayer(fileTemp);
		}
		if(length == 0)
		{
			System.out.print(fileTemp.getName());
		}else{
			System.out.print(fileTemp.getName() + ">");
		}
	}
}
