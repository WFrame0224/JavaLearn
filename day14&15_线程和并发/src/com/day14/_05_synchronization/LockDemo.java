package com.day14._05_synchronization;

import java.util.concurrent.locks.ReentrantLock;

class Apple implements Runnable {
	private int num = 100;//苹果总数
	private final ReentrantLock lock = new ReentrantLock();//先创建一个锁对象

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			eat();
		}
	}

	public void eat() {
		lock.lock();//进入方法，立马加锁
		try {
			if (num > 0) {
				System.out.println(Thread.currentThread().getName() + "吃了编号为：" + num + "的苹果");
				//模拟网络延迟
				Thread.sleep(10);
				num--;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();//执行完方法，开锁走人
		}

	}
}

//同步锁(Lock)
public class LockDemo {
	public static void main(String[] args) {
		//创建三个线程(同学)，吃苹果
		Apple a = new Apple();
		new Thread(a, "小A").start();
		new Thread(a, "小B").start();
		new Thread(a, "小C").start();
	}
}
