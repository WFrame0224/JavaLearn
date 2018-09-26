import java.util.Arrays;


//����Java�Դ���Arrays��
class  ArraysDemo
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3,2,1,4,-6,8,9,7,0};
		int[] arr1 = {3,2,1,4,-6,8,9,7,0};

		//ʹ��ע�⣺
		//����java.util.Arrays.����(����);������û��ʹ��import ����²��õĲ���

		// �Ƚ�����Ԫ���Ƿ����
		System.out.println("arr��arr1���������Ƿ���ȣ�" + Arrays.equals(arr,arr1));
		System.out.println("=====================");

		//��ӡ����Ӧ������
		String ret = Arrays.toString(arr);
		System.out.println(ret);
		System.out.println("=====================");

		//�����Ӧ������--��������
		System.out.println("����������Ϊ��");
		//java.util.Arrays.sort(arr,2,6);  // ����д����û�е���java.util.Arrys��
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("=====================");

		// Ѱ�Ҷ�ӦԪ�ص�����ֵ
		int index = Arrays.binarySearch(arr,3);
		System.out.println("Ԫ�� " + 3 + " ������Ϊ��" + index); 
		System.out.println("=====================");

		// �Ƚ�����Ԫ���Ƿ����
		System.out.println("arr��arr1���������Ƿ���ȣ�" + Arrays.equals(arr,arr1));
		System.out.println("=====================");

		// ��������Ԫ��
		int[] b = Arrays.copyOf(arr1,11);
		System.out.println(Arrays.toString(b));
		System.out.println("=====================");

		// ָ��������Χ��ֵ
		Arrays.fill(b,8,11,2);
		System.out.println(Arrays.toString(b));
		System.out.println("=====================");

		// java8 Arrays�����͵ķ���
		// ������arr1���в�������
		int[] brr1 = new int[]{3, -4, 25, 16, 30, 18};
		Arrays.parallelSort(brr1);
		System.out.println(Arrays.toString(brr1));

		/*
		int[] brr2 = new int[]{3, -4, 25, 16, 30, 18};
		Arrays.parallelPrefix(brr2, new IntBinaryOperator()
		{
			// left����������ǰһ����������Ԫ�أ������һ��Ԫ��ʱ��leftΪ1
			// right ���������е�ǰ��������Ԫ��
			public int applyAsInt(int left,int right)
			{
				return left*right;
			}
		});
		*/

	}
}
