//�����������
class  OverloadDemo
{
	//����������֮��
	static int getSum(int a,int b)
	{
		return a+b;
	}
	//������С��֮��
	static double getSum(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(OverloadDemo.getSum(1,3));

		System.out.println(OverloadDemo.getSum(1.0,3.0));
	}
}
