/**
	���󣺶���һ��User�࣬�ṩname,age�ֶΣ��Լ���Ӧgetter/setter����
	��������������name��age�����ݣ��ٴ�ӡ�����name��age

*/
class User
{
	//�ֶ�
	private String name;
	private int age;
	
	//����������������
	User()
	{

	}
	User(String name)
	{
		this.name = name;
		System.out.println("I am Here!!!");
	}
	User(String name,int age)
	{
		//System.out.println("I am Here!!!");//������д֮��ᷢ���������
		/**
			---------- ����Java ----------
			ThisDemo.java:26: ����: ��this�ĵ��ñ����ǹ������еĵ�һ�����
					this(name);
						^
			1 ������
			���ϴ������-->this([ʵ��])��������Ϊ�������еĵ�һ�仰
				����-->��������ֻ�ܵ���һ�����صĹ�����

			ע�⣺���������������ʱ�����߶����������ʱ��һ��ģ��������ٲ����ĵ��ö������
		*/
		
		this(name);//��������ʾ���� ����ΪString���͵Ĺ�����(����������໥����)
		
		//this.name = name;
		this.age = age;
	}

	//setter&getter���úͻ�ȡ�ֶ�
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		if(age <= 0)
		{
			System.out.println("this age put in is worng");
			return;
		}
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

}
class ThisDemo
{
	public static void main(String[] args) 
	{
		User u1 = new User();

		u1.setName("Lucy");
		System.out.print(u1.getName()+", "); 
		u1.setAge(18);
		System.out.println(u1.getAge());

		User u2 = new User("Jack",17);
		System.out.print(u2.getName()+", ");
		System.out.println(u1.getAge());
	}
}
