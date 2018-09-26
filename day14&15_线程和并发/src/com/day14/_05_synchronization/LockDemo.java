package com.day14._05_synchronization;

import java.util.concurrent.locks.ReentrantLock;

class Apple implements Runnable {
	private int num = 100;//ƻ������
	private final ReentrantLock lock = new ReentrantLock();//�ȴ���һ��������

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			eat();
		}
	}

	public void eat() {
		lock.lock();//���뷽�����������
		try {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + "���˱��Ϊ��" + num + "��ƻ��");
				//ģ�������ӳ�
				Thread.sleep(10);
				num--;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();//ִ���귽������������
		}

	}
}

//ͬ����(Lock)
public class LockDemo {
	public static void main(String[] args) {
		//���������߳�(ͬѧ)����ƻ��
		Apple a = new Apple();
		new Thread(a, "СA").start();
		new Thread(a, "СB").start();
		new Thread(a, "СC").start();
	}
}
