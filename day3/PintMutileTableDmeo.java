/*�������9x9�˷���ͼ��
         1 * 1 =1
		 1 * 2 =2 2 * 2 = 4
		 1 * 3 =3 2 * 3 = 6 3 * 3 = 9
		 1 * 4 =4 2 * 4 = 8 3 * 4 = 12 4 * 4 =16
		 ���ɣ��ڶ���������������ͬ����һ������ <= �ڶ�������
*/
class  PintMutileTableDmeo
{
	public static void main(String[] args) 
	{
		int i = 0, //�б���--��һ������
			j = 0; //�б���--�ڶ�������
		for(i = 1;i <= 9;i ++ )
		{
			for(j = 1;j <= i;j++)
				System.out.print(j +" * "+ i + " = " + (i * j)+"\t");//������
			System.out.println();//����
		}
	}
}