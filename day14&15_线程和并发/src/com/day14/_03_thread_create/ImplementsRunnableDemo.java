package com.day14._03_thread_create;
/**创建和启动线程，传统有两种方式：
 * 方式1：继承Thread类
		 * 1):定义一个类A继承于java.lang.Thread
		 * 2):在类A中覆盖Thread类中的run方法
		 * 3):我们在run方法编写需要执行的操作-->run方法里，线程执行体
		 * 4):在main方法中，创建线程对象，并启动线程
		 * 		创建线程类对象：		   A类 a = new A类(传递参数);
		 * 		调用线程对象的start方法：  a.start();//启动一个线程
		 * 注意：千万不要调用run方法，如果调用run方法好比是对象调用方法，依然还是只有一个线程，
		 * 		并没有开启新的线程 
 * 方式2：实现Runnable借口
 		 * 1):定义一个类A实现java.lang.Runnable接口,注意A类不是线程类
 		 * 2):在A类中覆盖Runnable接口中的run方法
		 * 3):我们在run方法编写需要执行的操作-->run方法里，线程执行体
		 * 4):在main方法中，创建线程对象，并启动线程
		 * 		创建线程类对象：			Thread t = new Thread(new A())
		 * 		调用线程对象的start方法：	t.start();//启动一个线程
		 * 注意：千万不要调用run方法，如果调用run方法好比是对象调用方法，依然还是只有一个线程，
		 * 		并没有开启新的线程 
 * ----------------------------------------------------
 * 线程类（Java.lang.Thread）：Thread类和Thread子类才能称之为线程类    阅读API
 * 别忘了主线程（main方法运行，表示主线程）
 */
//播放音乐的线程
class Music1Thread implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("播放音乐" + i);
		}
	}
}
public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		System.out.println("begin...");
		//主线程：运行游戏
		for (int i = 0; i < 50; i++) {
			System.out.println("玩游戏" + i);
			if(i == 10){
				//创建线程对象，并启动线程
				Thread target = new Thread(new Music1Thread());
				target.start();//启动线程，不能调用run方法
			} 
		}
		System.out.println("ending...");
		

	}

}
