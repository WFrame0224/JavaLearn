class Outter
{
	String name = "Outter.name";
	public void tryAccesInner()
	{
		System.out.println(new Inner().age);//3���ⲿ���Ա����ֱ�ӷ����ڲ���ĳ�Ա������ͨ���ڲ����ʵ�����ʣ�
	}
	//ʵ���ڲ���
	class Inner
	{
		//4��ʵ���ڲ��಻�ܶ��徲̬��Ա��ֻ�ܶ���ʵ����Ա,��static��
		 int age = 17;
		String name = "Inner.name";
		 public void test()
		{
			String name = "Local.name";
			System.out.println(name);//���ʷ����ڵľֲ���Ա����
			System.out.println(this.name);//�����ڲ����ͬ����Ա����
			System.out.println(Outter.this.name);//�����ⲿ���ͬ����Ա�����ķ���
		 }
	}
}
//ʵ���ڲ������ʾ
class InstanceInnerClassDemo
{
	public static void main(String[] args) 
	{
		//1������ʵ���ڲ���֮ǰ����������ⲿ�����ͨ���ⲿ����󴴽��ڲ�����󣨵������ڲ������ʱһ�������ⲿ�����
		//����Inner�Ķ���
		 Outter out = new Outter();
		 Outter.Inner in = out.new Inner();//Ҳ����дΪ��Outter.Inner in = new Outter().new Inner();
		 System.out.println(in);
		 in.test();
	}
}
/**
	�ص㣺
		1������ʵ���ڲ���֮ǰ����������ⲿ�����ͨ���ⲿ����󴴽��ڲ�����󣨵������ڲ������ʱһ�������ⲿ�����
		2��ʵ���ڲ����ʵ���Զ������ⲿ��ʵ�������ã��ڲ����Ա����ֱ�ӷ����ⲿ���Ա��
		3���ⲿ���Ա����ֱ�ӷ����ڲ���ĳ�Ա������ͨ���ڲ����ʵ�����ʣ�
		4��ʵ���ڲ��಻�ܶ��徲̬��Ա��ֻ�ܶ���ʵ����Ա
		5�����ʵ���ڲ�����ⲿ�����ͬ�����ֶλ򷽷�abc����ô�ڲ����У�
											this.abc����ʾ�����ڲ����Ա
											�ⲿ��.this.abc����ʾ�����ⲿ���Ա
*/