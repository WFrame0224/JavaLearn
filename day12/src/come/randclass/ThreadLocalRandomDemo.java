package come.randclass;

import java.util.concurrent.ThreadLocalRandom;

/**
 * ThreadLocalRandom ��Random������࣬�ڶ��̲߳�������£�ThreadLocalRandom�����Random���Լ��ٶ��߳���Դ��������֤���̵߳İ�ȫ��
 * public class ThreadLocalRandom extends Random{ }
 * 	��Ϊ��������Ĭ�Ϸ���Ȩ�ޣ�ֻ����java.util���д������󣬹ʣ������ṩ��һ������ThreadLocalRandom.current()���ڷ��ص�ǰ�����
 */
public class ThreadLocalRandomDemo {
 
	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current();
		System.out.println(random.nextInt(34, 179));//����[34,179֮��������)
	}

}
 