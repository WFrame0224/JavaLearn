package com.day15._01_process_communication;

//���Դ���
public class App {
	public static void main(String[] args) {
		//���������ߺ������߹�ͬ����Դ����
		ShareResource resource = new ShareResource();
		//�����������߳�
		new Thread(new Producer(resource)).start();
		new Thread(new Producer(resource)).start();
		//�����������߳�
		new Thread(new Consumer(resource)).start();
		new Thread(new Consumer(resource)).start();
	}
}
