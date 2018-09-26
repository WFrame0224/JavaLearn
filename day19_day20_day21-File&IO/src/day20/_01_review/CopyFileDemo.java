package day20._01_review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

//�������ļ���������--����ָ��Ŀ¼��ָ�������ļ���ָ��Ŀ¼��ȥ
public class CopyFileDemo {
	public static void main(String[] args) throws Exception {
		//1���ҵ�ԴĿ¼�����е�java�ļ�
		File srcDir = new File("java");
		File destDir = new File("text");
		
		File[] fs = srcDir.listFiles(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile() && name.endsWith(".java");
			}
		});
		System.out.println(Arrays.toString(fs));
		//2:������ÿһ���ļ����󣬲�����
		for (File srcFile : fs) {
			//����������
			InputStream in = new FileInputStream(srcFile);
			File destFile = new File(destDir,srcFile.getName());
			OutputStream out = new FileOutputStream(destFile);
			//��д����
			byte[] buffer = new byte[1024];//һ���Կ��Զ�ȡ1024���ֽ�
			int len = -1;//��ʾ�Ѿ���ȡ���ֽ������ڵײ�涨-1��ȡ��ĩβ
			while(len != -1){
				out.write(buffer,0,len);
				len = in.read(buffer);
			}
			//�ر���Դ
			in.close();
			out.close();
			//�޸Ŀ���֮���ļ�������
			int index = destFile.getName().lastIndexOf(".");//�ҵ�"."������λ�ã����ڱ���.javaǰ������
			destFile.renameTo(new File(destDir,(destFile.getName().substring(0,index) + ".txt")));
		}
	}
}
