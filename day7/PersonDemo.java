class Person
{
	String name;
	private int age;
	//ר�����ڸ���������age���ݣ����Ѵ����������ݱ��浽������
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
