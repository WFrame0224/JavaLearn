package com.day14._03_thread_create;
/**ʹ�������ڲ����������̣߳���ֻ��������ĳһ����ֻʹ��һ�ε������
 * ------------------------------------
 * 
 */
public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		System.out.println("begin...");
		test1();//���ýӿ���ʽ
		test2();//���������ʽ��������
		System.out.println("ending...");
	}
	private static void test1(){
		//���̣߳�������Ϸ
				for (int i = 0; i < 50; i++) {
					System.out.println("����Ϸ" + i);
					if(i == 10){
						//�����̶߳��󣬲������߳�,�������ǲ��������ڲ���,���ýӿ���ʽ
						new Thread(new Runnable(){
							public void run() {
								for (int i = 0; i < 50; i++) {
									System.out.println("��������" + i);
								} 
							}
						}).start();
					} 
				}
	}
	private static void test2(){
		//���̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ" + i);
			if(i == 10){
				//�����̶߳��󣬲������߳�,�������ǲ��������ڲ��࣬���������ʽ���õıȽ���
				new Thread(){
					public void run() {
						for (int i = 0; i < 50; i++) {
							System.out.println("��������" + i);
						}
					};
				}.start();
			} 
		}
	}
}
