package com.handle;
/**finally�����ʾ���ն���ִ�еĴ��룬������û���쳣
 * ��������try����д���һЩ������Դ�������ļ�/��������/���ݿ����ӵȣ����Ƕ���ʹ����֮�����չرմ򿪵���Դ��
 * ��ֻ��try����catch�е����˳�JVM����ط�������ʱfinally�Ų���ִ�У�����system.exit(0);
 * 		����finally����Զִ�� 
 *------------------------------------------------------------------------------------------------
 * �����﷨��
 * 1����try...finally����ʱû��catch�������쳣����Ϊ��ʱ����Ӧ�ó��������ǻ��׳��쳣���Լ�������
 * 2����try...catch...finally��������Ҫ�����쳣�����ջ��ùر���Դ
 * ע��1��finally���ܵ���ʹ��
 * 	   2�����finally��return��䣬��Զ����finally�еĽ������������
 *
 */
public class FianllyDemo {

	public static void main(String[] args) {
		try{
			int ret = 10 / 0;
			System.out.println("���= " + ret);
		}catch(ArithmeticException e){
			System.out.println("����Ϊ0�����飡����");
			//throw e;
			System.exit(0);//�˳�JVM�������finally��䲻ִ��
		}finally{
			System.out.println("�ر���Դ");//������û���쳣������䶼��ִ�У�����ȷ����Դ�ر�
		}
		System.out.println("ending.......");

	}

}
