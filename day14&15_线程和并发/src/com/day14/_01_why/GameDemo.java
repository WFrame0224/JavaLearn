package com.day14._01_why;
/**需求：现在需要设计一个程序想要完成同时运行游戏，同时播放音乐的功能
 * 得使用 多进程 或者 多线程
 * 进程：指一个内存中运行的应用程序。每个进程都有自己独立的一块内存空间，一个应用程序可以同时启动多个进程，但是进程之间的通信很不方便，引入线程
 * 线程：是指进程中的一个执行任务（控制单元），一个进程可以同时并发运行多个线程
 * 多进程：操作系统中同时运行多个程序
 * 多线程：在同一个进程中同时运行多个任务，   一个进程至少有一个线程
 * --------------------------------------------------------------------
 * 线程和进程的区别：
 * 进程：有独立的内存空间，进程中的数据存放空间（堆空间和栈空间）是独立的，至少有一个线程。
 * 线程：堆空间是共享的，栈空间是独立的，线程消耗的资源也比进程小，相互之间可以影响，又称为轻型进程或者进程元
 * Java中线程调度为JVM，程序员无法控制，JVM采用了抢占式调度，没有采用分时调度，因此可能造成多线程结果的随机性
 * -------------------------------------------------------------------------------------
 * 多线程的优势：
 * 1）：进程之前不能共享内存，而线程之间共享内存（堆内存）则很简单
 * 2）：系统创建进程时需要为该进程重新分配系统资源，创建线程则代价小很多，因此实现多任务并发时，多线程效率更高
 * 3）：Java语言本身内置多线程功能的支持，而不是单存的作为底层系统的调度方式，从而简化了多线程编程
 */
public class GameDemo {

	public static void main(String[] args) {
		System.out.println("Begin...");
		playGame();//打游戏	
		playMusic();//播放音乐
		System.out.println("ending...");
	}

	private static void playMusic() {
		for (int i = 0; i < 50; i++) {
			System.out.println("播放音乐" + i);
		}
	}

	private static void playGame() {
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏" + i);
		}	
	}

}
/**并发和并行是即相似又存在区别（微观上），宏观上感觉A事件和B事件同时发生
 * 并行：是指 两个或者多个事件在   同一时刻点   发生   多核CPU实现分核同时运行实现并行
 * 并发：是指 两个或者多个事件在   同一时间段内   发生 单核CPU通过时间片实现并发
 * 
 * 
 * 
*/