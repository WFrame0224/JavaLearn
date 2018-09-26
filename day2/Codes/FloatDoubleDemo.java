public class FloatDoubleDemo 
{
	public static void main(String[] args) 
	{
		double a = 5.2;
		double b = 3.1;
		double div = a / b;
		System.out.println(div);
		System.out.println("5除以0.0的结果是：" + 5 / 0.0);
		System.out.println("-5除以0.0的结果是：" + -5 / 0.0);

		//下面代码出现异常：Exception in thread "main" java.lang.ArithmeticException: / by zero
		//System.out.println("-5除以0.0的结果是：" + -5 / 0);
		double mod = a % b;
		System.out.println(mod);
		System.out.println("5对0.0求余的结果是：" + 5 % 0.0);// 输出为非数：NaN
	}
}
