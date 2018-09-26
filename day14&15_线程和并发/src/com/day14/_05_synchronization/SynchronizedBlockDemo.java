package com.day14._05_synchronization;

//同步代码块：
class Person1 implements Runnable {
	private int num = 100;//苹果总数

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			synchronized (this) {//this：表示Apple对象，该对象属于多线程共享的资源
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + "吃了编号为：" + num + "的苹果");
					//模拟网络延迟
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					num--;
				}
			}
		}
	}
}

public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		//创建三个线程(同学)，吃苹果
		Person1 p = new Person1();
		new Thread(p, "小A").start();
		new Thread(p, "小B").start();
		new Thread(p, "小C").start();
	}
}
