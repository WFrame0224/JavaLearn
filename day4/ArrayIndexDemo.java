/*
	����
		int[] num = {10,20,30,10,40,50,10,60};
		1������ȡ����Ԫ��10������num�е�һ�γ��ֵ�����(FirstIndexOf)
		2������ȡ����Ԫ��10������num�����һ�γ��ֵ�����(LastIndexOf)
*/
class ArrayIndexDemo
{
	//��ȡ����Ԫ�ص�һ�γ��ֵ�����
	static int FirstIndexOf(int[] num,int number)
	{
		int flag = 0,index = 0;
		for(int i = 0;i < num.length;i ++)
		{
			if(num[i] == number)
			{
				flag ++;
				index = i;
				break;
			}
		}
		if(flag == 0)
		{
			return -1;
		}else
		{
			return index;
		}
	}
	//��ȡ����Ԫ�����һ�γ��ֵ���������Ϊ����Ѱ�ҷ�
	static int LastIndexOf(int[] num,int number)
	{
		int flag = 0,index = 0;
		for(int i =0;i < num.length;i ++)
		{
			if(num[i] == number)
			{
				flag ++;
				index = i;
			}
		}
		if (flag == 0)
		{
			return -1;
		}else
		{
			return index;
		}
	}
	//��ȡ����Ԫ�����һ�γ��ֵ���������Ϊ����Ѱ�ҷ�
	static int LastIndexOf1(int[] num,int number)
	{
		int flag = 0,index = 0;
		for(int i = num.length-1;i >= 0 ;i --)
		{
			if(num[i] == number)
			{
				flag ++;
				index = i;
				break;
			}
		}
		if(flag == 0)
		{
			return -1;
		}else
		{
			return index;
		}
	}

	//������
	public static void main(String[] args) 
	{
		int[] num = {20,30,10,40,50,10,60,10};
		//int[] num = {20,30,11,40,50,11,60,11};
		int checkNumber = 10;
		int FirIndex = ArrayIndexDemo.FirstIndexOf(num,checkNumber);
		if(FirIndex != -1)
		{
			System.out.println("Ԫ��"+ checkNumber +"��һ�γ��ֵ�����Ϊ��" + FirIndex);
			System.out.println("--------------------");
		}else
		{
			System.out.println("�����в�����Ԫ��Ϊ" + checkNumber);
			System.out.println("--------------------");
		}

		int LastIndex = ArrayIndexDemo.LastIndexOf(num,checkNumber);
		if(LastIndex != -1)
		{
			System.out.println("Ԫ��"+ checkNumber +"��һ�γ��ֵ�����Ϊ��" + LastIndex);
			System.out.println("--------------------");
		}else
		{
			System.out.println("�����в�����Ԫ��Ϊ" + checkNumber);
			System.out.println("--------------------");
		}
		System.out.println("--------�����������������---------");
		LastIndex = ArrayIndexDemo.LastIndexOf1(num,checkNumber);
		if(LastIndex != -1)
		{
			System.out.println("Ԫ��"+ checkNumber +"��һ�γ��ֵ�����Ϊ��" + LastIndex);
			System.out.println("--------------------");
		}else
		{
			System.out.println("�����в�����Ԫ��Ϊ" + checkNumber);
		}
		
	}
}
