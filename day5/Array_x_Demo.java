// ��ά�������������
public class Array_x_Demo 
{
	public static void main(String[] args) 
	{
		int[][] a; //����һ����ά����
		a = new int[4][]; // ��a����һά������г�ʼ������ʼ��a��һ������Ϊ4�����飬a���������Ԫ��������������
		for (int i = 0 ; i < a.length ; i ++ )
		{
			System.out.println(a[i]);
		}
		//��ʼ��a����ĵ�һ��Ԫ��
		a[0] = new int[2];
		// ����aԪ�صĵ�һ��Ԫ����ָ����ĵڶ���Ԫ��
		a[0][1] = 6;
		for (int i = 0; i < a[0].length ; i ++)
		{
			System.out.println(a[0][i]);
		}
		// �ٴδ�ӡ����ʱ�Ķ�ά���飬���Կ�������һ������Ԫ�ز�ΪNull,��������Ԫ�ض�ΪNull
		for (int i = 0 ; i < a.length ; i ++ )
		{
			System.out.println(a[i]);
		}
		int[][] b = new int[3][4];
		for (int i = 0 ; i < b.length ; i++)
		{
			System.out.println(b[i]);
		}

	}
}
