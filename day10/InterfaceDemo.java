//����һ�����ж���ӿ� 
interface IWalkable
{
	//IWalkable(){}//�ӿ���û�й�����

	// �ӿ��еĳ�Ա����ֻ���Ǿ�̬���� Ĭ���Ѿ���  public static final 
	// ������������ͬ�ڣ�public static final String abc = "abc";
	String abc = "abc";
	/**
		�ӿ��ж���ķ���ֻ���ǣ����󷽷����෽����static���Σ�����Ĭ�Ϸ���
		��ˣ�������Ƕ���Ĭ�Ϸ�����ϵͳ���Զ�Ϊ��ͨ��������abstract���η������ӿ��ж�����ͨ����ʱ�����Զ�ʹ��public abstract���η��������ͨ���������з�����
	 */
	void walk();

	//�ڲ���
	interface ABC	//�����빤�߿ɼ����ӿ��ж�����ڲ��඼�ǹ����ľ�̬�ڲ��࣬��public static interface ABC{}
	{
	}
	// �ڽӿ��ж���Ĭ�Ϸ�����Ҫʹ��default����
	default void DEF()
	{
		System.out.println("------------hello I am default method-------------");
	}
}
//����һ��ˮ������ӿ� 
interface ISwimable
{
	// ��ʱ���� public abstract void swim()
	void swim();
	public static void ISCharacter()
	{
		System.out.println("--------hello I am a static method-----------");
	}
}
//����һ�����ܶ���ӿ� 
interface IAnimal extends IWalkable,ISwimable//Java�нӿڿ���ʵ�ֶ�̳У������಻����
{

}
//è
class Cat extends Object implements IWalkable // �̳�˳��ʵ��
{
	public  void walk()//ע�⣺�ӿ��еķ����ǳ���ģ�����ʵ������븲�ǽӿ��еķ������ұ���ʹ��public����
	{
		System.out.println("hello Catty!!!");
	}
}
//��
class Fish extends Object implements ISwimable
{
	public void swim()
	{
		System.out.println("hello Fish!!!");
	}
}
//����
class Frog extends Object implements IWalkable,ISwimable
{
	public  void walk()//ע�⣺�ӿ��еķ����ǳ���ģ�����ʵ������븲�ǽӿ��еķ������ұ���ʹ��public����
	{
		System.out.println("Wow Frog!!!");
	}
	public void swim()
	{
		System.out.println("Wow Frog!!!");
	}
}

//����
class Crocodile extends Object implements IAnimal
{
	public  void walk()//ע�⣺�ӿ��еķ����ǳ���ģ�����ʵ������븲�ǽӿ��еķ������ұ���ʹ��public����
	{
		System.out.println("Watch out,Crocodile!!!");
	}
	public void swim()
	{
		System.out.println("Watch out,Crocodile!!!");
	}
}

//��ʾ�ӿ�
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		//new IWalkable();// ����: IWalkable�ǳ����; �޷�ʵ����
		IWalkable c = new Cat();//����ӿڱ�̣��������ֶ�̬����
		//Cat c = new Cat();//�˷��� Ӧ������
		c.walk();//�������ֶ�̬����,����ʵ�����еķ���
		c.DEF();
		//c.abc = "def";
		/**
			InterfaceDemo.java:77: ����: �޷�Ϊ���ձ���abc����ֵ
				c.abc = "def";
					  ^
		 */
		ISwimable.ISCharacter();
		ISwimable f = new Fish();
		f.swim();
		
		Frog ff = new Frog();//����ӿڱ��ʱ����������---��ʲô���������ö�Ӧ�ӿڣ�����ȫ�ã�ֱ�Ӷ�������������
		ff.walk();
		ff.swim();

		IAnimal cr = new Crocodile();//��ͬ�����棬�����������ӿڱ��
		cr.walk();
		cr.swim();
	}
}
