class Wine 
{
    private String name;
    
    public String getName()
	{
        return name;
    }

    public void setName(String name) 
	{
        this.name = name;
    }

    public Wine()
	{
    }
    
    public String drink()
	{
        return "喝的是 " + getName();
    }
    
    /**
     * 重写toString()
     */
    public String toString()
	{
        return null;
    }
}

class JNC extends Wine
{
    public JNC()
	{
        setName("JNC");
    }
    
    /**
     * 重写父类方法，实现多态
     */
    public String drink()
	{
        return "喝的是 " + getName();
    }
    
    /**
     * 重写toString()
     */
    public String toString()
	{
        return "Wine : " + getName();
    }
}

class JGJ extends Wine
{
    public JGJ()
	{
        setName("JGJ");
    }
    
    /**
     * 重写父类方法，实现多态
     */
    public String drink()
	{
        return "喝的是 " + getName();
    }
    
    /**
     * 重写toString()
     */
    public String toString()
	{
        return "Wine : " + getName();
    }
}

public class PolymorphicDemo1 
{
    public static void main(String[] args) 
	{
        //定义父类数组
        Wine[] wines = new Wine[2];
        //定义两个子类
        JNC jnc = new JNC();
        JGJ jgj = new JGJ();
        
        //父类引用子类对象
        wines[0] = jnc;
        wines[1] = jgj;
        
        for(int i = 0 ; i < 2 ; i++)
		{
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
        }
        System.out.println("-------------------------------");

		Object o = new JGJ();
		System.out.println(o.toString());
		System.out.println("-------------------------------");
		/**
			Object、Wine、JGJ三者继承链关系是：JGJ—>Wine—>Object。
			所以我们可以这样说：当子类重写父类的方法被调用时，
			只有对象继承链中的最末端的方法才会被调用。
		*/
		Object o1 = new Wine();
		System.out.println(o1.toString());//Null 因为JGJ并不存在于该对象继承链中.
    }
}
/**
 在上面的代码中JNC、JGJ继承Wine，并且重写了drink()、toString()方法，
 程序运行结果是调用子类中方法，输出JNC、JGJ的名称，这就是多态的表现。
 不同的对象可以执行相同的行为，但是他们都需要通过自己的实现方式来执行，这就要得益于向上转型了
*/
