//�����Ŀɱ����------ע�⣺ֻ�ǲ����ĸ����ɱ䣬�������Ϳɱ䣬
//���ҿɱ����������Ϊ���������һ������,Ϊ�˱������������---���ۣ�������������һ���ɱ����
//��ʵ��Ҳ�Ǳ��������Ż�
class VarArgsDemo 
{
	public static void main(String[] args) 
	{
		//double[] ps = new double[]{10.0,20.0,30.0,40.0,50.0};
		double sum = getSum(0.5,10.0,20.0,30.0,40.0,50.0,60.0,70.0,100.0);//�����Ŀɱ����
		//double sum = getSum(10.0,20.0,true,40.0,50.0,60.0,70.0);//���Ǵ���ģ��������͸ı���
		System.out.println("�ܺ�Ϊ��" +sum);
	} 

	//static double getSum(double[] ps)//���淽���Ĳ�������
	static double getSum(double cutoff,double ... ps)//�����Ŀɱ����
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
