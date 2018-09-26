package com.day14._04_example;

//每一个同学好比是一个线程对象
class Person extends Thread{
	private int num = 50;//苹果总数
	
	public Person(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			if(num > 0){
				System.out.println(super.getName() + "吃了编号为：" + num-- + "的苹果");
			}
		}
	}
}
//方式1：可以使用继承Thread方式来实现，三个同学吃50个苹果的比赛
public class ExtendsThreadDemo {

	public static void main(String[] args) {
		//创建三个线程(同学)，吃苹果
		new Person("小A").start();
		new Person("小B").start();
		new Person("小C").start();
	}

}
