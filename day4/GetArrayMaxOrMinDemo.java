class GetArrayMaxOrMinDemo 
{
	//����������ֵ�����ҷ��ظ�ֵ
	static int arrayMax(int[] num)
	{
		int Max = num[0];
		for(int i = 1;i < num.length;i++)
		{
			if(Max < num[i])
			{
				Max = num[i];
			}
		}
		return Max;
	}
	//���������Сֵ�����ҷ��ظ�ֵ
	static int arrayMin(int[] num)
	{
		int Min = num[0];
		for(int i = 1;i < num.length;i++)
		{
			if(Min > num[i])
			{
				Min = num[i];
			}
		}
		return Min;
	}
	public static void main(String[] args) 
	{
		int[] num = new int[]{1,-9,-2,6,4,5,3,8,7,0};
		int retMax = GetArrayMaxOrMinDemo.arrayMax(num);
		System.out.println("��������ֵΪ��" + retMax);
		int retMin = GetArrayMaxOrMinDemo.arrayMin(num);
		System.out.println("�������СֵΪ��" + retMin);

	}
}
