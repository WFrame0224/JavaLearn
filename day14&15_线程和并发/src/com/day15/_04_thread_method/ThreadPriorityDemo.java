package com.day15._04_thread_method;
/**线程优先级
 *     每个线程都有优先级，优先级的高低只和线程获得执行机会的次数多少有关，并非线程
 * 的优先级越高就一定越先执行，那个线程的优先运行取决于CPU的调度
 * MAX_PRIORITY=10,最高优先级
 * MIN_PRIORITY=1,最低优先级
 * NORM_PRIORITY=5 默认优先级
 * --------------
 * getProiority():返回线程优先级
 * setProiority(int newPriority):更改线程的优先级
 * ------------------------------
 * 每个线程都有默认优先级，主线程默认优先级为5，如果A线程创建B线程，那么B线程和A线程具有相同优先级
 * 注意：不同的操作系统支持的线程优先级不同的，建议使用上述三个优先级，不要自定义 
 */
class PriorityThread extends Thread{
	public PriorityThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(super.getName() + "-" + i);
		}
	} 
}
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		PriorityThread min1 = new PriorityThread("低优先级");
		min1.setPriority(1);//优先级为1
		PriorityThread min2 = new PriorityThread("低优先级");
		min2.setPriority(3);//优先级为1
		PriorityThread min3 = new PriorityThread("低优先级");
		min3.setPriority(4);//优先级为1
		PriorityThread min4 = new PriorityThread("低优先级");
		min4.setPriority(6);//优先级为1
		
		PriorityThread max1 = new PriorityThread("高优先级");
		max1.setPriority(8);//优先级为10
		PriorityThread max2 = new PriorityThread("高优先级");
		max2.setPriority(10);//优先级为10
		
		min1.start();
		min2.start();
		min3.start();
		min4.start();
		max1.start();
		max2.start();
		/*
		//设置线程的优先级
		Thread.currentThread().setPriority(7);
		//获取主线程的优先级
		System.out.println(Thread.currentThread().getPriority());
		*/
	}
}
