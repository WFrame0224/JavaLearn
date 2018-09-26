public class  OverFlowDemo
{
	public static void main(String[] args) 
	{
		String ltr = "----------------------";
		int intMax = 2147483647;
		System.out.println("intMax:"+intMax);
		System.out.println(ltr);
		intMax = intMax+1;
		System.out.println("intMax:"+intMax);
		System.out.println(ltr);
		System.out.println(ltr);

		int intMin = -2147483648;
		System.out.println("intMin:"+intMin);
		System.out.println(ltr);
		intMin = intMin-1;
		System.out.println("intMin:"+intMin);

	}
}
 