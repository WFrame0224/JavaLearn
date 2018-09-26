package day19._01_File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws Exception {

      /*
		*����File���󣬷�ʽ1,2,3,
		*File f1 = new File("E:/abc/xxx/123.txt");
		*File f2 = new File("E:/abc/xxx","123.txt");
		*File dir = new File("E:/abc/xxx");
		*File f3 = new File(dir,"123.txt");
		*System.out.println(f1);
		*System.out.println(f2);
		*System.out.println(f3);
		*/
		System.out.println("----------test1--------------");
		test1();
		System.out.println("----------test2--------------");
		test2();
		System.out.println("----------test3--------------");
		test3();
		System.out.println("----------test4--------------");
		test4();

	}

	/*
	 * File���еķ���-Ŀ¼����
	 * boolean isDirectory()			:�ж��Ƿ���Ŀ¼
	 * boolean mkdir()				:������ǰĿ¼
	 * boolean mkdirs()				:������ǰĿ¼���ϼ�Ŀ¼
	 * String[] list()				:�г����е��ļ���
	 * File[] listFiles()			:�г����е��ļ�����
	 * static File[] listRoots()	:�г�ϵͳ�̷�
	 * boolean renameTo(File dest)	:�����޸�����
	 * boolean delete()				:ɾ���ļ�
	 */
	private static void test4() throws IOException {
		File dir = new File("E:/abc/xxx/sd/123/456/789");
		//File dir = new File("E:/abc/xxx/sd");
		File f1 = new File(dir, "123.java");
		System.out.println(dir.isDirectory());//true
		System.out.println(f1.isDirectory()); //false
		System.out.println(dir.exists());
		//dir.createNewFile();//�䴴����ֻ�����ļ�
		System.out.println(dir.mkdir());//ֻ�ܴ���һ��Ŀ¼
		System.out.println((new File("E:/abc/xxx/sd/123/456/789")).mkdirs());//���Դ����༶Ŀ¼
		System.out.println("---------------------------------------------");
		String[] names = dir.list();
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("---------------------------------------------");
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
		System.out.println("---------------------------------------------");
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
		System.out.println();
	}

	/*
	 * File���з���-�ļ�����
	 * boolean isFile()				:�Ƿ����ļ�
	 * boolean createNewFile()		:�����µ��ļ�
	 * boolean createTempFile(String prefix,String suffix):������ʱ�ļ�
	 * boolean delete()				:ɾ���ļ�
	 * void deleteOnExit()			:��JVMֹͣʱɾ���ļ�			
	 * boolean exists()				:�ж��ļ��Ƿ����
	 * boolean renameTo(File dest)	:�����޸�����
	 */
	private static void test3() throws Exception {
		File dir = new File("E:/abc/xxx");
		File f1 = new File(dir, "123.java");
		System.out.println(f1.isFile());
		System.out.println(f1.exists());
		//���E:/abc/xxx/123.java�����ڣ����½����ļ�
		if (!f1.exists()) {
			f1.createNewFile();
		} else {//��������������/ɾ��
					//f1.renameTo(new File(dir,"456.java"));
			f1.delete();
		}
		//������ʱʹ�õ��ļ�
		//File f2 = File.createTempFile("����˭_", ".txt",new File("E:/abc/xxx/"));
		//System.out.println(f2);
	}

	/*
	 * ����File·��������------------->
	 * File getAbsoluteFile()		����ȡ����·��
	 * String getAbsolutePath()		����ȡ����·��
	 * String getPath()				����ȡ�ļ�·��
	 * String getName()				����ȡ�ļ�����
	 * File getParentFile()			����ȡ�ϼ�Ŀ¼�ļ�
	 * String getParent()			����ȡ�ϼ�Ŀ¼·��
	 */
	private static void test1() {
		//����һ��File����
		File f1 = new File("E:/abc/xxx/123.txt");
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getAbsoluteFile());

		System.out.println(f1.getPath());
		System.out.println(f1.getName());

		System.out.println(f1.getParent());
		System.out.println(f1.getParentFile());
	}

	/*
	 * ���File״̬�ķ�����
	 * boolean canExecute()			:���ж��Ƿ�Ϊ��ִ���ļ�
	 * boolean canRead()				:�жϸ��ļ��Ƿ�ɶ�
	 * boolean canWrite()			:�жϸ��ļ��Ƿ��д
	 * boolean isHidden()			:�ж��ļ��Ƿ��������ļ�
	 * boolean lastModified			:�жϸ��ļ�������޸�ʱ��
	 * long length()					:��ȡ���ļ��ĳ��ȴ�С����λ���ֽڣ�
	 * 	
	 */
	private static void test2() {
		//����һ��File����
		File f1 = new File("E:/abc/xxx/123.txt");
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.isHidden());
		System.out.println(f1.lastModified());
		System.out.println(new java.util.Date(f1.lastModified()).toLocaleString());
		System.out.println(f1.length());

	}
}
