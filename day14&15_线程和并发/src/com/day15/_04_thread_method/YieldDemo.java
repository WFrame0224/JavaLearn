package com.day15._04_thread_method;
/**�߳����ã�
 * yield��������ʾ��ǰ�̶߳�����ʾ�������Լ�Ը���ó�CPU��Դ�����ǵ������������ɵĺ��Ը���ʾ
 * ���ø÷������̶߳���������״̬��������ȫ�п��ܣ�ĳ���̵߳���yield()֮��
 * �̵߳������ְ������ȳ�������ִ��
 * ----------------------------------------
 * sleep������yield����������
 * 1���������ǵ�ǰ��������״̬���̷߳���CPU�������еĻ���������߳�
 * 2����sleep������������߳����л��ᣬ���ǲ����������̵߳����ȼ���
 * yield����ֻ�����ͬ�����ȼ����߸��ߵ����ȼ����߳����еĻ���
 * 3��������sleep�������߳̽����ʱ�ȴ�״̬������yield�������߳̽������״̬
 *
 */
class PriorityThread1 extends Thread{
	public PriorityThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(super.getName() + "-" + i);
			if(i == 10){
				Thread.yield();
				/*
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				*/
				
			}
		}
	} 
}
//�̵߳�����
public class YieldDemo {
	public static void main(String[] args) {
		PriorityThread1 min = new PriorityThread1("�����ȼ�");
		min.setPriority(1);//���ȼ�Ϊ1
		
		PriorityThread1 max = new PriorityThread1("�����ȼ�");
		max.setPriority(8);//���ȼ�Ϊ10
		
		min.start();
		max.start();

		/*
		//�����̵߳����ȼ�
		Thread.currentThread().setPriority(7);
		//��ȡ���̵߳����ȼ�
		System.out.println(Thread.currentThread().getPriority());
		*/
	}
}