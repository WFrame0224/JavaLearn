package com.day15._03_thread_state;

class Other extends Thread{
	@Override
	public void run() {
		 for(int i = 0;i < 10;i ++){
			 System.out.println("Other-" + i);
		 }
	}
} 
public class RunnableDemo {
	public static void main(String[] args) {
		 Other other = new Other();//��ʱother�����½�״̬
		for (int i = 0; i < 100; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				other.start();
			}
		}
		if(!other.isAlive()){
			other.start();//��ʱ�ᱨ���޷������̣߳������½��̶߳���
		}
		
		
		
		/*
		 other.start();//����start����֮��other�����ڿ�����״̬
		 //other.start();//ֻ�ܵ���һ��start���������򱨴�IllegalThreadStateException
		 */
		}
}
