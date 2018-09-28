/**
	�˳���ʾ����Lambda���ʽ�ļ��ּ�д��
 */
interface Eatable
{
	void taste();
}
interface Flyable
{
	void fly(String weather);
}
interface Addable
{
	int add(int a,int b);
}
public class LambdaDemo1 
{
	// ���ø÷�����ҪEatable����
	public void eat(Eatable e)//�����Ͽ����ø÷�����Ҫһ��Eatable���͵Ĳ�����������ĳ���ʵ�ʴ����ȴ��һ��Lambda���ʽ
	{
		System.out.println(e);
		e.taste();
	}
	// ���ø÷�����ҪFlyable����
	public void drive(Flyable f)//�����Ͽ����ø÷�����Ҫһ��Flyable���͵Ĳ�����������ĳ���ʵ�ʴ����ȴ��һ��Lambda���ʽ
	{
		System.out.println("�����ڼ�ʻ��" + f);
		f.fly("�̿���ϴ������");
	}
	// ���ø÷�����ҪAddable����
	public void test(Addable add)//�����Ͽ����ø÷�����Ҫһ��Addable���͵Ĳ�����������ĳ���ʵ�ʴ����ȴ��һ��Lambda���ʽ����ʵ���ϻᱻ����һ�����������͵Ķ���
	{
		System.out.println("5��3�ĺ�Ϊ��" + add.add(5,3));
	}
	public static void main(String[] args) 
	{
		LambdaDemo1 ld1 = new LambdaDemo1();
		// Lambda���ʽ�Ĵ����ֻ��һ����䣬����ʡ�Ի�����
		ld1.eat(()->System.out.println("ƻ����ζ������"));
		// Lambda���ʽ���β��б�ֻ��һ���βΣ�����ʡ��Բ����
		ld1.drive(weather->{
			System.out.println("����������ǣ�" + weather);
			System.out.println("ֱ��������ƽ��");
		});
		// Lambda���ʽ�еĴ����ֻ��һ����䣬����ʡ�Ի�����
		// �������ֻ��һ����䣬��ʹ�ñ��ʽ��Ҫ����ֵ��Ҳ����ʡ��return �ؼ���
		ld1.test((int a, int b)->a + b);
	}
}
