package com.day15._01_process_communication;

//共享资源对象（姓名--性别）
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;//用来表示共享资源对象是否为空的状态

	/**
	 * 生产者向共享资源对象中存储数据
	 * @param name     存储的姓名
	 * @param gender   存储的性别
	 */
	synchronized public void push(String name, String gender) {
		try {
			while (!isEmpty) {//当isEmpty为false的时候，不空，应该等待消费者来获取
				//使用同步锁对象来调用，表示当前线程释放同步锁，进入等待池中，只能被其他线程所唤醒
				this.wait();
			}
			//----------生产开始------------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//----------生产结束------------------
			isEmpty = false;//设置共享资源数据不为空
			this.notifyAll();//唤醒一个消费者
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 消费者从共享资源对象中取出数据
	 */
	synchronized public void popup() {
		try {
			while (isEmpty) {//当isEmpty为true的时候，为空，应该等待生产者来生产数据
				//使用同步锁对象来调用，表示当前线程释放同步锁，进入等待池中，只能被其他线程所唤醒
				this.wait();
			}
			//-----------消费开始--------------
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//-----------消费结束--------------
			isEmpty = true;//设置共享资源数据为空
			this.notifyAll();//唤醒一个生产者
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
