class ArrayUtil
{
	//1）：必须在该类中，自己先创建一个对象
	private static final ArrayUtil instance = new ArrayUtil();
	//2）：私有化自身的构造器，防止外界通过构造器创建新的对象
	private ArrayUtil()
	{}
	//3）：向外暴露一个公共的静态方法用于获取自身的对象
	public static ArrayUtil getInstance()
	{
		return instance;
	} 

	public void sort(int[] arr)
	{
		System.out.println("排序操作");
	}
}
//单例
class SingletonDemo 
{
	public static void main(String[] args) 
	{ 
		//需要做排序1:不同一个类中
		ArrayUtil.getInstance().sort(null);
		//需要做排序2:不同一个类中
		ArrayUtil.getInstance().sort(null);
		//需要做排序3:不同一个类中
		ArrayUtil.getInstance().sort(null);
		//需要做排序4:不同一个类中
		ArrayUtil.getInstance().sort(null);
	}
}
/**
写单例模式的步骤：单讲饿汉式
	1）：必须在该类中，自己先创建一个对象
	2）：私有化自身的构造器，防止外界通过构造器创建新的对象
	3）：向外暴露一个公共的静态方法用于获取自身的对象
*/