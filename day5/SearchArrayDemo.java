//����������㷨����ָ��������ȥ����ĳһ��Ԫ�ص������Ƕ���
/**
	��ʽ1��������������ͷ������β/��β������ͷ��������Ԫ�ع�������飬���ܼ��ͣ�ѭ������=(N+1)/2
	��ʽ2������������/���ֲ��ҷ�������ǰ���Ǳ��������������
*/
class SearchArrayDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		int number = 7;
		int index = SearchArrayDemo.search(arr,number);
		if(index != -1)
		{
			System.out.println("����������Ԫ�� "+number+" ��λ��Ϊ��"+index);
		}else
		{
			System.out.println("�����������������û��Ԫ��"+number);
		}
	}
	static int search(int[] arr,int number)
	{
		int low = 0,high = arr.length;
		int mid = (low + high) >> 1;//����һλ == /2
		while(low <= high)
		{
			//System.out.println(low+"----"+high);//���ڲ鿴���ҹ���
			if(arr[mid] > number)
			{
				high = mid-1;
				mid = (low + high) >> 1;
			}else if(arr[mid] < number)
			{
				low = mid+1;
				mid = (low + high) >> 1;
			}else
			{ 
				return mid;
			}
		}
		return -1;
	}
}
