/**
	需求：定义一个User类，提供name,age字段，以及相应getter/setter方法
	并创建对象，设置name和age的数据，再打印对象的name和age

*/
class User
{
	//字段
	private String name;
	private int age;
	
	//两个构造器，重载
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
		//System.out.println("I am Here!!!");//此语句编写之后会发生编译错误
		/**
			---------- 编译Java ----------
			ThisDemo.java:26: 错误: 对this的调用必须是构造器中的第一个语句
					this(name);
						^
			1 个错误
			以上错误结论-->this([实参])：必须作为构造器中的第一句话
				推论-->构造器中只能调用一个重载的构造器

			注意：当多个构造器重载时，或者多个方法重载时，一般的，我们是少参数的调用多参数的
		*/
		
		this(name);//上面语句表示调用 参数为String类型的构造器(构造器间的相互调用)
		
		//this.name = name;
		this.age = age;
	}

	//setter&getter设置和获取字段
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
