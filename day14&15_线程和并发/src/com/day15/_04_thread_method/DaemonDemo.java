package com.day15._04_thread_method;

/**后台线程
 * 在后台运行的线程，其目的是为其他线程提供服务，也称为“守护线程”。JVM的垃圾回收线程
 * 就是典型的后台线程
 * 	特点：
 * 		若所有的前台线程都死亡，后台线程自动死亡，前台线程没有结束，后台线程是不会结束的
 * 		测试线程对象是否是后台线程，使用：thread.isDaemon();
 * 		前台线程创建的线程默认是前台线程，可以通过用setDaemon方法设置为后台线程，并且
 *	         仅当后台线程创建新的线程时，新线程是后台线程
 * 		设置后台线程：thread.setDaemon(true),该方法必须在start方法调用前，否则出现
 * 		IllegalThreadStateException异常
 */
class DaemonThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(super.getName() + "-" + i);
		}
	}
}
public class DaemonDemo {
	public static void main(String[] args) {
		//false--main主线程是前台线程
		System.out.println(Thread.currentThread().isDaemon());
		for (int i = 0; i < 50; i++) {
			System.out.println("main:" + i);
			if(i == 10){
				DaemonThread t = new DaemonThread();//前台线程创建的子线程都是前台线程，除非另行设置
				t.setDaemon(true);//设置主线程为后台线程，必须在start方法前设置
				//后台线程会随着全部前台线程的结束而结束
				t.start();
			}
		}
	}
}
