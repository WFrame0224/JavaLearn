//do while Ñ­»· 
class dowhileDemo 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int sum = 0;
		do
		{
			System.out.println("Hello World!");
			i++;
		}
		while (i < 5);
		System.out.println("===================");

		i = 1;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i <= 100);
		System.out.println("===================");

		i = 1;
		do
		{
			sum += i;
			i++;
		}
		while (i <= 100);
		System.out.println("sum = "+sum+" , i = "+i);

	}
}
