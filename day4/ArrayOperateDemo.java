//����Ļ�������
class  ArrayOperateDemo
{
	public static void main(String[] args) 
	{
		int[] num = new int[]{0,2,3,4,5,6,50,9,11};
		//������ĳ���
		System.out.println("����ĳ��ȣ�"+num.length);
		System.out.println("----------------");
		//��ȡ�����Ԫ��
		System.out.print("����ĵ�һ��Ԫ���ǣ�" + num[0]);
		System.out.print("\t��������һ��Ԫ���ǣ�" + num[num.length-1]);
		System.out.println("\n-----------------");
		//���������Ԫ��
		num[0] = 100;
		System.out.println("�޸ĺ�ĵ�һ��Ԫ���ǣ�" + num[0]);
		//��ȡ���������Ԫ��--����
		for(int i = 0;i < num.length;i++)
			System.out.print(num[i] + "\t");
		System.out.println("\n-----------------");

		//boolean[] bs = new boolean[3];
		String[] bs = new String[3];
		for(int i = 0;i < bs.length;i++)
			System.out.print(bs[i] + "\t");
		System.out.println("\n-----------------");
	}
}
