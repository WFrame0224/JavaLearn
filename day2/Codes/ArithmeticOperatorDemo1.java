//��Ԫ�����
class ArithmeticOperatorDemo1 
{
	public static void main(String[] args) 
	{
		//���淽���󣺸�һ��С������Ҫ�������������֮��Ľ����
		double num = 3.4999999;
		System.out.println("���������ݣ�\n"+num);
		System.out.println("----------------");


		System.out.println("�����̣�\n");
		int numInteger = (int)num;
		System.out.println("IntegerNum��"+numInteger);
		double numDecimal = num - numInteger;
		System.out.println("DecimalNum��"+numDecimal);
		System.out.println("----------------");
		if (numDecimal >= 0.5)
		{
			System.out.println("����������Ϊ��\n"+(numInteger+1));
			System.out.println("----------------");
		}
		else
		{
			System.out.println("����������Ϊ��\n"+numInteger);
			System.out.println("----------------");
		}
		
		//������Ԫ������ķ���
		int result = numDecimal >=0.5 ? (numInteger+1) : numInteger;
		System.out.println("����������Ϊ��\n"+result);
		System.out.println("----------------");

	}
}
