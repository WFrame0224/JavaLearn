class  SwapVarDemo 
{
	public static void main(String[] args) 
	{
		//��ʱ������
		int a = 10,b = 12;
		System.out.println("a="+ a +",b="+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a="+ a +",b="+b);
		System.out.println("===================");

		//��������˼ά��
		a = 1;b = 2;
		System.out.println("a="+ a +",b="+b);
		a = b - a;//�õ�a,b��ľ���
		b = b - a;//�õ�ԭ��a�ľ���
		a = b + a;//�õ�ԭ��b�ľ���
		System.out.println("a="+ a +",b="+b);
		System.out.println("===================");

		//λ�������
		System.out.println(100 ^ 5 ^ 5);//��������ͬʱȡ ��� ���㣬ԭֵ����

		a = 3;b = 4;
		System.out.println("a="+ a +",b="+b);
		a = a ^ b;//���ٴ����b����õ�ԭaֵ
		b = a ^ b;//�õ�ԭaֵ(�������b)
		a = a ^ b;//�õ�ԭbֵ(�������a)
		System.out.println("a="+ a +",b="+b);


	}
}
