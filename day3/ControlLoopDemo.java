class ControlLoopDemo 
{
	public static void main(String[] args) 
	{
	
	//break
	/*
		//��1�����10
		for(int i = 1;i <= 10;i ++)
		{
			//������7������ֹѭ��
			System.out.println(i);
			if(i == 7)
			{
				break;
			}
		}
		System.out.println("ending......");
	*/
	/*
		�������100��������3�ı�������ӡ�������
		       3 6 9 12 15 ...
	*/
	/*
		int i = 1,
			num = 0;
		for(i = 1;i <= 100;i ++)
		{
			if(i % 3 == 0)
			{
				num ++;
				System.out.print(i + "\t");
			}
			if(num ==5)
			{
				break;
			}
		}
		System.out.println("\n------------------------");
		System.out.print(num);
	*/
	//continue
	/*
		int i = 1,
		num = 0;
		for(i = 1;i <= 100;i ++)
		{
			if((i == 4) || (i == 13) || (i % 3 == 0))
			{
				num ++;
				continue;	
			}
			System.out.print(i + "\t");
		}
		System.out.println("\n------------------------");
		System.out.print(num);
	*/
	//return :�������ڵķ���

		int i = 1,
		num = 0;
		for(i = 1;i <= 100;i ++)
		{
			if((i == 4) || (i == 13) || (i % 3 == 0))
			{
				num ++;
				return;	//ע��η����еĺ������費��ִ�У�������������ͬ�� break
			}
			System.out.print(i + "\t");
		}
		System.out.println("\n------------------------");
		System.out.print(num);
	}
}
