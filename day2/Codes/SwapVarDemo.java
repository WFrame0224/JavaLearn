class  SwapVarDemo 
{
	public static void main(String[] args) 
	{
		//临时变量法
		int a = 10,b = 12;
		System.out.println("a="+ a +",b="+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a="+ a +",b="+b);
		System.out.println("===================");

		//算术几何思维法
		a = 1;b = 2;
		System.out.println("a="+ a +",b="+b);
		a = b - a;//得到a,b间的距离
		b = b - a;//得到原来a的距离
		a = b + a;//得到原来b的距离
		System.out.println("a="+ a +",b="+b);
		System.out.println("===================");

		//位运算符法
		System.out.println(100 ^ 5 ^ 5);//利用两次同时取 异或 运算，原值不变

		a = 3;b = 4;
		System.out.println("a="+ a +",b="+b);
		a = a ^ b;//若再次异或b，则得到原a值
		b = a ^ b;//得到原a值(两次异或b)
		a = a ^ b;//得到原b值(两次异或a)
		System.out.println("a="+ a +",b="+b);


	}
}
