class FinalVarDemo 
{
	static final String NAME = "Maical";//final���εı���==������������ʾ�س�ʼ��
	public static void main(String[] args) 
	{
		//NAME = "Linc";//�����������final���εı����޷����¸�ֵ
		//System.out.println(NAME);
		final Person p = new Person(); 
		System.out.println(p.info);
		p.info = "xxxx";
		System.out.println(p.info);
		//p = new Person();//�����������-->�ɼ����õ�ַ�����Ա䣬�������ݿ��Ա�
	}
}
class Person
{
	public String info = "�����ֵ";
}
