//�������ѭ�� �����ѭ�����������Ҫ���ϱ�ʶ���淶��
public class  ConLoopDemo
{
	public static void main(String[] args) 
	{
		int i = 0, //�б���--��һ������
			j = 0; //�б���--�ڶ�������
		outter:for(i = 1;i <= 9;i ++ )
				{
					for(j = 1;j <= i;j++)
					{
						if(i == 5)
						{
							break outter;
						}
						System.out.print(j +" * "+ i + " = " + (i * j)+"\t");//������
					}
					System.out.println();//����
				}
	}
}
