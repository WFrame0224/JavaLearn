package com.day15._05_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**��ʱ����
 * ��JDK��java.util�����ṩ��Timer�࣬���Զ�ʱִ���ض�������
 * TimerTask���ʾ��ʱ��ִ��ĳ������
 * ���÷�����
 * 			schedule(TimerTask,long delay,long period):
 * 			schedule(TimerTask task,long delay):
 *
 */
public class TimerDemo {
	public static void main(String[] args) {
		System.out.println("begin...");
		//������3����ӡһ�λ�����ã�ʦ��
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
