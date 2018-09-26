package com.day15._04_thread_method;

/**��̨�߳�
 * �ں�̨���е��̣߳���Ŀ����Ϊ�����߳��ṩ����Ҳ��Ϊ���ػ��̡߳���JVM�����������߳�
 * ���ǵ��͵ĺ�̨�߳�
 * 	�ص㣺
 * 		�����е�ǰ̨�̶߳���������̨�߳��Զ�������ǰ̨�߳�û�н�������̨�߳��ǲ��������
 * 		�����̶߳����Ƿ��Ǻ�̨�̣߳�ʹ�ã�thread.isDaemon();
 * 		ǰ̨�̴߳������߳�Ĭ����ǰ̨�̣߳�����ͨ����setDaemon��������Ϊ��̨�̣߳�����
 *	         ������̨�̴߳����µ��߳�ʱ�����߳��Ǻ�̨�߳�
 * 		���ú�̨�̣߳�thread.setDaemon(true),�÷���������start��������ǰ���������
 * 		IllegalThreadStateException�쳣
 */
class DaemonThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(super.getName() + "-" + i);
		}
	}
}
public class DaemonDemo {
	public static void main(String[] args) {
		//false--main���߳���ǰ̨�߳�
		System.out.println(Thread.currentThread().isDaemon());
		for (int i = 0; i < 50; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				DaemonThread t = new DaemonThread();//ǰ̨�̴߳��������̶߳���ǰ̨�̣߳�������������
				t.setDaemon(true);//�������߳�Ϊ��̨�̣߳�������start����ǰ����
				//��̨�̻߳�����ȫ��ǰ̨�̵߳Ľ���������
				t.start();
			}
		}
	}
}
