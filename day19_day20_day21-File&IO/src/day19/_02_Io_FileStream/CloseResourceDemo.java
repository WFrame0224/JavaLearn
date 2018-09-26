package day19._02_Io_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//��ȷ�ر���Դ
public class CloseResourceDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}
	//java7�ṩ���Զ���Դ�ر�
	private static void test2() {
		// 1:����Դ��Ŀ��
		File srcFile = new File("file/stream.txt");
		File destFile = new File("File/copy1.txt");
		try(
				//@@����Դ�Ĵ���
				// 2:��������Ĺܵ������������󣩺�����ܵ������������
				InputStream src = new FileInputStream(srcFile);
				OutputStream dest = new FileOutputStream(destFile);
			)
		{
			//@@���ܳ����쳣�Ĵ���
			// 3:��ȡ����
			byte[] buffer = new byte[10];//����һ������Ϊ10�Ļ��������洢�Ѿ���ȡ���ֽ����ݣ�
			int len = -1;//��ʾ�Ѿ���ȡ�˶����ֽ����������-1�������ļ��Ѿ���ȡ�������
			while ((len = src.read(buffer)) != -1) { //�Ѿ���ȡ�˶��ٸ��ֽ�
				//System.out.print(new String(buffer, 0, len));
				dest.write(buffer, 0, len);//д������Ӧ���ļ���
			}
		}catch(Exception e){
			//@@�����쳣
			e.printStackTrace();
		}
	}

	private static void test1() {
		// 1:����Դ��Ŀ��
		File srcFile = new File("file/stream.txt");
		File destFile = new File("File/copy1.txt");
		//������Դ����
		InputStream src = null;
		OutputStream dest = null;
		try {
			// 2:��������Ĺܵ������������󣩺�����ܵ������������
			src = new FileInputStream(srcFile);
			dest = new FileOutputStream(destFile);
			// 3:��ȡ����
			byte[] buffer = new byte[10];//����һ������Ϊ10�Ļ��������洢�Ѿ���ȡ���ֽ����ݣ�
			int len = -1;//��ʾ�Ѿ���ȡ�˶����ֽ����������-1�������ļ��Ѿ���ȡ�������
			while ((len = src.read(buffer)) != -1) { //�Ѿ���ȡ�˶��ٸ��ֽ�
				//System.out.print(new String(buffer, 0, len));
				dest.write(buffer, 0, len);//д������Ӧ���ļ���
			}
		} catch (Exception e) {
			//�����쳣
			e.printStackTrace();
		} finally {
			//�ر���Դ
			try {
				if (src != null) {
					src.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (src != null) {
					src.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
