package com.day15._04_thread_method;
/**�߳����ȼ�
 *     ÿ���̶߳������ȼ������ȼ��ĸߵ�ֻ���̻߳��ִ�л���Ĵ��������йأ������߳�
 * �����ȼ�Խ�߾�һ��Խ��ִ�У��Ǹ��̵߳���������ȡ����CPU�ĵ���
 * MAX_PRIORITY=10,������ȼ�
 * MIN_PRIORITY=1,������ȼ�
 * NORM_PRIORITY=5 Ĭ�����ȼ�
 * --------------
 * getProiority():�����߳����ȼ�
 * setProiority(int newPriority):�����̵߳����ȼ�
 * ------------------------------
 * ÿ���̶߳���Ĭ�����ȼ������߳�Ĭ�����ȼ�Ϊ5�����A�̴߳���B�̣߳���ôB�̺߳�A�߳̾�����ͬ���ȼ�
 * ע�⣺��ͬ�Ĳ���ϵͳ֧�ֵ��߳����ȼ���ͬ�ģ�����ʹ�������������ȼ�����Ҫ�Զ��� 
 */
class PriorityThread extends Thread{
	public PriorityThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(super.getName() + "-" + i);
		}
	} 
}
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		PriorityThread min1 = new PriorityThread("�����ȼ�");
		min1.setPriority(1);//���ȼ�Ϊ1
		PriorityThread min2 = new PriorityThread("�����ȼ�");
		min2.setPriority(3);//���ȼ�Ϊ1
		PriorityThread min3 = new PriorityThread("�����ȼ�");
		min3.setPriority(4);//���ȼ�Ϊ1
		PriorityThread min4 = new PriorityThread("�����ȼ�");
		min4.setPriority(6);//���ȼ�Ϊ1
		
		PriorityThread max1 = new PriorityThread("�����ȼ�");
		max1.setPriority(8);//���ȼ�Ϊ10
		PriorityThread max2 = new PriorityThread("�����ȼ�");
		max2.setPriority(10);//���ȼ�Ϊ10
		
		min1.start();
		min2.start();
		min3.start();
		min4.start();
		max1.start();
		max2.start();
		/*
		//�����̵߳����ȼ�
		Thread.currentThread().setPriority(7);
		//��ȡ���̵߳����ȼ�
		System.out.println(Thread.currentThread().getPriority());
		*/
	}
}
