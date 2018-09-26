package com.day14._03_thread_create;
/**使用匿名内部类来创建线程：（只是适用于某一个类只使用一次的情况）
 * ------------------------------------
 * 
 */
public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		System.out.println("begin...");
		test1();//采用接口形式
		test2();//采用类的形式，不常用
		System.out.println("ending...");
	}
	private static void test1(){
		//主线程：运行游戏
				for (int i = 0; i < 50; i++) {
					System.out.println("玩游戏" + i);
					if(i == 10){
						//创建线程对象，并启动线程,这里我们采用匿名内部类,采用接口形式
						new Thread(new Runnable(){
							public void run() {
								for (int i = 0; i < 50; i++) {
									System.out.println("播放音乐" + i);
								} 
							}
						}).start();
					} 
				}
	}
	private static void test2(){
		//主线程：运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("玩游戏" + i);
			if(i == 10){
				//创建线程对象，并启动线程,这里我们采用匿名内部类，采用类的形式，用的比较少
				new Thread(){
					public void run() {
						for (int i = 0; i < 50; i++) {
							System.out.println("播放音乐" + i);
						}
					};
				}.start();
			} 
		}
	}
}
