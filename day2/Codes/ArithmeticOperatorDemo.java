class  ArithmeticOperatorDemo
{
	public static void main(String[] args) 
	{
		int a = 1;
		System.out.println(a ++);
		System.out.println(a);

		System.out.println("=============右加=================");
		int b = 5;
		int c = b ++ + 6;
		System.out.println(b + "\n" + c);
		System.out.println("=============左加=================");
		b = 5;
		c = ++ b + 6;
		System.out.println(b + "\n" + c);

		System.out.println("=============浮点数自加=================");
		double d = 3.1;
		for (int i = 0; i < 10 ; i ++ )
		{
			System.out.println(d ++);
		}
	}
}
 