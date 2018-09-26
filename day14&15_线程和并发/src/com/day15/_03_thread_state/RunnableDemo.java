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
		 Other other = new Other();//此时other处于新建状态
		for (int i = 0; i < 100; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				other.start();
			}
		}
		if(!other.isAlive()){
			other.start();//此时会报错，无法重启线程，必须新建线程对象
		}
		
		
		
		/*
		 other.start();//调用start方法之后，other对象处于可运行状态
		 //other.start();//只能调用一次start方法，否则报错：IllegalThreadStateException
		 */
		}
}
