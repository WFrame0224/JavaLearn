package day19._01_File;

import java.io.File;

//ϵͳƽ̨�ķָ���
public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * ��Ϊ���ǲ�֪���Ժ����е�ϵͳƽ̨��ʲô���Ͳ�֪������α�д�ָ��������⣬���File�����ṩ�����ೣ�����ֱ��ʾ·���ָ��������Էָ���
		 * static String pathSeparator 		:��ϵͳ�йص����Ʒָ�����Ϊ�˷��㣬������ʾΪһ���ַ����� 
			static char pathSeparatorChar 	:��ϵͳ�йص����Ʒָ��� 
			static String separator 			:��ϵͳ�йص�Ĭ��·���ָ�����Ϊ�˷��㣬������ʾΪһ���ַ��� 
			static char separatorChar 		:��ϵͳ�йص�Ĭ��·���ָ���
		 */
		//��ȡ���Ʒָ���
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		System.out.println(pathSeparator +"--"+ pathSeparatorChar );
		//��ȡ·���ָ���
		String separator = File.separator;
		char separatorChar = File.separatorChar;
		System.out.println(separator +"--"+ separatorChar );
		//��ʾһ���ļ���·��,��ʽ1,2,3
		String path1 = "c:\\will\\123.txt";//һ�� \ ��ʾת���ַ����ټ�һ�� \ ��ʾ·��
		String path2 = "c:/will/123.txt";//�Ƽ�ʹ��2
		String path3 = "c:" + separator + "will" + separator + "123.txt";//�ٷ�������õ�����
		
	}
}
