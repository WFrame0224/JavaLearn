//��ʾ����
class Person
{
	String name = null;//�˵�����
	int age = 0;
	
	static int height = 0;//�˴�����֤��Static���η�������
	// int height = 0;

	//�Զ��幹����
	//�������������ʾ����������ʱ���������ٹ���ȱʡ������
	Person()
	{
		System.out.println("-----*******---------");
	}
	Person(String n,int a)
	{
		//���ù��캯�����Գ�ʼ������
		name = n;
		age = a;
		System.out.println(name +", "+age);
	}

}
//��ʾ�Զ��幹������
class  PersonDemo
{
	public static void main(String[] args) 
	{
		//��������ʵ�����ڵ��ù�����
		/*
			Person p = new Person();
			p.name = "hello";/ 
		*/
//		Person p = new Person();
		Person p = new Person("Frame",20);
		Person.height = 177;
		System.out.println("name: " + p.name + ",age: "+p.age);
		
		System.out.println(Person.height);//ֱ�Ӳ��õ����������ʵģ��������static���Σ����Բ���������ֱ�ӷ���
		System.out.println(p.height);	  //static��������static�����Ƽ�ʹ�� ����.����/���� ʹ��
	}
}
