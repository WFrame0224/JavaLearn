//�������˷�Ӷ����/�����˷�Ӷ����{״̬+��Ϊ}
class Servant
{
	String name;//����
	int age;//����

	void shoping()
	{
		System.out.println("��ˡ�����");
	}
	void cook()
	{
		System.out.println("����������");
	}
	void washing()
	{
		System.out.println("ϴ�롣����");
	}
}
//����Ա
class Coder
{
	void coding()
	{
		System.out.println("����д����");
	}
}
//Servant��Ĳ���
public class ServantDemo
{
	public static void main(String[] args) 
	{
		//����һ����Ӷ����
		Servant s1 = new Servant();
		//����Ӷs1�����ֺ���������
		s1.name = "С��";
		s1.age = 18;

		System.out.println(s1.name+"��"+s1.age);
		//ָ��С���ɻ�
		s1.shoping();
		s1.cook();
		s1.washing();
		//����һ������Ա����
		Coder c1 = new Coder();
		//ָ�ӳ���Աд���� 
		c1.coding();
		
		//ֱ�Ӵ�ӡ�������
		System.out.println("-------------");
		System.out.println(s1);
		System.out.println(c1);
		
		Servant s2 = new Servant();
		//s2 = s1;
		/*
			==�ţ�
					1)���ڻ�������������˵���Ƚϵ���ֵ
					2)������������������˵���Ƚϵ����ڴ��еĵ�ֵַ
				ÿ��new�ؼ��֣�����ʾ�ڶ�ֵ�п�����һ���µ��ڴ�ռ�
				��ͬ���ڴ�ռ䣬��ֵַ��ͬ
		*/
		System.out.println(s1 == s2);
		new Servant();//������������ֻ�������ڴ棬��δ�ѿռ��ֵַ�����κα�������Ϊû�����ƣ���������ֻ��ʹ��һ��
	}
} 
   
