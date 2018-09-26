package com.day14._05_synchronization;

//同步方法：
class Person2 implements Runnable {
	private int num = 100;//苹果总数

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			this.eatingApple();
		}
	}

	synchronized private void eatingApple() {
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

public class SynchronizedMethodDemo {

	public static void main(String[] args) {
		//创建三个线程(同学)，吃苹果
		Person2 p = new Person2();
		new Thread(p, "小A").start();
		new Thread(p, "小B").start();
		new Thread(p, "小C").start();
	}

}
