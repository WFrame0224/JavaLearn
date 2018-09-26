package com.day14._05_synchronization;

//ͬ������飺
class Person1 implements Runnable {
	private int num = 100;//ƻ������

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			synchronized (this) {//this����ʾApple���󣬸ö������ڶ��̹߳������Դ
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + "���˱��Ϊ��" + num + "��ƻ��");
					//ģ�������ӳ�
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					num--;
				}
			}
		}
	}
}

public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		//���������߳�(ͬѧ)����ƻ��
		Person1 p = new Person1();
		new Thread(p, "СA").start();
		new Thread(p, "СB").start();
		new Thread(p, "СC").start();
	}
}
