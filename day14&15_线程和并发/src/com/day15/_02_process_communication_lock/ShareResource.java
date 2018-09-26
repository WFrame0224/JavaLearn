package com.day15._02_process_communication_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//共享资源对象（姓名--性别）
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	/**
	 * 生产者向共享资源对象中存储数据
	 * @param name     存储的姓名
	 * @param gender   存储的性别
	 */
	public void push(String name, String gender) {
		lock.lock();//进入方法中立马加锁
		try {
			while(!isEmpty){
				condition.await();//如果共享资源中不为空，则等待消费者消费数据
			}
			//----------生产开始------------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//----------生产结束------------------
			isEmpty = false;//设置共享资源状态为非空
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();//方法结束，解锁
		}
	}

	/**
	 * 消费者从共享资源对象中取出数据
	 */
	public void popup() {
		lock.lock();//进入方法中立马加锁
		try {
			while(isEmpty){
				condition.await();//如果共享资源里面为空，则等待生产者生产
			}
			//-----------消费开始--------------
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//-----------消费结束--------------
			isEmpty = true;//消费结束，共享资源状态为空
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();//方法结束，解锁
		}
	}
}
