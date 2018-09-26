package com.day14._02_process;

import java.io.IOException;
import java.lang.ProcessBuilder;
/**���̲�����
 * ��ʽ1��Runtime���exec����
 * ��ʽ2��ProcessBuilder��Start����
 * 
 *
 */
//��Java����ο���һ�����̣����м��³���
public class ProcessDemo {

	public static void main(String[] args) throws Exception {
		//��ʽ1��Runtime���exec����
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
		//��ʽ2��ProcessBuilder��Start����
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();
	}

}
