//����������ֵ���ݻ���֮������������
class ParameterDemo1 
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);
		ParameterDemo1.change(x);//���ݵ�ֻ�ǻ����������� ֵ�ĸ���������ֵ����
		System.out.println(x);
	}
	static void change(int x)
	{
		System.out.println("����change֮��x��ֵ"+x);
		x = 50;
		System.out.println("��ֵ֮��x��ֵ"+x);
	}
}
