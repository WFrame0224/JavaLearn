package com.day14._02_process;

import java.io.IOException;
import java.lang.ProcessBuilder;
/**进程操作：
 * 方式1：Runtime类的exec方法
 * 方式2：ProcessBuilder的Start方法
 * 
 *
 */
//在Java中如何开启一个进程：运行记事程序
public class ProcessDemo {

	public static void main(String[] args) throws Exception {
		//方式1：Runtime类的exec方法
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
		//方式2：ProcessBuilder的Start方法
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();
	}

}
