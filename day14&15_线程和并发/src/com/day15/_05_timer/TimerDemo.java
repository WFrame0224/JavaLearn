package com.day15._05_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**定时器：
 * 在JDK的java.util包中提供了Timer类，可以定时执行特定的任务
 * TimerTask类表示定时器执行某项任务
 * 常用方法：
 * 			schedule(TimerTask,long delay,long period):
 * 			schedule(TimerTask task,long delay):
 *
 */
public class TimerDemo {
	public static void main(String[] args) {
		System.out.println("begin...");
		//需求：在3秒后打印一段话：你好，师姐
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run() {
				System.out.println(new Date().toLocaleString());
			}
		}, 3000,1000);
		System.out.println("ending");
		//timer.cancel();
	}
}
