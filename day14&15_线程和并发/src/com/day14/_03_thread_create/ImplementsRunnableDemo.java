package com.day14._03_thread_create;
/**�����������̣߳���ͳ�����ַ�ʽ��
 * ��ʽ1���̳�Thread��
		 * 1):����һ����A�̳���java.lang.Thread
		 * 2):����A�и���Thread���е�run����
		 * 3):������run������д��Ҫִ�еĲ���-->run������߳�ִ����
		 * 4):��main�����У������̶߳��󣬲������߳�
		 * 		�����߳������		   A�� a = new A��(���ݲ���);
		 * 		�����̶߳����start������  a.start();//����һ���߳�
		 * ע�⣺ǧ��Ҫ����run�������������run�����ñ��Ƕ�����÷�������Ȼ����ֻ��һ���̣߳�
		 * 		��û�п����µ��߳� 
 * ��ʽ2��ʵ��Runnable���
 		 * 1):����һ����Aʵ��java.lang.Runnable�ӿ�,ע��A�಻���߳���
 		 * 2):��A���и���Runnable�ӿ��е�run����
		 * 3):������run������д��Ҫִ�еĲ���-->run������߳�ִ����
		 * 4):��main�����У������̶߳��󣬲������߳�
		 * 		�����߳������			Thread t = new Thread(new A())
		 * 		�����̶߳����start������	t.start();//����һ���߳�
		 * ע�⣺ǧ��Ҫ����run�������������run�����ñ��Ƕ�����÷�������Ȼ����ֻ��һ���̣߳�
		 * 		��û�п����µ��߳� 
 * ----------------------------------------------------
 * �߳��ࣨJava.lang.Thread����Thread���Thread������ܳ�֮Ϊ�߳���    �Ķ�API
 * ���������̣߳�main�������У���ʾ���̣߳�
 */
//�������ֵ��߳�
class Music1Thread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("��������" + i);
		}
	}
}
public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		System.out.println("begin...");
		//���̣߳�������Ϸ
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ" + i);
			if(i == 10){
				//�����̶߳��󣬲������߳�
				Thread target = new Thread(new Music1Thread());
				target.start();//�����̣߳����ܵ���run����
			} 
		}
		System.out.println("ending...");
		

	}

}
