class Person
{
	String name;
	private int age;
	//专门用于给对象设置age数据，并把传过来的数据保存到对象中
	public void setAge(int num)
	{
		if(num <= 0)
		{
			System.out.println("Your age is a mistake!!!");
			return;
		}
		age = num;
		System.out.println("age: " + age);
	}
	public int getAge()
	{
		return age;
	}
}
class PersonDemo 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.name = "will";
		p.setAge(-17);
		System.out.println("name: " + p.name);
	}
}
