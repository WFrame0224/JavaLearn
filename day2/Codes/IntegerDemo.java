public class IntegerDemo  
{
	public static void main(String[] args) 
	{
		byte a = 127 ;
		System.out.println(a);
		short sValue = 5;
		//sValue = sValue - 2;	//此处代码错误，自动提升为int类型，无法赋值给short类型，只有采用强制类型转换才可以
		sValue = (short)(sValue - 2);
	}
}
