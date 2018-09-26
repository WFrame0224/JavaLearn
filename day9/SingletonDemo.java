class ArrayUtil
{
	//1���������ڸ����У��Լ��ȴ���һ������
	private static final ArrayUtil instance = new ArrayUtil();
	//2����˽�л�����Ĺ���������ֹ���ͨ�������������µĶ���
	private ArrayUtil()
	{}
	//3�������Ⱪ¶һ�������ľ�̬�������ڻ�ȡ����Ķ���
	public static ArrayUtil getInstance()
	{
		return instance;
	} 

	public void sort(int[] arr)
	{
		System.out.println("�������");
	}
}
//����
class SingletonDemo 
{
	public static void main(String[] args) 
	{ 
		//��Ҫ������1:��ͬһ������
		ArrayUtil.getInstance().sort(null);
		//��Ҫ������2:��ͬһ������
		ArrayUtil.getInstance().sort(null);
		//��Ҫ������3:��ͬһ������
		ArrayUtil.getInstance().sort(null);
		//��Ҫ������4:��ͬһ������
		ArrayUtil.getInstance().sort(null);
	}
}
/**
д����ģʽ�Ĳ��裺��������ʽ
	1���������ڸ����У��Լ��ȴ���һ������
	2����˽�л�����Ĺ���������ֹ���ͨ�������������µĶ���
	3�������Ⱪ¶һ�������ľ�̬�������ڻ�ȡ����Ķ���
*/