package com.day14._05_synchronization;

//单例模式--懒汉式   --------以下分析得知  推荐采用饿汉式单例使用模式
//存在线程不安全问题
public class ArrayUtil2 {
	private ArrayUtil2() {
	}

	private static volatile ArrayUtil2 instance = null;//这里采用volatile修饰

	//双重检查加锁
	public static ArrayUtil2 getInstance() {
		if (instance == null) {
			synchronized (ArrayUtil2.class) {
				if (instance == null) {
					instance = new ArrayUtil2();
				}
			}
		}
		return instance;

	}
	//由于可能会存在多线程访问不安全问题，故采用同步方法，此时的同步监听对象是（ArrayUtil2.class）
	//但是synchronized的作用域太大了，损耗性能-->尽量减小synchronized的作用域---采用双重检查加锁
	/*synchronized public static ArrayUtil2 getInstance() {
		if (instance == null) {
			instance = new ArrayUtil2();
		}
		return instance;
	
	}*/

	public void sort(int[] arr) {
		//TODO
	}
}
