class  whileDemo
{
	public static void main(String[] args) 
	{
		int sum = 0,i = 5;
		while(i >= 1)
		{
			System.out.println("Hello World!");
			i--;	
		}
		System.out.println("===============");
		i = 1;
		while(i <= 100)
		{
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
	}
}
