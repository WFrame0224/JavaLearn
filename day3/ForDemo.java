class ForDemo 
{
	public static void main(String[] args) 
	{
		/*
			ִ��˳��
					1������ʼ�����
					2����boolean���ʽ��
								true:�����������
								false:����ѭ����
					3����ִ��ѭ����
					4����ִ��ѭ��֮��Ĳ������
					5��������ڶ���
					ע�⣺��ʼ�����ִֻ��һ��

		*/
		
		int i = 0,sum = 0;
		for(i = 0;i < 5;i ++)
		{
			System.out.println("Hello World!");
		}
		System.out.println("====================");

		for(i = 1;i <= 100;i ++)
		{
			System.out.println(i);
		}
		System.out.println("====================");

		for(i = 1;i <= 100;i ++)
		{
			sum += i;
		}
		System.out.println("sum = "+ sum +", i = "+ i );
		System.out.println("====================");	

	}
}
