class  ArrayCopyDemo
{
	public static void main(String[] args) 
	{
		int[] src = new int[]{1,2,3,4,5,6,7,8,9,10};//Դ����
		int[] dest = new int[src.length];//Ŀ������

		System.out.println("Դ����Ϊ��");
		ArrayCopyDemo.printArray(src);
		System.out.println("����ǰ��Ŀ������Ϊ��");
		ArrayCopyDemo.printArray(dest);
		System.out.println("--------------------");
		//���󣺽�Դ���鿽����Ŀ������
		//ArrayCopyDemo.copyArray(src,dest,2,4,4);//�Լ���д�ķ���

		/*
		public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
		*/
		System.arraycopy(src,2,dest,4,4);//������ϵͳ�Դ��ķ���
		
		System.out.println("�������Ŀ������Ϊ��");
		ArrayCopyDemo.printArray(dest);
	}

	/*copyArray �������飬��ѡ����λ�ã����ȣ�����ȱ�ٱ�Ҫ�����ݷ�Χ�ļ��
	������
			src:		Դ����
			dest:		Ŀ������
			srcPos:		��Դ�����п�����ʼλ��
			destPos:	��Ŀ�������п�ʼճ����λ��
			copyLength������Ԫ�صĳ���
	*/
	static void copyArray(int[] src,int[] dest,int srcPos,int copyLength,int destPos)
	{
		for(int index = srcPos;index < srcPos+copyLength;index ++ )
		{
			//dest[destPos+(index-srcPos)] = src[index];
			dest[destPos] = src[index];
			destPos ++;
		}
	}
	
	//��ӡ������
	static void printArray(int[] num)
	{
		if(num == null)
		{
			System.out.println("Error------");
			return;
		}
		System.out.print("[");
		for (int i = 0;i < num.length;i ++ )
		{
			if(i != num.length-1)
			{
				System.out.print(num[i]+",");
			}else
			{
				System.out.print(num[num.length-1]);
			}
		}
		System.out.print("]\n");
	}
}
