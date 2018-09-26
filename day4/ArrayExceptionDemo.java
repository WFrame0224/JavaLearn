class ArrayExceptionDemo 
{
	public static void main(String[] args) 
	{
		/*

		int[] num = null;
		System.out.println(num[1]);
		
		*/
		/*
		---------- 运行Java ----------
		Exception in thread "main" java.lang.NullPointerException
			at ArrayExceptionDemo.main(ArrayExceptionDemo.java:7)
		*/
		int[] num = new int[4];
		for(int i = 0;i < num.length;i ++)
		{
			num[i] = i;
		}
		System.out.println(num[5]);
		/*
		---------- 运行Java ----------
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
			at ArrayExceptionDemo.main(ArrayExceptionDemo.java:21)
		*/
	}
}
