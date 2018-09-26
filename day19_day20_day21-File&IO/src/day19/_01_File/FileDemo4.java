package day19._01_File;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//File�స��--�г��ļ��ķֲ�ṹ
public class FileDemo4 {
	public static void main(String[] args) {
		//����Ч����abc->xxx->sd->123->456->789,˼·�������ϲ�ѯ�丸Ŀ¼
		final String file = "E:/abc/xxx/sd/123/456/789/b.java";
		File f = new File(file);
		System.out.println("---------���õݹ鷽�����----------");
		
		showLayer(f);//���õݹ鷽�����
		
		System.out.println();
		System.out.println("---------���ü��Ϸ������----------");
		//���ü��Ϸ������
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
	//�������ݹ鷨
	private static void listAllParent(List<String> parentNames, File f) {
		File fileTemp = f.getParentFile();
		if(!"".equals(fileTemp.getName())){
			parentNames.add(fileTemp.getName());
		}
		if(fileTemp.getParentFile() != null){
			listAllParent(parentNames,fileTemp);
		}
	}
	//���õݹ鷽�����
	private static void showLayer(File f) {
		File fileTemp = f.getParentFile();
		int length = fileTemp.getName().length();
		if(!"".equals(fileTemp.getName())){//�ж�һ���ַ����Ƿ�Ϊ�յķ���������
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
