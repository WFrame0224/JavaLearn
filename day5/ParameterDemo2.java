//����������ֵ���ݻ���֮������������
class ParameterDemo2  
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{10,99,55};
		ParameterDemo2.printArray(arr);
		ParameterDemo2.swap(arr,0,arr.length-1);//������һ�������һ��Ԫ�ص�ֵ
		ParameterDemo2.printArray(arr);
	}
	/*
		ע�⣬����swap����ʱ����ջ�ռ��п�����һ���µ�����swap������ջ֡
		�����main�����е�arr�����õĵ�ֵַ��0x****������һ�ݣ��Ѹ���֮��ĸ���
		���ݸ�swap������arr��������ʵ�ʶ��Ƕ�ԭ�����ͬһ�� �� ������в�������Ȼ
		��ı����飨��ͬ��ֵ���ݻ����������ͣ�������������ֻ�ǿ��� ջ�ռ䣬���� �ѿռ�
		�����ܹ��ı�ԭ������ֵ��
	*/
	//������i���͵�j��Ԫ�ص�ֵ
	static void swap(int[] arr,int i,int j)
	{
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

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
