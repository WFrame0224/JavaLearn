package com.day14._04_example;

//ÿһ��ͬѧ�ñ���һ���̶߳���
class Person extends Thread{
	private int num = 50;//ƻ������
	
	public Person(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num > 0){
				System.out.println(super.getName() + "���˱��Ϊ��" + num-- + "��ƻ��");
			}
		}
	}
}
//��ʽ1������ʹ�ü̳�Thread��ʽ��ʵ�֣�����ͬѧ��50��ƻ���ı���
public class ExtendsThreadDemo {

	public static void main(String[] args) {
		//���������߳�(ͬѧ)����ƻ��
		new Person("СA").start();
		new Person("СB").start();
		new Person("СC").start();
	}

}
