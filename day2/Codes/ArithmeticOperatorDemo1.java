//三元运算符
class ArithmeticOperatorDemo1 
{
	public static void main(String[] args) 
	{
		//常规方法求：给一个小数，需要求出其四舍五入之后的结果；
		double num = 3.4999999;
		System.out.println("给定的数据：\n"+num);
		System.out.println("----------------");


		System.out.println("求解过程：\n");
		int numInteger = (int)num;
		System.out.println("IntegerNum："+numInteger);
		double numDecimal = num - numInteger;
		System.out.println("DecimalNum："+numDecimal);
		System.out.println("----------------");
		if (numDecimal >= 0.5)
		{
			System.out.println("四舍五入结果为：\n"+(numInteger+1));
			System.out.println("----------------");
		}
		else
		{
			System.out.println("四舍五入结果为：\n"+numInteger);
			System.out.println("----------------");
		}
		
		//采用三元运算符的方法
		int result = numDecimal >=0.5 ? (numInteger+1) : numInteger;
		System.out.println("四舍五入结果为：\n"+result);
		System.out.println("----------------");

	}
}
