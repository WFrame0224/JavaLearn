package day19._01_File;

import java.io.File;

//�����޸��ļ����ư���--E:\abc
public class FileDemo5 {
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		//��ȡ����Ŀ¼�����е��ļ�
		File[] fs = dir.listFiles();
		//��Ҫ���滻/��ɾ��������
		String deleteText = "��ͨ��ѧ-������ϢѧԺ-��122��-����-javaѧϰ-";
		for (File file : fs) {
			if(file.getName().contains(deleteText)){
				String newFileName = file.getName().replace(deleteText, "");
				file.renameTo(new File(dir,newFileName));
			}
		}
	}
}
