//���ڲ����Լ��������
class ArrayUtilDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,2,1,4,-6,8,9,7,0};
		ArrayUtil.printArray(arr);
		System.out.println("======================");
		//����4������
		//�Ƚ�������
		ArrayUtil.bubbleSort(arr);
		ArrayUtil.printArray(arr);
		System.out.println("----------------------");
		//����
		System.out.println("������Ԫ��Ϊ4������λ��Ϊ��"+ArrayUtil.search(arr,4));


	}
}
