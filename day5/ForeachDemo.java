//��ǿforѭ��--foreach
class ForeachDemo 
{
	public static void main(String[] args) 
	{
		int[] num = new int[]{10,20,30,40,50};
		//����ʹ��ѭ��������������ÿһ��Ԫ��
		for (int index = 0;index < num.length ;index ++ )
		{
			System.out.println(num[index]);
		}
		System.out.println("==============");
		//��ǿ��forѭ��
		/**
			for(����Ԫ������ ���� : ������)
			{
				ѭ����
			}
         ���������빤�߲鿴�ֽ��룬����foreach��ʵ�ڵײ���Ȼʹ�� forѭ��+ ����
		 ����������ģ����ǰ���ǿforѭ������Ϊ��������������-->�﷨�ǡ�
		 �����������Ԫ�أ��������������������ʱ����ѡforeach
		*/
		for(int ele : num)
		{
			System.out.print(ele + " ");
		}
		System.out.println("============================");
		String[]  strs = new String[]{"��������ҵ�����"};
		for ( String str : strs)
		{
			System.out.println(str);
		}
	}
}
