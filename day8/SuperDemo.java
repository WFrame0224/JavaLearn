//����������ķ�����ȥ���ø��౻���ǵķ���
//����
class Bird
{
	public int a = 1;
	protected void fly()
	{
		System.out.println("��������,���ɷ���");
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
	public void say()
	{
		System.out.println("żҪ���衣������");
		super.fly();//ʹ��super�ؼ���
		/**
			this: ��ǰ����˭����this���ڵķ�����this ������һ������
			super:��ǰ����ĸ������
		*/
		this.fly();
	}
}
//super�ؼ���
class SuperDemo 
{
	public static void main(String[] args) 
	{
		Penguin p = new Penguin();
		p.say();
	}
}
