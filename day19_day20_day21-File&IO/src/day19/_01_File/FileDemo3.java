package day19._01_File;

import java.io.File;

//�����г�ָ��Ŀ¼�����е��ļ����������ļ����е������ļ������õݹ��㷨��
public class FileDemo3 {
	//E:\abc\xxx\sd\123\456\789
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		listAllFile(dir);
	}

	//�г����е��ļ����ݹ��㷨���� 
	private static void listAllFile(File f) {
		File[] fs = f.listFiles();
		for (File file : fs) {
			//������ļ������ļ���ֱ�Ӵ�ӡ
			System.out.println(file);
			//������ļ���Ŀ¼������ݹ�
			if(file.isDirectory()){
				listAllFile(file);
			}
		}
	}

}
