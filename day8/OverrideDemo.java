//����
class Bird
{
	public int a = 1;
	protected void fly()
	{
		System.out.println("��������,���ɷ���");
	}
	public void fly(int a)//��������
	{
		System.out.println("��������,���ɷ���");
	}
	private void love()
	{
		System.out.println("I am a bird, I can find my lover!!!");
	}
}
//���
class Penguin extends Bird
{ 
	public int a;//�ֶ�û�и���

	@Override//��ǩ�ɼӿɲ���--�жϵ�ǰ����ķ����Ƿ񸲸��˸���ķ���
	public void fly()//���ں͸�����ͬ�ķ���
	{
		System.out.println("�Բ���ż���������ʹ");
	}
	
    // �˴���love()�����Ѿ����Ǹ��෽������д����Ϊ���෽��Ϊprivate���Σ����ܱ�������ʣ�
	// ����˴�����������з����������η��Ĳ�ͬҲ���Կ���
	public void love()
	{
		System.out.println("I am a Penguin, I love my bros!!!");
	}
	
}
//����-���ǲ����ࣨ---�ֶ�û�и��ǣ�
class OverrideDemo 
{
	public static void main(String[] args) 
	{
		Bird b = new Bird();
		b.fly();
		Penguin p = new Penguin();
		p.fly();//���෽�����Ǹ��෽��-->���෽��������
		p.fly(1);//���෽���Ҳ�������������ķ�������������Ѱ�Ҹ����еķ���
		System.out.println(p.a);
		p.love();
	}
}
/**
	������д��ԭ��(һͬ��Сһ��)
		һͬ��ʵ������ǩ��������ͬ�����Խ���ֱ�ӿ�������ķ������壨����ǩ��=������+���������б�
		��С��
			1�����෽���ķ���ֵ�����Ǻ͸��෽���ķ���������ͬ����������
				�������෵�ظ��Ӿ������
			2�����෽�������׳����쳣���ͺ͸��෽�������׳����쳣������ͬ����������
		һ�����෽���ķ���Ȩ�ޱȸ��෽���ķ���Ȩ�޸���������
*/