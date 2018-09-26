class  ArrayDemo
{
	public static void main(String[] args) 
	{
		//静态初始化操作
		//int age[] = {1,3,4,5,6,7};//直接初始化
		int[] age;
		age =new int[]{1,3,5,7,9};//先声明后初始化，注意不能写为简写 age = {1,3,5,7,9};,编译会报错
		int[] ags =new int[]{1,2,3,4,5,6};
		System.out.println(age[3]);
		System.out.println(ags[3]);
		System.out.println("age数组长度为："+age.length);//注意Java中可以直接得到数组长度
		//动态初始化操作
		int[] nums = new int[10];
		System.out.println("----------------------");
		System.out.println("数组长度为："+nums.length);
		nums = new int[3];
		System.out.println("----------------------");
		System.out.println("数组长度为："+nums.length);
		/*
		nums = null;
		System.out.println("----------------------");
		System.out.println("数组长度为："+nums.length);
		//以上注释代码会有空指针异常
		*/

		//int[] num1 = new int[5]{1,3,5,7,9}; //XX Java中不允许动态和静态混合初始化
	}
}
