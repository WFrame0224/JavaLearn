//父类
class Person
{
	protected String name;
	public int age;
	void sleep()
	{
		System.out.println("I am a Person, I am sleepping!");
	}
}
//子类
class Teacher extends Person
{
	String level;//级别
}
class Student extends Person
{
	String sn;//学号
	void sleep()
	{
		System.out.println("I am a Student, I cann't sleep, I need Studying!");
	}
}

//继承关系测试类
class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Teacher t = new Teacher();
		System.out.println(t.age);
		System.out.println(t.name);
		t.sleep();
		// 一个多态的简单测试
		Person s = new Student();
		s.sleep();
	}
}
