package com.day15._04_thread_method;
/**线程礼让：
 * yield方法：表示当前线程对象提示调度器自己愿意让出CPU资源，但是调度器可以自由的忽略该提示
 * 调用该方法后，线程对象进入就绪状态，所以完全有可能：某个线程调用yield()之后，
 * 线程调度器又把它调度出来重新执行
 * ----------------------------------------
 * sleep方法和yield方法的区别：
 * 1）：都能是当前处于运行状态的线程放弃CPU，把运行的机会给其他线程
 * 2）：sleep方法会给其他线程运行机会，但是不考虑其他线程的优先级，
 * yield方法只会给相同的优先级或者更高的优先级的线程运行的机会
 * 3）：调用sleep方法后，线程进入计时等待状态，调用yield方法后，线程进入就绪状态
 *
 */
class PriorityThread1 extends Thread{
	public PriorityThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(super.getName() + "-" + i);
			if(i == 10){
				Thread.yield();
				/*
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				*/
				
			}
		}
	} 
}
//线程的礼让
public class YieldDemo {
	public static void main(String[] args) {
		PriorityThread1 min = new PriorityThread1("低优先级");
		min.setPriority(1);//优先级为1
		
		PriorityThread1 max = new PriorityThread1("高优先级");
		max.setPriority(8);//优先级为10
		
		min.start();
		max.start();

		/*
		//设置线程的优先级
		Thread.currentThread().setPriority(7);
		//获取主线程的优先级
		System.out.println(Thread.currentThread().getPriority());
		*/
	}
}