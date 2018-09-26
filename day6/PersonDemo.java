//表示人类
class Person
{
	String name = null;//人的名称
	int age = 0;
	
	static int height = 0;//此处可以证明Static修饰符的作用
	// int height = 0;

	//自定义构造器
	//我们所构造的显示构造器，此时编译器不再构造缺省构造器
	Person()
	{
		System.out.println("-----*******---------");
	}
	Person(String n,int a)
	{
		//利用构造函数可以初始化操作
		name = n;
		age = a;
		System.out.println(name +", "+age);
	}

}
//演示自定义构造器类
class  PersonDemo
{
	public static void main(String[] args) 
	{
		//创建对象：实际是在调用构造器
		/*
			Person p = new Person();
			p.name = "hello";/ 
		*/
//		Person p = new Person();
		Person p = new Person("Frame",20);
		Person.height = 177;
		System.out.println("name: " + p.name + ",age: "+p.age);
		
		System.out.println(Person.height);//直接采用的是类名访问的，如果采用static修饰，可以不创建对象直接访问
		System.out.println(p.height);	  //static变量或者static方法推荐使用 类名.方法/变量 使用
	}
}
