class Wine 
{
	// 定义了实例变量
    public int wine = 100;
	public void fun1()
	{
        System.out.println("Wine 的Fun.....");
        fun2();
    }
    
    public void fun2()
	{
        System.out.println("Wine 的Fun2...");
    }
}

class JNC extends Wine
{
	// 重新定义一个 wine 实例变量，隐藏父类的wine实例变量
    public String wine = "JNC";
	/**
     * @desc 子类重载父类方法
     *        父类中不存在该方法，向上转型后，父类是不能引用该方法的
     * @param a
     * @return void
     */
    public void fun1(String a)
	{
        System.out.println("JNC 的 Fun1...");
        fun2();
	}
    
    /**
     * 子类重写父类方法
     * 指向子类的父类引用调用fun2时，必定是调用该方法
     */
    public void fun2()
	{
        System.out.println("JNC 的Fun2...");
    }
	/**
     * 定义一个父类没有的方法，子类特有的方法
	 * 指向子类的父类引用调用该方法时，编译会出错
	 */
	 public void fun3()
	 {
		 System.out.println("I am special function, my father doesn't have me!");
	 }
}

public class PolymorphicDemo 
{
    public static void main(String[] args) 
	{
        Wine a = new JNC();//指向子类的父类类型引用
        a.fun1();
		// 下面这行代码编译会出错
		// a.fun3();

		// 输出100，表明访问的是父类的实例变量
		System.out.println(a.wine);
		/**
			与方法不同的是，对象的 实例变量不具备多态性，比如上面的a引用变量，程序中输出它的wine变量时，
			并未输出其子类JNC的实例变量，而是输出其父类的实例变量
		*/
		
		/**
		分析：在这个程序中子类JNC重载了父类Wine的方法fun1()，重写fun2()，而且重载后的fun1(String a)
		与 fun1()不是同一个方法，由于父类中没有该方法，向上转型后会丢失该方法，
		所以执行JNC的Wine类型引用是不能引用fun1(String a)方法。
		而子类JNC重写了fun2() ，那么指向JNC的Wine引用会调用JNC中fun2()方法
		
		--->总结如下：
		指向子类的父类引用由于向上转型了，它只能访问父类中拥有的方法和属性，
		而对于子类中存在而父类中不存在的方法，该引用是不能使用的，尽管是重载该方法。
		若子类重写了父类中的某些方法，在调用该些方法的时候，必定是使用子类中定义的这些方法（动态连接、动态调用）
		*/
		System.out.println("==============");
		JNC b = new JNC();// 不存在指向子类的父类类型的引用，因此不存在多态
		b.fun1();
		// 不存在指向子类的父类类型的引用，不存在多态，调用的直接是子类的特有方法
		b.fun3();
		System.out.println(b.wine);
    }
}