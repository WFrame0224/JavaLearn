class FinalVarDemo 
{
	static final String NAME = "Maical";//final修饰的变量==常量，必须显示地初始化
	public static void main(String[] args) 
	{
		//NAME = "Linc";//此语句编译错误，final修饰的变量无法重新赋值
		//System.out.println(NAME);
		final Person p = new Person(); 
		System.out.println(p.info);
		p.info = "xxxx";
		System.out.println(p.info);
		//p = new Person();//此语句编译出错-->可见引用地址不可以变，但是内容可以变
	}
}
class Person
{
	public String info = "最初的值";
}
