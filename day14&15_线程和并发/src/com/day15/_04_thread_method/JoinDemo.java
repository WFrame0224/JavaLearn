package com.day15._04_thread_method;
/**联合线程
 * 线程的join方法表示一个线程等待另一个线程完成后才执行。join方法被调用之后，线程对象处于阻塞
 * 状态。
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
				//启动join线程
				joinThread.start();
			}
			if(i == 20){
				//启动join线程
				joinThread.join();//强制运行该线程
			}
		}
		System.out.println("ending...");
	}

}
