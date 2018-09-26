//方法的可变参数------注意：只是参数的个数可变，而非类型可变，
//并且可变参数必须作为方法的最后一个参数,为了避免参数的歧义---推论：方法最多可以有一个可变参数
//其实际也是编译器的优化
class VarArgsDemo 
{
	public static void main(String[] args) 
	{
		//double[] ps = new double[]{10.0,20.0,30.0,40.0,50.0};
		double sum = getSum(0.5,10.0,20.0,30.0,40.0,50.0,60.0,70.0,100.0);//方法的可变参数
		//double sum = getSum(10.0,20.0,true,40.0,50.0,60.0,70.0);//这是错误的，参数类型改变了
		System.out.println("总和为：" +sum);
	} 

	//static double getSum(double[] ps)//常规方法的参数设置
	static double getSum(double cutoff,double ... ps)//方法的可变参数
	{
		double sum = 0.0;
		/*
		for(int index = 0;index < ps.length;index ++)
		{
			sum += ps[index];
		}
		*/
		for(double ele : ps)
		{
			sum += ele;
		}
		return sum * cutoff;
	}
}
