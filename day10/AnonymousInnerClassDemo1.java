abstract class Device
{
	private String name;
	public abstract double getPrice();
	public Device(){}
	public Device(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void accessPartFildes(){}
}
public class AnonymousInnerClassDemo1
{
	// �������Ա
	static int age = 20;
	int age1 = 20;
	// ����һ��Deive���͵ı���
	public void test(Device d)
	{
		System.out.println("������һ��" + d.getName() + ", ������" + d.getPrice());
	}
	public static void main(String[] args) 
	{
		String var = "-----�ֲ�����------";
		// ����һ��ʵ��
		AnonymousInnerClassDemo1 ai = new AnonymousInnerClassDemo1();
		// �����в����Ĺ���������Device����ʵ����Ķ���
		ai.test(new Device("����ʾ����")
		{
			// ʵ��Device �ĳ��󷽷�
			public double getPrice()
			{
				return 67.8;
			}
		});
		// �����޲����Ĺ���������Device����ʵ����Ķ���
		Device d = new Device(){
			// ��ʼ����
			{
				System.out.println("�����ڲ���ĳ�ʼ����");
			}
			// ʵ�ַ���
			public double getPrice()
			{
				return 56.2;
			}
			// ��д�����ʵ������
			public String getName()
			{
				return "����";
			}
			public void accessPartFildes()
			{
				// ��java8 ��ǰ���������佫����var ����ʹ��final ���Σ�
				// ��java8 ��ʼ�������ڲ���������ʷ�final���ε��ڲ�������java8��������
				System.out.println(var);
				// ������һ�仰�������ڲ�������˾ֲ��������þֲ������Զ�ʹ����final ���Σ���˳�ʼ��֮���޷��޸�
				//var = "������";
				/**
					AnonymousInnerClassDemo1.java:56: ����: ���ڲ������õı��ر������������ձ�����ʵ���ϵ����ձ���
						var = "������";
						^	
					1 ������
				 */

				System.out.println("���ʵ����ⲿ��ľ�̬��Ա����" + age);
				//System.out.println("���ʵ����ⲿ��ķǾ�̬��Ա����" + age1);//�������,������Ϊ��������static ���ε�main������˵�������ڲ����������ʹ˷�����һ����
				/**
					AnonymousInnerClassDemo1.java:71: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� age1
								System.out.println("���ʵ����ⲿ��ķǾ�̬��Ա����" + age1);//�������
				                                       ^
										1 ������
				 */
			}
		};
		d.accessPartFildes();
		ai.test(d);
	}
} 

