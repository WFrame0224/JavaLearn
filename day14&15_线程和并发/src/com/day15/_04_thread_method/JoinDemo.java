package com.day15._04_thread_method;
/**�����߳�
 * �̵߳�join������ʾһ���̵߳ȴ���һ���߳���ɺ��ִ�С�join����������֮���̶߳���������
 * ״̬��
 */
class Join extends Thread{
	@Override 
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("join:" + i);
			
		}
	}
} 
public class JoinDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("begin...");
		Join joinThread = new Join();
		for (int i = 0; i < 50; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				//����join�߳�
				joinThread.start();
			}
			if(i == 20){
				//����join�߳�
				joinThread.join();//ǿ�����и��߳�
			}
		}
		System.out.println("ending...");
	}

}
