package come.randclass;

import java.util.concurrent.ThreadLocalRandom;

/**
 * ThreadLocalRandom 是Random类的子类，在多线程并发情况下，ThreadLocalRandom相对于Random可以减少多线程资源竞争，保证了线程的安全性
 * public class ThreadLocalRandom extends Random{ }
 * 	因为构造器是默认访问权限，只能在java.util包中创建对象，故，该类提供了一个方法ThreadLocalRandom.current()用于返回当前类对象
 */
public class ThreadLocalRandomDemo {
 
	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current();
		System.out.println(random.nextInt(34, 179));//生成[34,179之间的随机数)
	}

}
 