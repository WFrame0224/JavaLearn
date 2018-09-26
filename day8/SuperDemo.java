//需求，在子类的方法中去调用父类被覆盖的方法
//鸟类
class Bird
{
	public int a = 1;
	protected void fly()
	{
		System.out.println("我在仰望,自由飞翔");
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
	public void say()
	{
		System.out.println("偶要唱歌。。。。");
		super.fly();//使用super关键字
		/**
			this: 当前对象，谁调用this所在的方法，this 就是哪一个对象
			super:当前对象的父类对象
		*/
		this.fly();
	}
}
//super关键字
class SuperDemo 
{
	public static void main(String[] args) 
	{
		Penguin p = new Penguin();
		p.say();
	}
}
