package com.day14._04_example;

//ÿһ��ͬѧ�ñ���һ���̶߳���
class Person1 implements Runnable{
	private int num = 50;//ƻ������
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num > 0){
				System.out.println(Thread.currentThread().getName() + "���˱��Ϊ��" + num-- + "��ƻ��");
			}
		}
	}
}
//��ʽ1������ʹ�ü̳�Thread��ʽ��ʵ�֣�����ͬѧ��50��ƻ���ı���
public class ImplementsRunnalbeDemo {

	public static void main(String[] args) {
		//���������߳�(ͬѧ)����ƻ��
		Person1 p =new Person1();
		new Thread(p,"СA").start();
		new Thread(p,"СB").start();
		new Thread(p,"СC").start();
	}

}