//����
class Person
{
	protected String name;
	public int age;
	void sleep()
	{
		System.out.println("I am a Person, I am sleepping!");
	}
}
//����
class Teacher extends Person
{
	String level;//����
}
class Student extends Person
{
	String sn;//ѧ��
	void sleep()
	{
		System.out.println("I am a Student, I cann't sleep, I need Studying!");
	}
}

//�̳й�ϵ������
class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Teacher t = new Teacher();
		System.out.println(t.age);
		System.out.println(t.name);
		t.sleep();
		// һ����̬�ļ򵥲���
		Person s = new Student();
		s.sleep();
	}
}
