//鸟类
class Bird
{
	public int a = 1;
	protected void fly()
	{
		System.out.println("我在仰望,自由飞翔");
	}
	public void fly(int a)//方法重载
	{
		System.out.println("我在仰望,自由飞翔");
	}
	private void love()
	{
		System.out.println("I am a bird, I can find my lover!!!");
	}
}
//企鹅
class Penguin extends Bird
{ 
	public int a;//字段没有覆盖

	@Override//标签可加可不加--判断当前子类的方法是否覆盖了父类的方法
	public void fly()//存在和父类相同的方法
	{
		System.out.println("对不起，偶是折翼的天使");
	}
	
    // 此处的love()方法已经不是父类方法的重写，因为父类方法为private修饰，不能被子类访问，
	// 因而此处是子类的特有方法，从修饰符的不同也可以看出
	public void love()
	{
		System.out.println("I am a Penguin, I love my bros!!!");
	}
	
}
//方法-覆盖测试类（---字段没有覆盖）
class OverrideDemo 
{
	public static void main(String[] args) 
	{
		Bird b = new Bird();
		b.fly();
		Penguin p = new Penguin();
		p.fly();//子类方法覆盖父类方法-->子类方法更优先
		p.fly(1);//子类方法找不到子类带参数的方法，子类向上寻找父类中的方法
		System.out.println(p.a);
		p.love();
	}
}
/**
	方法覆写的原则(一同两小一大)
		一同：实例方法签名必须相同。所以建议直接拷贝父类的方法定义（方法签名=方法名+方法参数列表）
		两小：
			1）子类方法的返回值类型是和父类方法的返回类型相同或是其子类
				即：子类返回更加具体的类
			2）子类方法声明抛出的异常类型和父类方法声明抛出的异常类型相同或是其子类
		一大：子类方法的访问权限比父类方法的访问权限更大或是相等
*/