package com.day14._05_synchronization;

//����ģʽ--����ʽ   --------���·�����֪  �Ƽ����ö���ʽ����ʹ��ģʽ
//�����̲߳���ȫ����
public class ArrayUtil2 {
	private ArrayUtil2() {
	}

	private static volatile ArrayUtil2 instance = null;//�������volatile����

	//˫�ؼ�����
	public static ArrayUtil2 getInstance() {
		if (instance == null) {
			synchronized (ArrayUtil2.class) {
				if (instance == null) {
					instance = new ArrayUtil2();
				}
			}
		}
		return instance;

	}
	//���ڿ��ܻ���ڶ��̷߳��ʲ���ȫ���⣬�ʲ���ͬ����������ʱ��ͬ�����������ǣ�ArrayUtil2.class��
	//����synchronized��������̫���ˣ��������-->������Сsynchronized��������---����˫�ؼ�����
	/*synchronized public static ArrayUtil2 getInstance() {
		if (instance == null) {
			instance = new ArrayUtil2();
		}
		return instance;
	
	}*/

	public void sort(int[] arr) {
		//TODO
	}
}
